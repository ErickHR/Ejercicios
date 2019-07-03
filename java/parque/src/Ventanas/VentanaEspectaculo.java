
package Ventanas;

import Lista.ListaZonaTematica;
import Lista.ListaEspectaculo;
import Lista.NodoEspectaculo;
import Lista.NodoZonaTematica;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import zonaTematica.Espectaculo;

public class VentanaEspectaculo extends javax.swing.JFrame {

    VentanaPrincipal ventanaPrincipal;
    ListaZonaTematica listaZonaTematica;
    ListaEspectaculo listaEspectaculo;
    DefaultTableModel modelo;
    String arregloEspectaculo[] = new String[8]; 
    String btn;
    int fila;
    public VentanaEspectaculo(ListaZonaTematica lista, VentanaPrincipal ventanaPrincipal) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
        
        this.listaZonaTematica = lista;
        modelo = (DefaultTableModel) tbEspectaculo.getModel();
        estadosTxt(false);
        estadoTxtAgregarTipo(false);
        listarCbZonaTematica();
        listarTabla();
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
                arregloEspectaculo[4] = Float.toString(auxEspectaculo.getEspectaculo().getPrecio());
                arregloEspectaculo[5] = Integer.toString(auxEspectaculo.getEspectaculo().getMinutos());
                arregloEspectaculo[6] = Integer.toString(auxEspectaculo.getEspectaculo().getAforoMaximo());
                arregloEspectaculo[7] = auxZonaTematica.getZonaTematica().getNombre();
                modelo.addRow(arregloEspectaculo);
                cantidad++; 
            }
        }
    }
    public void estadosTxt(boolean booleano){
        txtCodigo.requestFocus();
        txtCodigo.setEnabled(booleano);
        txtNombreEspectaculo.setEnabled(booleano);
        txtPrecio.setEnabled(booleano);
        spMinutos.setEnabled(booleano);
        spAforoMaximo.setEnabled(booleano);
    }
    public void estadoTxtAgregarTipo(boolean booleano){
        txtAgregarTipoEspectaculo.setEnabled(booleano);
    }
    public void modificarTxt(String codigo, String nombre,String precio, int minutos, int aforo){
        txtCodigo.setText(codigo);
        txtNombreEspectaculo.setText(nombre);
        txtPrecio.setText(precio);
        //cbTipoEspectaculo.setSelectedItem(tipo);
        spMinutos.setValue(0);
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
    public boolean unicoIdEditar(){
        int filaSeleccionada = 0;
        for(NodoZonaTematica auxNodoZonaTematica = listaZonaTematica.getInicio(); auxNodoZonaTematica != null; auxNodoZonaTematica = auxNodoZonaTematica.getSiguiente()){
            for(NodoEspectaculo auxEspectaculo = auxNodoZonaTematica.getEspectaculo().getInicio(); auxEspectaculo != null; auxEspectaculo = auxEspectaculo.getSiguiente()){
                if(auxEspectaculo.getEspectaculo().getIdEspectaculo().equals(txtCodigo.getText()) && fila != filaSeleccionada ){
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
            for(NodoEspectaculo auxEspectaculo = auxNodoZonaTematica.getEspectaculo().getInicio(); auxEspectaculo != null; auxEspectaculo = auxEspectaculo.getSiguiente()){
                if(auxEspectaculo.getEspectaculo().getIdEspectaculo().equals(txtNombreEspectaculo.getText()) && fila != filaSeleccionada ){
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
            for(NodoEspectaculo auxEspectaculo = auxNodoZonaTematica.getEspectaculo().getInicio(); auxEspectaculo != null; auxEspectaculo = auxEspectaculo.getSiguiente())
                if(auxEspectaculo.getEspectaculo().getIdEspectaculo().equals(txtCodigo.getText())){
                    JOptionPane.showMessageDialog(null, "inserte otro codigo");
                    return false;
                }
        return true;
    }
    public boolean unicoNombre(){
        for(NodoZonaTematica auxNodoZonaTematica = listaZonaTematica.getInicio(); auxNodoZonaTematica != null; auxNodoZonaTematica = auxNodoZonaTematica.getSiguiente())
            for(NodoEspectaculo auxEspectaculo = auxNodoZonaTematica.getEspectaculo().getInicio(); auxEspectaculo != null; auxEspectaculo = auxEspectaculo.getSiguiente())
                if(auxEspectaculo.getEspectaculo().getIdEspectaculo().equals(txtNombreEspectaculo.getText())){
                    JOptionPane.showMessageDialog(null, "inserte otro nombre");
                    return false;
                }
        return true;
    }
    public boolean listaVacia(){
        if(listaZonaTematica.getInicio().getEspectaculo().getInicio() == null){
            JOptionPane.showMessageDialog(null, "Lista vacia");
            return true;
        }
        return false;
    }
    public boolean filaEsMenoUno(){
        fila = tbEspectaculo.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "seleccion un elemento de la fila");
            return true;
        }
        return false;
    }
    public boolean noSeleccionoFila(){
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "seleccione un elemento de la fila");
            return true;
        }
        return false;
    }
    
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
        spMinutos = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        cbZonaTematica = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        spAforoMaximo = new javax.swing.JSpinner();

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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

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
                "#", "CODIGO", "NOMBRE", "TIPO", "PRECIO", "MINUTOS", "AFORO", "ZONA TEMATICA"
            }
        ));
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

        jLabel8.setText("PRECIO:");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombreEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(36, 36, 36)
                                .addComponent(cbZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(spMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtAgregarTipoEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(spAforoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbTipoEspectaculo, 0, 118, Short.MAX_VALUE)
                                            .addComponent(txtPrecio))
                                        .addGap(18, 18, 18)))
                                .addComponent(btnAgregarTipoEspectaculo)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbZonaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbTipoEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spMinutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(spAforoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgregarTipoEspectaculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnAgregarTipoEspectaculo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if(camposObligatoriosVacios()) return;
        switch(btn){
            case ("NUEVO"):
                if(!unicoId() || !unicoNombre()) return;
                listaEspectaculo = listaZonaTematica.listaEspectaculo(cbZonaTematica.getSelectedItem().toString());
                listaEspectaculo.agregarAdelante(new Espectaculo(txtCodigo.getText(), txtNombreEspectaculo.getText(), cbTipoEspectaculo.getSelectedItem().toString(), Float.parseFloat(txtPrecio.getText()), Integer.parseInt(spMinutos.getValue().toString()), Integer.parseInt(spAforoMaximo.getValue().toString())));
                break;
            case ("EDITAR"):
                if(!unicoIdEditar() || !unicoNombreEditar()) return;
                NodoEspectaculo auxesEspectaculo = listaZonaTematica.listaEspectaculo(cbZonaTematica.getSelectedItem().toString()).modificar(tbEspectaculo.getValueAt(fila, 1).toString());
                auxesEspectaculo.setEspectaculo(new Espectaculo(txtCodigo.getText(), txtNombreEspectaculo.getText(), cbTipoEspectaculo.getSelectedItem().toString(), Float.parseFloat(txtPrecio.getText()), Integer.parseInt(spMinutos.getValue().toString()), Integer.parseInt(spAforoMaximo.getValue().toString())));
                break;
        }
        
        modificarTxt("", "","", 0, 0);
        estadosTxt(false);
        listarTabla();
        estadosBtn(true);
        
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
        btn = "NUEVO";
        estadosTxt(true);
        estadosBtn(false);       
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(listaVacia()) return;
        if(filaEsMenoUno())return;
        
        btn = "EDITAR";
        /*
        modificarTxt(tbEspectaculo.getValueAt(fila, 1).toString(),
                tbEspectaculo.getValueAt(fila, 2).toString() , 
                tbEspectaculo.getValueAt(fila, 3).toString(), 
                Integer.parseInt(tbEspectaculo.getValueAt(fila, 4).toString()), 
                Integer.parseInt(tbEspectaculo.getValueAt(fila, 5).toString()));
                */
        estadosTxt(true);
        estadosBtn(false);
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNombreEspectaculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEspectaculoKeyTyped
        // TODO add your handling code here:
        soloLetras(evt);
    }//GEN-LAST:event_txtNombreEspectaculoKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(listaVacia()) return;
        if(filaEsMenoUno()) return;
        listaEspectaculo = listaZonaTematica.listaEspectaculo(cbZonaTematica.getSelectedItem().toString());
        listaEspectaculo.eliminar(tbEspectaculo.getValueAt(fila, 1).toString());
        listarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(listaZonaTematica.getInicio().getEspectaculo().getInicio() == null) return;
        ventanaPrincipal.listarCbRestauranteEspectaculoAtraccion();
        ventanaPrincipal.estadoMenuAgregarCliente(true);
        
    }//GEN-LAST:event_formWindowClosed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        soloNumeros(evt);
    }//GEN-LAST:event_txtPrecioKeyTyped


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
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
