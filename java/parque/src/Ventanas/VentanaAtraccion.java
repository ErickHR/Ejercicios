
package Ventanas;

import Lista.ListaZonaTematica;
import Lista.ListaAtraccion;
import Lista.NodoAtraccion;
import Lista.NodoZonaTematica;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import zonaTematica.Atraccion;

public class VentanaAtraccion extends javax.swing.JFrame {

    VentanaPrincipal ventanaPrincipal;
    ListaZonaTematica listaZonaTematica;
    ListaAtraccion listaAtraccion;
    String arregloAtraccion[] = new String[8];
    DefaultTableModel modelo;
    int fila;
    String btn;
    public VentanaAtraccion(ListaZonaTematica listaZonaTematica, VentanaPrincipal ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
        this.listaZonaTematica = listaZonaTematica;
        estadosTxt(false);
        listarTabla();
        listarCbZonaTematica();
        modelo = (DefaultTableModel) tablaAtraccion.getModel();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public boolean listaVacia(){
        if(listaZonaTematica.getInicio().getEspectaculo().getInicio() == null){
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return true;
        }
        return false;
    }
    public boolean filaEsMenoUno(){
        fila = tablaAtraccion.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "seleccion un elemento de la fila");
            return true;
        }
        return false;
    }
    public boolean unicoIdEditar(){
        int filaSeleccionada = 0;
        for(NodoZonaTematica auxNodoZonaTematica = listaZonaTematica.getInicio(); auxNodoZonaTematica != null; auxNodoZonaTematica = auxNodoZonaTematica.getSiguiente()){
            for(NodoAtraccion auxAtraccion = auxNodoZonaTematica.getAtraccion().getInicio(); auxAtraccion != null; auxAtraccion = auxAtraccion.getSiguiente()){
                if(auxAtraccion.getAtraccion().getIdAtraccion().equals(txtId.getText()) && fila != filaSeleccionada ){
                    JOptionPane.showMessageDialog(null, "inserte otro Id");
                    return false;
                }
                filaSeleccionada++;
            }
        }
        return true;
    }
    public boolean unicoNombreEditar(){
        int filaSeleccionada = 0;
        for(NodoZonaTematica auxNodoZonaTematica = listaZonaTematica.getInicio(); auxNodoZonaTematica != null; auxNodoZonaTematica = auxNodoZonaTematica.getSiguiente()){
            for(NodoAtraccion auxAtraccion = auxNodoZonaTematica.getAtraccion().getInicio(); auxAtraccion != null; auxAtraccion = auxAtraccion.getSiguiente()){
                if(auxAtraccion.getAtraccion().getIdAtraccion().equals(txtNombre.getText()) && fila != filaSeleccionada ){
                    JOptionPane.showMessageDialog(null, "inserte otro Id");
                    return false;
                }
                filaSeleccionada++;
            }
        }
        return true;
    }
    public boolean unicoId(){
        for(NodoZonaTematica auxNodoZonaTematica = listaZonaTematica.getInicio(); auxNodoZonaTematica != null; auxNodoZonaTematica = auxNodoZonaTematica.getSiguiente())
            for(NodoAtraccion auxAtraccion = auxNodoZonaTematica.getAtraccion().getInicio(); auxAtraccion != null; auxAtraccion = auxAtraccion.getSiguiente())
                if(auxAtraccion.getAtraccion().getIdAtraccion().equals(txtId.getText())){
                    JOptionPane.showMessageDialog(null, "inserte otro Id");
                    return false;
                }
        return true;
    }
    public boolean unicoNombre(){
        for(NodoZonaTematica auxNodoZonaTematica = listaZonaTematica.getInicio(); auxNodoZonaTematica != null; auxNodoZonaTematica = auxNodoZonaTematica.getSiguiente())
            for(NodoAtraccion auxAtraccion = auxNodoZonaTematica.getAtraccion().getInicio(); auxAtraccion != null; auxAtraccion = auxAtraccion.getSiguiente())
                if(auxAtraccion.getAtraccion().getIdAtraccion().equals(txtNombre.getText())){
                    JOptionPane.showMessageDialog(null, "inserte otro Id");
                    return false;
                }
        return true;
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
            for(NodoAtraccion auxAtraccion = auxZonaTematica.getAtraccion().getInicio(); auxAtraccion != null; auxAtraccion = auxAtraccion.getSiguiente()){
                arregloAtraccion[0] = Integer.toString(cantidad);
                arregloAtraccion[1] = auxAtraccion.getAtraccion().getIdAtraccion();
                arregloAtraccion[2] = auxAtraccion.getAtraccion().getNombre();
                arregloAtraccion[3] = Float.toString(auxAtraccion.getAtraccion().getEstaturaMinima());
                arregloAtraccion[4] = Float.toString(auxAtraccion.getAtraccion().getPrecio());
                arregloAtraccion[5] = Integer.toString(auxAtraccion.getAtraccion().getCapacidad());
                arregloAtraccion[6] = Float.toString(auxAtraccion.getAtraccion().getDuracion());
                arregloAtraccion[7] = auxZonaTematica.getZonaTematica().getNombre();
                modelo.addRow(arregloAtraccion);
                cantidad++; 
            }
        }
    }
    public void estadosTxt(boolean booleano){
        txtCapacidad.setEnabled(booleano);
        txtDuracion.setEnabled(booleano);
        txtEstatura.setEnabled(booleano);
        txtId.setEnabled(booleano);
        txtNombre.setEnabled(booleano);
        txtPrecio.setEnabled(booleano);
    }
    public void estadosBtn(boolean boolenao){
        btnGuardar.setEnabled(!boolenao);
        btnEditar.setEnabled(boolenao);
        btnEliminar.setEnabled(boolenao);
        btnNuevo.setEnabled(boolenao);
    }
    public boolean camposObligatoriosVacios(){
        if(txtCapacidad.getText().isEmpty() ||
                txtDuracion.getText().isEmpty() ||
                txtEstatura.getText().isEmpty() ||
                txtId.getText().isEmpty() ||
                txtNombre.getText().isEmpty() ||
                txtPrecio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "rellene todos los campos");
            return true;
        }
        return false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAtraccion = new javax.swing.JTable();
        txtDuracion = new javax.swing.JTextField();
        txtCapacidad = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbZonaTematica = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("NOMBRE:");

        jLabel2.setText("ESTATURA:");

        jLabel3.setText("CAPACIDAD:");

        jLabel4.setText("DURACION:");

        tablaAtraccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "CODIGO", "NOMBRE", "ESTATURA", "CAPACIDAD", "DURACION", "ZONA TEMATICA"
            }
        ));
        jScrollPane1.setViewportView(tablaAtraccion);

        jLabel5.setText("ZONA TEMATICA");

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

        jLabel6.setText("ID");

        jLabel7.setText("PRECIO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                            .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel6)
                                    .addGap(60, 60, 60)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(txtId)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(47, 47, 47))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(23, 23, 23)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDuracion)
                                .addComponent(txtCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(txtPrecio)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        /*for(NodoZonaTematica auxZonaTematica = listaZonaTematica.getInicio(); auxZonaTematica != null; auxZonaTematica = auxZonaTematica.getSiguiente()){
            if(auxZonaTematica.getZonaTematica().getNombre().equals(cbZonaTematica.getSelectedItem())){
                listaAtraccion = auxZonaTematica.getAtraccion();
                listaAtraccion.agregarAdelante(new Atraccion(txtId.getText(), txtNombre.getText(), Float.parseFloat(txtEstatura.getText()), Float.parseFloat(txtPrecio.getText()), Integer.parseInt(txtCapacidad.getText()), Float.parseFloat(txtDuracion.getText())));
            }
        }
        listarTabla();*/
        if(camposObligatoriosVacios()) return;
        switch(btn){
            case ("NUEVO"):
                if(!unicoId() || !unicoNombre()) return;
                listaAtraccion = listaZonaTematica.listaAtraccion(cbZonaTematica.getSelectedItem().toString());
                listaAtraccion.agregarAdelante(new Atraccion(txtId.getText(), txtNombre.getText(), Float.parseFloat(txtEstatura.getText()), Float.parseFloat(txtPrecio.getText()), Integer.parseInt(txtCapacidad.getText()), Float.parseFloat(txtDuracion.getText())));
                break;
            case ("EDITAR"):
                if(!unicoIdEditar() || !unicoNombreEditar()) return;
                NodoAtraccion auxAtraccion = listaZonaTematica.listaAtraccion(cbZonaTematica.getSelectedItem().toString()).modificar(tablaAtraccion.getValueAt(fila, 1).toString());
                auxAtraccion.setAtraccion(new Atraccion(txtId.getText(), txtNombre.getText(), Float.parseFloat(txtEstatura.getText()), Float.parseFloat(txtPrecio.getText()), Integer.parseInt(txtCapacidad.getText()), Float.parseFloat(txtDuracion.getText())));
                break;
        }
        
        estadosTxt(false);
        listarTabla();
        estadosBtn(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(listaZonaTematica.getInicio().getAtraccion().getInicio() == null) return;
        
        ventanaPrincipal.listarCbRestauranteEspectaculoAtraccion();
        ventanaPrincipal.estadoMenuAgregarCliente(true);
        
    }//GEN-LAST:event_formWindowClosing

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(listaVacia()) return;
        if(filaEsMenoUno())return;
        
        btn = "EDITAR";
        estadosTxt(true);
        estadosBtn(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btn = "NUEVO";
        estadosTxt(true);
        estadosBtn(false); 
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(listaVacia()) return;
        if(filaEsMenoUno()) return;
        listaAtraccion = listaZonaTematica.listaAtraccion(cbZonaTematica.getSelectedItem().toString());
        listaAtraccion.eliminar(tablaAtraccion.getValueAt(fila, 1).toString());
        listarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbZonaTematica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAtraccion;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
