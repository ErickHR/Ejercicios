
package Ventanas;

import Lista.ListaZonaTematica;
import Lista.NodoZonaTematica;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import zonaTematica.ZonaTematica;

public class VentanaZonaTematica extends javax.swing.JFrame {

    ListaZonaTematica listaZonaTematica;
    DefaultTableModel modelo;
    int fila;
    String btn;
    VentanaPrincipal ventanaPrincipal;
    public VentanaZonaTematica(ListaZonaTematica lista, VentanaPrincipal ventanaPrincipal) {
        initComponents();
        listaZonaTematica = lista;
        this.ventanaPrincipal = ventanaPrincipal;
        modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) tablaZonaTematica.getModel();
        estadoTxt(false);
        estadoBtn(true);
        listarTabla();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public boolean camposObligatoriosVacios(){
        if(txtIdZonaTematica.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "FALTA ID");
            txtIdZonaTematica.requestFocus();
            return true;
        }
        if(txtNombreZonaTematica.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "FALTA NOMBRE");
            txtNombreZonaTematica.requestFocus();
            return true;
        }
        if(txtDescripcionZonaTematica.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "FALTA DESCRIPCION");
            txtDescripcionZonaTematica.requestFocus();
            return true;
        }
        if(txtColorZonaTematica.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "FALTA COLOR");
            txtColorZonaTematica.requestFocus();
            return true;
        }
        return false;
    }
    
    public void listarTabla(){
        String arregloListaTematica[] = new String[5];
        int cantidad = 1;
        modelo.setRowCount(0);
        for(NodoZonaTematica aux = listaZonaTematica.getInicio(); aux != null; aux = aux.getSiguiente()){
            arregloListaTematica[0] = Integer.toString(cantidad);
            arregloListaTematica[1] = aux.getZonaTematica().getIdZonatematica();
            arregloListaTematica[2] = aux.getZonaTematica().getNombre();
            arregloListaTematica[3] = aux.getZonaTematica().getDescripcion();
            arregloListaTematica[4] = aux.getZonaTematica().getColor();
            
            modelo.addRow(arregloListaTematica);
            cantidad ++;
        }
    }
    
    public void soloLetras(java.awt.event.KeyEvent evt){
        Character validar = evt.getKeyChar();
        if(Character.isDigit(validar))
            evt.consume();
    }
    
    public void modificarTxt(String id, String nombre, String descripcion, String color){
        txtColorZonaTematica.setText(color);
        txtDescripcionZonaTematica.setText(descripcion);
        txtIdZonaTematica.setText(id);
        txtNombreZonaTematica.setText(nombre);
    }
    
    public void estadoTxt(boolean booleano){
        txtIdZonaTematica.requestFocus();
        txtColorZonaTematica.setEnabled(booleano);
        txtDescripcionZonaTematica.setEnabled(booleano);
        txtIdZonaTematica.setEnabled(booleano);
        txtNombreZonaTematica.setEnabled(booleano);
    }
    
    public void estadoBtn(boolean booleano){
        btnEditar.setEnabled(booleano);
        btnEliminar.setEnabled(booleano);
        btnGuardar.setEnabled(!booleano);
        btnNuevo.setEnabled(booleano);
    }
    
    public boolean listaVacia(){
        if(listaZonaTematica.getInicio() == null){
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return true;
        }
        return false;
    }
    
    public boolean filaEsMenoUno(){
        fila = tablaZonaTematica.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "seleccion un elemento de la fila");
            return true;
        }
        return false;
    }
    
    public boolean unicoId(){
        for(NodoZonaTematica aux = listaZonaTematica.getInicio(); aux != null; aux = aux.getSiguiente())
            if(aux.getZonaTematica().getIdZonatematica().equals(txtIdZonaTematica.getText())){
                JOptionPane.showMessageDialog(null, "ID ya existe");
                return false;
            }
        return true;
    }
    public boolean unicoIdEditar(){
        int contador = 0;
        for(NodoZonaTematica aux = listaZonaTematica.getInicio(); aux != null; aux = aux.getSiguiente()){
            if(aux.getZonaTematica().getIdZonatematica().equals(txtIdZonaTematica.getText()) && fila != contador){
                JOptionPane.showMessageDialog(null, "ID ya existe");
                return false;
            }
            contador ++;
        }
        return true;
    }
    public boolean unicoNombre(){
        for(NodoZonaTematica aux = listaZonaTematica.getInicio(); aux != null; aux = aux.getSiguiente())
            if(aux.getZonaTematica().getNombre().equalsIgnoreCase(txtNombreZonaTematica.getText())){
                JOptionPane.showMessageDialog(null, "Nombre ya existe");
                return false;
            }
        return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreZonaTematica = new javax.swing.JTextField();
        txtDescripcionZonaTematica = new javax.swing.JTextField();
        txtColorZonaTematica = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaZonaTematica = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtIdZonaTematica = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Descripcion:");

        jLabel3.setText("Color:");

        txtNombreZonaTematica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreZonaTematicaKeyTyped(evt);
            }
        });

        txtDescripcionZonaTematica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionZonaTematicaKeyTyped(evt);
            }
        });

        txtColorZonaTematica.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColorZonaTematicaKeyTyped(evt);
            }
        });

        tablaZonaTematica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "CODIGO", "NOMBRE", "DESCRIPCION", "COLOR"
            }
        ));
        jScrollPane1.setViewportView(tablaZonaTematica);

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

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtColorZonaTematica, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(txtDescripcionZonaTematica, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(txtNombreZonaTematica)
                            .addComponent(txtIdZonaTematica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDescripcionZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtColorZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btn = "NUEVO";
        estadoTxt(true);
        estadoBtn(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if(camposObligatoriosVacios()) return;
        
        switch(btn){
            case "NUEVO":
                if(!unicoId() || !unicoNombre()) return;
                listaZonaTematica.agregarAdelante(new ZonaTematica(txtIdZonaTematica.getText(), txtNombreZonaTematica.getText(), txtDescripcionZonaTematica.getText(), txtColorZonaTematica.getText()));
                break;
            case "EDITAR":
                if(!unicoIdEditar()) return;
                NodoZonaTematica aux = listaZonaTematica.modificar(tablaZonaTematica.getValueAt(fila, 1).toString());
                aux.setZonaTematica(new ZonaTematica(txtIdZonaTematica.getText(), txtNombreZonaTematica.getText(), txtDescripcionZonaTematica.getText(), txtColorZonaTematica.getText()));
                break;
        }
        
        listarTabla();
        estadoBtn(true);
        modificarTxt("", "", "", "");
        estadoTxt(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreZonaTematicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreZonaTematicaKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtNombreZonaTematicaKeyTyped

    private void txtDescripcionZonaTematicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionZonaTematicaKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtDescripcionZonaTematicaKeyTyped

    private void txtColorZonaTematicaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColorZonaTematicaKeyTyped
        soloLetras(evt);
    }//GEN-LAST:event_txtColorZonaTematicaKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(listaVacia()) return;
        if(filaEsMenoUno())return;
        btn = "EDITAR";
        modificarTxt(tablaZonaTematica.getValueAt(fila, 1).toString(),
                tablaZonaTematica.getValueAt(fila, 2).toString(),
                tablaZonaTematica.getValueAt(fila, 3).toString(),
                tablaZonaTematica.getValueAt(fila, 4).toString());
        estadoTxt(true);
        estadoBtn(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(listaVacia()) return;
        if(filaEsMenoUno()) return;
        listaZonaTematica.eliminar(tablaZonaTematica.getValueAt(fila, 1).toString());
        listarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ventanaPrincipal.listarCbZonaTematica();
        if(ventanaPrincipal.listaZonaTematicaEsVacia1())return;
        
        ventanaPrincipal.estadoMenuAgregar(true);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaZonaTematica;
    private javax.swing.JTextField txtColorZonaTematica;
    private javax.swing.JTextField txtDescripcionZonaTematica;
    private javax.swing.JTextField txtIdZonaTematica;
    private javax.swing.JTextField txtNombreZonaTematica;
    // End of variables declaration//GEN-END:variables
}
