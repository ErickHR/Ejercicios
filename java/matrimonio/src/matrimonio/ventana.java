/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrimonio;

import static javax.swing.BorderFactory.createTitledBorder;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.runtime.Undefined;
/**
 *
 * @author PROPIETARIO
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    DefaultTableModel modelo;
    private ListaDeConyuge listaMatrimonio = new ListaDeConyuge();
    public ventana() {
        initComponents();
        estadoBotones(btnAgregar.getText(), false);
        estadosTextos(false);
        
        txtApellidoEsposo.setBorder(createTitledBorder("Apellido: "));
        txtApellidoEsposa.setBorder(createTitledBorder("Apellido: "));
        txtFechaNacimientoEsposa.setBorder(createTitledBorder("Fecha de Nacimiento: "));
        txtFechaNacimientoEsposo.setBorder(createTitledBorder("Fecha de Nacimiento: "));
        txtNombreEsposa.setBorder(createTitledBorder("Nombre: "));
        txtNombreEsposo.setBorder(createTitledBorder("Nombre: "));
        txtDniEsposo.setBorder(createTitledBorder("Dni:"));
        txtDniEsposa.setBorder(createTitledBorder("Dni:"));
        
        modelo = new DefaultTableModel();
        /*
        modelo.addColumn("ESPOSO");
        modelo.addColumn("ESPOSA");
        */
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("F.NAC");
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("F.NAC");
        
        /*
        String[] titulo = {"DNI","NOMBRE","APELLIDO","F.NAC","DNI","NOMBRE","APELLIDO","F.NAC"};
        modelo.addRow(titulo);
        */
        Tabla.setModel(modelo);
        
    }

    public void estadoBotones(String boton, boolean valor){
        switch(boton){
            case "AGREGAR":
                btnBuscar.setEnabled(valor);
                btnListar.setEnabled(valor);
                btnOrdenar.setEnabled(valor);
                break;
            case "BUSCAR":
                btnBuscar.setEnabled(valor);
                btnAgregar.setEnabled(valor);
                btnListar.setEnabled(valor);
                btnOrdenar.setEnabled(valor);
                break;
        }
    }
    
    public boolean unicoDni(){
        for(int i = 0; i < listaMatrimonio.getFila(); i++){
            if((txtDniEsposo.getText().equals(listaMatrimonio.getLista()[i][0].getDni()) || txtDniEsposa.getText().equals(listaMatrimonio.getLista()[i][1].getDni()))){
                JOptionPane.showMessageDialog(this, "ya existe el dni");
                return false;
            }
        }
        return true;
    }
    
    public void estadosTextos(boolean valor){
        txtApellidoEsposa.setEditable(valor);
        txtApellidoEsposo.setEditable(valor);
        txtDniEsposa.setEditable(valor);
        txtDniEsposo.setEditable(valor);
        txtFechaNacimientoEsposa.setEditable(valor);
        txtFechaNacimientoEsposo.setEditable(valor);
        txtNombreEsposa.setEditable(valor);
        txtNombreEsposo.setEditable(valor);
    }
    public void vaciarTextos(){
        txtApellidoEsposa.setText("");
        txtApellidoEsposo.setText("");
        txtDniEsposa.setText("");
        txtDniEsposo.setText("");
        txtFechaNacimientoEsposa.setText("");
        txtFechaNacimientoEsposo.setText("");
        txtNombreEsposa.setText("");
        txtNombreEsposo.setText("");
    }
    public boolean estaVacio(){
        if(txtApellidoEsposa.getText().equals("") || txtApellidoEsposo.getText().equals("")
                || txtDniEsposa.getText().equals("") || txtDniEsposo.getText().equals("")
                || txtFechaNacimientoEsposa.getText().equals("")||txtFechaNacimientoEsposo.getText().equals("")
                || txtNombreEsposa.getText().equals("") || txtNombreEsposo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "rellenar todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        Tabla = new javax.swing.JTable();
        txtNombreEsposo = new javax.swing.JTextField();
        txtApellidoEsposo = new javax.swing.JTextField();
        txtFechaNacimientoEsposo = new javax.swing.JTextField();
        txtNombreEsposa = new javax.swing.JTextField();
        txtApellidoEsposa = new javax.swing.JTextField();
        txtFechaNacimientoEsposa = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOrdenar = new javax.swing.JButton();
        txtDniEsposo = new javax.swing.JTextField();
        txtDniEsposa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "titulo 5", "titulo 6", "titulo 7", "titulo 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setResizable(false);
        }

        txtNombreEsposo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEsposoActionPerformed(evt);
            }
        });
        txtNombreEsposo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEsposoKeyTyped(evt);
            }
        });

        txtApellidoEsposo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoEsposoKeyTyped(evt);
            }
        });

        txtFechaNacimientoEsposo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaNacimientoEsposoKeyTyped(evt);
            }
        });

        txtNombreEsposa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEsposaKeyTyped(evt);
            }
        });

        txtApellidoEsposa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoEsposaKeyTyped(evt);
            }
        });

        txtFechaNacimientoEsposa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoEsposaActionPerformed(evt);
            }
        });
        txtFechaNacimientoEsposa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaNacimientoEsposaKeyTyped(evt);
            }
        });

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("ESPOSO");

        jLabel2.setText("ESPOSA");

        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        txtDniEsposo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniEsposoKeyTyped(evt);
            }
        });

        txtDniEsposa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniEsposaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtApellidoEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaNacimientoEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDniEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2)
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDniEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombreEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFechaNacimientoEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDniEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtApellidoEsposo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaNacimientoEsposo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDniEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreEsposa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidoEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFechaNacimientoEsposa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaNacimientoEsposaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoEsposaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoEsposaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(btnAgregar.getText().equals("AGREGAR")){
            estadosTextos(true);
            estadoBotones(btnAgregar.getText(), false);
            btnAgregar.setText("GUARDAR");
            return;
        }
        
        if(estaVacio()) return;
        if(txtDniEsposa.getText().equals(txtDniEsposo.getText())){
            JOptionPane.showMessageDialog(this, "dni esposa y esposa iguales");
            return;
        }
        if(!unicoDni()) return;
        Persona esposo = new Persona(txtDniEsposo.getText(), txtNombreEsposo.getText(), txtApellidoEsposo.getText(), txtFechaNacimientoEsposo.getText());
        Persona esposa = new Persona(txtDniEsposa.getText(), txtNombreEsposa.getText(), txtApellidoEsposa.getText(), txtFechaNacimientoEsposa.getText());
        
        listaMatrimonio.agregar(esposo, esposa);
        estadosTextos(false);
        vaciarTextos();
        btnAgregar.setText("AGREGAR");
        estadoBotones(btnAgregar.getText(), true);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        String lista[] = new String[8];
        
        modelo.setRowCount(0);
        
        for (int i = 0; i < listaMatrimonio.getFila(); i++) {
            lista[0] = listaMatrimonio.getLista()[i][0].getDni();
            lista[1] = listaMatrimonio.getLista()[i][0].getNombre();
            lista[2] = listaMatrimonio.getLista()[i][0].getApellido();
            lista[3] = listaMatrimonio.getLista()[i][0].getFechaNacimiento();
            
            lista[4] = listaMatrimonio.getLista()[i][1].getDni();
            lista[5] = listaMatrimonio.getLista()[i][1].getNombre();
            lista[6] = listaMatrimonio.getLista()[i][1].getApellido();
            lista[7] = listaMatrimonio.getLista()[i][1].getFechaNacimiento();
            modelo.addRow(lista);
        }
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String buscar = (String) JOptionPane.showInputDialog(null, "seleccione categoria", "Busqueda", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Esposo", "Esposa"}, "1");
        int tipo ;
        if(buscar.equals("Esposo")){
            tipo = 0;
            listaMatrimonio.ordenar(tipo);
        }
        else{
            tipo = 1;
            listaMatrimonio.ordenar(tipo);
        }
        btnListarActionPerformed(evt);
        String buscador;
        do{
            buscador = JOptionPane.showInputDialog("Ingrese apellido: ");
        }while( buscador == null || "".equals(buscador) );
        if(listaMatrimonio.busqueda(buscador, tipo)) JOptionPane.showMessageDialog(this, "existe");
        else JOptionPane.showMessageDialog(this, "no existe");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        // TODO add your handling code here:
        
        String ordenar = (String) JOptionPane.showInputDialog(null, "seleccione categoria", "Ordenamiento", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Esposo", "Esposa"}, "1");
        if(ordenar.equals("Esposo"))
            listaMatrimonio.ordenar(0);
        else listaMatrimonio.ordenar(1);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void txtDniEsposoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniEsposoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDniEsposoKeyTyped

    private void txtDniEsposaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniEsposaKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDniEsposaKeyTyped

    private void txtNombreEsposoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEsposoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEsposoActionPerformed

    private void txtNombreEsposoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEsposoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreEsposoKeyTyped

    private void txtApellidoEsposoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEsposoKeyTyped
        // TODO add your handling code here:
        char validar =  evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoEsposoKeyTyped

    private void txtFechaNacimientoEsposoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaNacimientoEsposoKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaNacimientoEsposoKeyTyped

    private void txtNombreEsposaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEsposaKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreEsposaKeyTyped

    private void txtApellidoEsposaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoEsposaKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoEsposaKeyTyped

    private void txtFechaNacimientoEsposaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaNacimientoEsposaKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtFechaNacimientoEsposaKeyTyped

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidoEsposa;
    private javax.swing.JTextField txtApellidoEsposo;
    private javax.swing.JTextField txtDniEsposa;
    private javax.swing.JTextField txtDniEsposo;
    private javax.swing.JTextField txtFechaNacimientoEsposa;
    private javax.swing.JTextField txtFechaNacimientoEsposo;
    private javax.swing.JTextField txtNombreEsposa;
    private javax.swing.JTextField txtNombreEsposo;
    // End of variables declaration//GEN-END:variables
}