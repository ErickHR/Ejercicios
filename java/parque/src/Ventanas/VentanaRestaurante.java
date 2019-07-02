/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Lista.*;
import javax.swing.table.DefaultTableModel;
import zonaTematica.Restaurante;

/**
 *
 * @author PROPIETARIO
 */
public class VentanaRestaurante extends javax.swing.JFrame {

    /**
     * Creates new form VentanaRestaurante
     */
    ListaZonaTematica listaZonaTematica;
    ListaRestaurante listaRestaurante;
    String arregloResaturante[] = new String[6];
    String btn;
    DefaultTableModel modelo;
    public VentanaRestaurante(ListaZonaTematica lista) {
        initComponents();
        listaZonaTematica = lista;
        
        modelo = (DefaultTableModel) tbRestaurante.getModel();
        estadoTxt(false);
        listarCb();
        estadoBtnGuardar(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void listarCb(){
        for(NodoZonaTematica aux = listaZonaTematica.getInicio(); aux != null; aux = aux.getSiguiente()){
            cbZonaTematica.addItem(aux.getZonaTematica().getNombre());
        }
    }
    public void listarTabla(){
        modelo.setRowCount(0);
        int cantidad = 1;
        for(NodoZonaTematica auxZonaTematica = listaZonaTematica.getInicio(); auxZonaTematica != null; auxZonaTematica = auxZonaTematica.getSiguiente())
            for(NodoRestaurante auxRestaurante = auxZonaTematica.getRestaurante().getInicio(); auxRestaurante != null; auxRestaurante = auxRestaurante.getSiguiente()){
                arregloResaturante[0] = Integer.toString(cantidad);
                arregloResaturante[1] = auxRestaurante.getRestaurante().getIdRestaurante();
                arregloResaturante[2] = auxRestaurante.getRestaurante().getNombre();
                arregloResaturante[3] = auxRestaurante.getRestaurante().getHorario();
                arregloResaturante[4] = Float.toString(auxRestaurante.getRestaurante().getPrecioMedio());
                arregloResaturante[5] = auxZonaTematica.getZonaTematica().getNombre();
                modelo.addRow(arregloResaturante);
                cantidad++;
            }
        
    }
    public void estadoBtnGuardar(boolean booleano){
        btnEditar.setEnabled(!booleano);
        btnEliminar.setEnabled(!booleano);
        btnGuardar.setEnabled(booleano);
        btnNuevo.setEnabled(!booleano);
    }
    public void estadoTxt(boolean booleano){
        txtHorarioRestaurante.setEnabled(booleano);
        txtIdRestaurante.setEnabled(booleano);
        txtNombreRestaurante.setEnabled(booleano);
        txtPrecioMEdio.setEnabled(booleano);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdRestaurante = new javax.swing.JTextField();
        txtNombreRestaurante = new javax.swing.JTextField();
        txtHorarioRestaurante = new javax.swing.JTextField();
        txtPrecioMEdio = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRestaurante = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        cbZonaTematica = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOMBRE:");

        jLabel2.setText("HORARIO");

        jLabel3.setText("PRECIO MEDIO:");

        jLabel4.setText("ID:");

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        tbRestaurante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "ID", "NOMBRE", "HORARIO", "PRECIO MEDIO", "ZONA TEMATICA"
            }
        ));
        jScrollPane1.setViewportView(tbRestaurante);
        if (tbRestaurante.getColumnModel().getColumnCount() > 0) {
            tbRestaurante.getColumnModel().getColumn(0).setMinWidth(20);
            tbRestaurante.getColumnModel().getColumn(0).setMaxWidth(20);
        }

        btnEditar.setText("EDITAR");

        btnEliminar.setText("ELIMINAR");

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel5.setText("Zona Tematica");

        jLabel6.setText("RESTAURANTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioMEdio, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtNombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(98, 98, 98)
                                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtHorarioRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(98, 98, 98)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnGuardar)
                                        .addComponent(btnEliminar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIdRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(98, 98, 98))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)))
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtIdRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHorarioRestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioMEdio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btn = "NUEVO";
        estadoTxt(true);
        estadoBtnGuardar(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        switch(btn){
            case "NUEVO":
                for(NodoZonaTematica auxZonaTematica = listaZonaTematica.getInicio(); auxZonaTematica != null; auxZonaTematica = auxZonaTematica.getSiguiente()){
                    if(auxZonaTematica.getZonaTematica().getNombre().equals(cbZonaTematica.getSelectedItem())){
                        listaRestaurante = auxZonaTematica.getRestaurante();
                        listaRestaurante.agregarAdelante(new Restaurante(txtIdRestaurante.getText(), txtNombreRestaurante.getText(), txtHorarioRestaurante.getText(), Float.parseFloat(txtPrecioMEdio.getText())));
                        break;
                    }
                }
                break;
        }
        
        estadoTxt(false);
        estadoBtnGuardar(false);
        listarTabla();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbRestaurante;
    private javax.swing.JTextField txtHorarioRestaurante;
    private javax.swing.JTextField txtIdRestaurante;
    private javax.swing.JTextField txtNombreRestaurante;
    private javax.swing.JTextField txtPrecioMEdio;
    // End of variables declaration//GEN-END:variables
}
