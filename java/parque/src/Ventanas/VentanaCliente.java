/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Lista.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import parque.Cliente;
import parque.Ticket;

/**
 *
 * @author JuanPablo
 */
public class VentanaCliente extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    private ListaCliente lista;
    private String arreglo[] = new String[8];
    private DefaultTableModel modelo;
    private String boton;//para saber que boton se presiono
    private int filaModificar;
    public VentanaCliente(ListaCliente lista) {
        initComponents();
        this.lista = lista;
        modelo = new DefaultTableModel();
        modelo = (DefaultTableModel) tabla.getModel();
        estadosTxt(false);
        listarTabla();
        estadoBtn(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void modificarTxt(String apellido, String direccion, String dni, String nombre, String telefono){
        txtApellido.setText(apellido);
        txtDireccion.setText(direccion);
        txtDni.setText(dni);
        txtNombre.setText(nombre);
        txtTelefono.setText(telefono);
    }
    
    public void estadoTabla(boolean booleano){
        tabla.setEnabled(booleano);
    }
    
    public void estadosTxt(boolean booleano){
        txtApellido.setEditable(booleano);
        txtDireccion.setEditable(booleano);
        txtDni.setEditable(booleano);
        txtNombre.setEditable(booleano);
        txtTelefono.setEditable(booleano);
    }
    
    public void listarTabla(){
        int cantidad = 1;
        
        modelo.setRowCount(0);
        for(NodoCliente aux = lista.getInicio(); aux != null; aux = aux.getSiguiente()){
            arreglo[0] = Integer.toString(cantidad);
            arreglo[1] = aux.getCliente().getDni();
            arreglo[2] = aux.getCliente().getNombre();
            arreglo[3] = aux.getCliente().getApellido();
            arreglo[4] = aux.getCliente().getSexo();
            arreglo[5] = aux.getCliente().getDireccion();
            arreglo[6] = aux.getCliente().getTelefono();
            arreglo[7] = aux.getTicket().getFecha();
            
            modelo.addRow(arreglo);
            
            cantidad ++;
        }
    }
    
    public void estadoBtn(boolean booleano){
        btnEliminar.setEnabled(booleano);
        btnGuardar.setEnabled(!booleano);
        btnEditar.setEnabled(booleano);
        btnNuevo.setEnabled(booleano);
    }
    
    public boolean unicoDni(String dni){
        for(NodoCliente aux = lista.getInicio(); aux != null; aux = aux.getSiguiente()){
            if(aux.getCliente().getDni().equals(dni)) {
                JOptionPane.showMessageDialog(null, "inserte otro dni");
                return false;
            }
        }
        return true;
    }
    
    public boolean validandoDni(String dni){
        if(Integer.parseInt(dni) < 10000000 || Integer.parseInt(dni) > 100000000){
            JOptionPane.showMessageDialog(null, "dni invalido(10000000-100000000)");
            return false;
        }
        return true;
    }
    
    public boolean validarDniEditar(String dni, int fila){
        int orden = 0;
        for(NodoCliente aux = lista.getInicio(); aux != null; aux = aux.getSiguiente()){
            if(aux.getCliente().getDni().equals(dni) && orden != fila){
                JOptionPane.showMessageDialog(null, "inserte otro dni");
                return false;
            }
            orden++;
        }
        return true;
    }
    public boolean validarTelefono(String telefono){
        if(Integer.parseInt(telefono) > 999999999 || Integer.parseInt(telefono) < 900000000){
            JOptionPane.showMessageDialog(null, "telefono invalido");
            return false;
        }
        return true;
    }
    public void soloNumeros(java.awt.event.KeyEvent evt){
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)) evt.consume();
    }
    public void Dni_cantidad(java.awt.event.KeyEvent evt){
        if(txtDni.getText().length() > 7)
            evt.consume();
    }
    public void Telefono_cantidad(java.awt.event.KeyEvent evt){
        if(txtTelefono.getText().length() > 8)
            evt.consume();
    }
    public void soloLetras(java.awt.event.KeyEvent evt){
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)) evt.consume();
    }
    public boolean campoObligatorios(){
        if(txtApellido.getText().isEmpty() || txtNombre.getText().isEmpty() || txtDni.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "rellene los campos obligatorios");
            if(txtDni.getText().isEmpty())
                txtDni.requestFocus();
            else if(txtNombre.getText().isEmpty())
                txtNombre.requestFocus();
            else if(txtApellido.getText().isEmpty())
                txtApellido.requestFocus();
            return false;
        }
            
        return true;
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
        radioGrupo = new javax.swing.ButtonGroup();
        txtDni = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnTicket = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();

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

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        radioGrupo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        radioGrupo.add(rbFemenino);
        rbFemenino.setText("Femenino");

        jLabel1.setText("DNI*:");

        jLabel2.setText("NOMBRE*:");

        jLabel3.setText("APELLIDO*:");

        jLabel4.setText("SEXO:");

        jLabel5.setText("DIRECCION:");

        jLabel6.setText("TELEFONO:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRE", "APELLIDO", "SEXO", "DIRECCION", "TELEFONO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(1).setMinWidth(50);
            tabla.getColumnModel().getColumn(1).setMaxWidth(70);
            tabla.getColumnModel().getColumn(6).setMinWidth(20);
            tabla.getColumnModel().getColumn(6).setMaxWidth(75);
        }

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

        btnTicket.setText("TICKET");
        btnTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketActionPerformed(evt);
            }
        });

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                .addComponent(txtNombre)
                                                .addComponent(txtApellido))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbMasculino)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rbFemenino)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(btnGuardar)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rbMasculino)
                                .addComponent(rbFemenino))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar)
                        .addGap(12, 12, 12)
                        .addComponent(btnEliminar)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTicket)
                        .addGap(9, 9, 9)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if(lista.getInicio() == null){
            JOptionPane.showMessageDialog(null, "tabla vacia");
            return;
        }
        try{
            boton = "EDITAR";
            filaModificar = tabla.getSelectedRow();
            modificarTxt(tabla.getValueAt(filaModificar, 3).toString(),
                    tabla.getValueAt(filaModificar, 5).toString(), 
                    tabla.getValueAt(filaModificar, 1).toString(), 
                    tabla.getValueAt(filaModificar, 2).toString(), 
                    tabla.getValueAt(filaModificar, 6).toString());
            if(tabla.getValueAt(filaModificar, 4).toString().equals("Masculino"))
                rbMasculino.setSelected(true);
            else rbFemenino.setSelected(true);
            estadoBtn(false);
            estadosTxt(true);  
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "selecione un elemento de la fila que quiere editar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
        if(lista.getInicio() == null){
            JOptionPane.showMessageDialog(null, "tabla vacia");
            return;
        }
        try{
            filaModificar = tabla.getSelectedRow();
            boton = "ELIMINAR";
            lista.eliminar(tabla.getValueAt(filaModificar, 1).toString());
            listarTabla();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "seleccione un elemento de la fila que quiere eliminar");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Cliente cliente;
        if(!campoObligatorios()) return;
        switch(boton){
            case("NUEVO"):
                if(!validandoDni(txtDni.getText()) || !unicoDni(txtDni.getText())) return;
                if(!txtTelefono.getText().equals("") && !validarTelefono(txtTelefono.getText()))return;
                cliente = new Cliente(txtDni.getText(), txtNombre.getText(), txtApellido.getText(), rbFemenino.isSelected()? rbFemenino.getText() : rbMasculino.getText(), txtDireccion.getText(), txtTelefono.getText());
          
                Ticket ticket = new Ticket();
                lista.agregarAdelante(cliente, ticket);
                break;
            case("EDITAR"):
                NodoCliente aux = lista.buscar(tabla.getValueAt(filaModificar, 1).toString());
                if(!validarDniEditar(txtDni.getText(), filaModificar) || !validandoDni(txtDni.getText())) return;
                cliente = new Cliente(txtDni.getText(), txtNombre.getText(), txtApellido.getText(), rbMasculino.isSelected()? rbMasculino.getText() : rbFemenino.getText(), txtDireccion.getText(), txtTelefono.getText());
                aux.setCliente(cliente);
                break;
        }
        
        listarTabla();
        modificarTxt("", "", "", "", "");
        estadoBtn(true);
        estadosTxt(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketActionPerformed
        // TODO add your handling code here:
        VentanaTicket vtnTicket = new VentanaTicket(lista);
        vtnTicket.setLocationRelativeTo(null);
        vtnTicket.setVisible(true);
    }//GEN-LAST:event_btnTicketActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        boton = "NUEVO";
        estadosTxt(true);
        estadoBtn(false);
        txtDni.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
        soloNumeros(evt);
        Dni_cantidad(evt);
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        soloLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        // TODO add your handling code here:
        soloLetras(evt);
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        // TODO add your handling code here:
        soloNumeros(evt);
        Telefono_cantidad(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.ButtonGroup radioGrupo;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
