/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Lista.*;
import Lista.NodoEspectaculo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import zonaTematica.Espectaculo;

/**
 *
 * @author PROPIETARIO
 */
public class VentanaEspectaculo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEspectaculo
     */
    ListaZonaTematica listaZonaTematica;
    ListaEspectaculo listaEspectaculo;
    DefaultTableModel modelo;
    String arregloEspectaculo[] = new String[7]; 
    String btn;
    int fila;
    public VentanaEspectaculo(ListaZonaTematica lista) {
        initComponents();
        this.listaZonaTematica = lista;
        modelo = (DefaultTableModel) tbEspectaculo.getModel();
        //btnGuardar.setEnabled(false);
        //estadosTxt(false);
        //estadoTxtAgregarTipo(false);
        //listarTabla();
        listarCbZonaTematica();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void listarCbZonaTematica(){
        for(NodoZonaTematica auxZonaTematica = listaZonaTematica.getInicio(); auxZonaTematica != null; auxZonaTematica = auxZonaTematica.getSiguiente()){
            cbZonaTematica.addItem(auxZonaTematica.getZonaTematica().getNombre());
        }
    }
    
    public void listarTabla(){
        int cantidad = 1;
        modelo.setRowCount(0);
        for(NodoZonaTematica auxZonaTematica = listaZonaTematica.getInicio(); auxZonaTematica != null; auxZonaTematica = auxZonaTematica.getSiguiente()){
            for(NodoEspectaculo auxEspectaculo = auxZonaTematica.getEspectaculo().getInicio(); auxEspectaculo != null; auxEspectaculo = auxEspectaculo.getSiguiente()){
                arregloEspectaculo[0] = Integer.toString(cantidad);
                arregloEspectaculo[1] = auxEspectaculo.getEspectaculo().getIdEspectaculo();
                arregloEspectaculo[2] = auxEspectaculo.getEspectaculo().getNombre();
                arregloEspectaculo[3] = auxEspectaculo.getEspectaculo().getTipo();
                arregloEspectaculo[4] = Integer.toString(auxEspectaculo.getEspectaculo().getMinutos());
                arregloEspectaculo[5] = Integer.toString(auxEspectaculo.getEspectaculo().getAforoMaximo());
                arregloEspectaculo[6] = auxZonaTematica.getZonaTematica().getNombre();
                modelo.addRow(arregloEspectaculo);
                cantidad++; 
            }
        }
    }
    public void estadosTxt(boolean booleano){
        txtCodigo.setEnabled(booleano);
        txtNombreEspectaculo.setEnabled(booleano);
        spMinutos.setEnabled(booleano);
        spAforoMaximo.setEnabled(booleano);
    }
    public void estadoTxtAgregarTipo(boolean booleano){
        txtAgregarTipoEspectaculo.setEnabled(booleano);
    }
    public void modificarTxt(String codigo, String nombre, String tipo, int minutos, int aforo){
        txtCodigo.setText(codigo);
        txtNombreEspectaculo.setText(nombre);
        cbTipoEspectaculo.setSelectedItem(tipo);
        spMinutos.setValue(minutos);
        spAforoMaximo.setValue(aforo);
    }
    
    public boolean camposObligatoriosVacios(){
        if(txtCodigo.getText().isEmpty()){
            txtCodigo.requestFocus();
            JOptionPane.showMessageDialog(null, "FALTA RELLENAR CAMPO CODIGO");
            return true;
        }
        if(txtNombreEspectaculo.getText().isEmpty()){
            txtNombreEspectaculo.requestFocus();
            JOptionPane.showMessageDialog(null, "FALTA RELLENAR CAMPO NOMBRE");
            return true;
        }
        if(Integer.parseInt(spMinutos.getValue().toString()) < 30){
            JOptionPane.showMessageDialog(null, "MINUTOS MAYOR A 30");
            spMinutos.setValue(30);
            return true;
        }
        
        if(Integer.parseInt(spAforoMaximo.getValue().toString()) < 5){
            JOptionPane.showMessageDialog(null, "AFORO MAYOR A 5");
            spAforoMaximo.setValue(5);
            return true;
        }
        return false;
    }
    
    public void estadosBtn(boolean boolenao){
        btnGuardar.setEnabled(!boolenao);
        btnEditar.setEnabled(boolenao);
        btnEliminar.setEnabled(boolenao);
        btnNuevo.setEnabled(boolenao);
    }
    
    public void soloLetras(java.awt.event.KeyEvent evt){
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar))
            evt.consume();
    }
    
    public void soloNumeros(java.awt.event.KeyEvent evt){
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            evt.consume();
        }
    }
    
   /* public boolean tablaVacia(){
        if(lista.getInicio() == null){
            JOptionPane.showMessageDialog(null, "TABLA VACIA!!");
            return true;
        }
        return false;
    }*/
    
    public boolean noSeleccionoFila(){
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "seleccione un elemento de la fila");
            return true;
        }
        return false;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbTipoEspectaculo = new javax.swing.JComboBox<>();
        txtNombreEspectaculo = new javax.swing.JTextField();
        txtAgregarTipoEspectaculo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnAgregarTipoEspectaculo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbEspectaculo = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        spAforoMaximo = new javax.swing.JSpinner();
        spMinutos = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        cbZonaTematica = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE:");

        jLabel2.setText("TIPO:");

        jLabel3.setText("MINUTOS:");

        cbTipoEspectaculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "musica", "danza", "teatro" }));

        txtNombreEspectaculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEspectaculoKeyTyped(evt);
            }
        });

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAgregarTipoEspectaculo.setText("AGREGAR TIPO");
        btnAgregarTipoEspectaculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTipoEspectaculoActionPerformed(evt);
            }
        });

        jLabel4.setText("AFORO MAXIMO:");

        jLabel5.setText("CODIGO:");

        tbEspectaculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "CODIGO", "NOMBRE", "TIPO", "MINUTOS", "AFORO", "ZONA TEMATICA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbEspectaculo);

        jLabel6.setText("AGREGAR TIPO:");

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel7.setText("ZonaTematica");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7)
                        .addComponent(jLabel3)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbTipoEspectaculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreEspectaculo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtAgregarTipoEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAgregarTipoEspectaculo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGuardar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEliminar)
                                    .addComponent(btnEditar))
                                .addContainerGap(12, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spAforoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 188, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbZonaTematica, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCodigo))
                        .addGap(60, 60, 60)
                        .addComponent(btnNuevo)
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbTipoEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnGuardar)
                    .addComponent(spMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spAforoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAgregarTipoEspectaculo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAgregarTipoEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
                for(NodoZonaTematica auxZonaTematica = listaZonaTematica.getInicio(); auxZonaTematica != null; auxZonaTematica = auxZonaTematica.getSiguiente()){
                    if(auxZonaTematica.getZonaTematica().getNombre().equals(cbZonaTematica.getSelectedItem())){
                        listaEspectaculo = auxZonaTematica.getEspectaculo();
                        listaEspectaculo.agregarAdelante(new Espectaculo(txtCodigo.getText(), txtNombreEspectaculo.getText(), cbTipoEspectaculo.getSelectedItem().toString(), Integer.parseInt(spMinutos.getValue().toString()), Integer.parseInt(spAforoMaximo.getValue().toString())));
                        break;
                    }
                }
        /*switch(btn){
            case("NUEVO"):
                
                /*
                if(camposObligatoriosVacios()) return;
                lista.agregarAdelante(new Espectaculo(txtCodigo.getText(), txtNombreEspectaculo.getText(), cbTipoEspectaculo.getSelectedItem().toString(), Integer.parseInt(spMinutos.getValue().toString()), Integer.parseInt(spAforoMaximo.getValue().toString())));
                */
               /* break;
            case("EDITAR"):*/
                /*
                if(camposObligatoriosVacios()) return;
                NodoEspectaculo aux = lista.modificar(tbEspectaculo.getValueAt(fila, 1).toString());
                aux.setEspectaculo(new Espectaculo(txtCodigo.getText(), txtNombreEspectaculo.getText(), cbTipoEspectaculo.getSelectedItem().toString(), Integer.parseInt(spMinutos.getValue().toString()), Integer.parseInt(spAforoMaximo.getValue().toString())));
                */
                /*break;
        }*/
        
        //modificarTxt("", "", "musica", 0, 0);
        //estadosTxt(false);
        listarTabla();
        //estadosBtn(true);
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarTipoEspectaculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTipoEspectaculoActionPerformed
        // TODO add your handling code here:
        btnAgregarTipoEspectaculo.setText("GUARDAR TIPO");
        estadoTxtAgregarTipo(true);
        if(txtAgregarTipoEspectaculo.getText().isEmpty()) return;
        cbTipoEspectaculo.addItem(txtAgregarTipoEspectaculo.getText());
        txtAgregarTipoEspectaculo.setText("");
        estadoTxtAgregarTipo(false);
        btnAgregarTipoEspectaculo.setText("AGREGAR TIPO");
    }//GEN-LAST:event_btnAgregarTipoEspectaculoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        /*txtCodigo.requestFocus();
        estadosTxt(true);
        estadosBtn(false);
        btn = "NUEVO";
        */
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        /*if(tablaVacia())return;
        
        fila = tbEspectaculo.getSelectedRow(); 
        
        if( noSeleccionoFila()) return;
        
        estadosTxt(true);
        estadosBtn(false);
        modificarTxt(tbEspectaculo.getValueAt(fila, 1).toString(),tbEspectaculo.getValueAt(fila, 2).toString(),tbEspectaculo.getValueAt(fila, 3).toString(),Integer.parseInt(tbEspectaculo.getValueAt(fila, 4).toString()),Integer.parseInt(tbEspectaculo.getValueAt(fila, 5).toString()));
        btn = "EDITAR";
        */
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNombreEspectaculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEspectaculoKeyTyped
        // TODO add your handling code here:
        soloLetras(evt);
    }//GEN-LAST:event_txtNombreEspectaculoKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        /*if(tablaVacia()) return;
        fila = tbEspectaculo.getSelectedRow();
        if(noSeleccionoFila()) return;
        btn = "ELIMINAR";
        estadosBtn(false);
        */
    }//GEN-LAST:event_btnEliminarActionPerformed
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
     /*   java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaEspectaculo vtn= new VentanaEspectaculo();
                vtn.setVisible(true);
                vtn.setLocationRelativeTo(null);
            }
        });
    }
    */
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarTipoEspectaculo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbTipoEspectaculo;
    private javax.swing.JComboBox<String> cbZonaTematica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JSpinner spAforoMaximo;
    private javax.swing.JSpinner spMinutos;
    private javax.swing.JTable tbEspectaculo;
    private javax.swing.JTextField txtAgregarTipoEspectaculo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombreEspectaculo;
    // End of variables declaration//GEN-END:variables
}
