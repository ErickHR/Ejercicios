/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas1;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author PROPIETARIO
 */
public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    
    usuario user ;
    
    public ventana() {
        initComponents();
        
        jtxtName.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese Nombre: "));
        jtxtYears.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese Edad: "));
        jtxtPromedio1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese Promedio 1"));
        jtxtPromedio2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese promedio 2"));
        jtxtPromedio3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese promedio 3"));
        jtxtAMostrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Mostrar"));
        
        ButtonGroup botonesRadio = new ButtonGroup();
        botonesRadio.add(jrbFemenino);
        botonesRadio.add(jrbMasculino);
        
        jtxtAMostrar.append("***MOSTRAR DATOS DEL USUARIO***");
        
        ManejadorCheck maneja = new ManejadorCheck();
        jCheckKursiva.addItemListener(maneja);
        jCheckNegrita.addItemListener(maneja);
        
    }
     
    private class ManejadorCheck implements ItemListener{
        
        private int valNegrita = Font.PLAIN;
        private int valKursiva = Font.PLAIN;
        
        public void itemStateChanged(ItemEvent evt){
            
            if  ( evt.getSource() == jCheckKursiva )
                valKursiva = jCheckKursiva.isSelected()? Font.BOLD : Font.PLAIN;
            if ( evt.getSource() == jCheckNegrita )
                valNegrita = jCheckNegrita.isSelected()? Font.ITALIC : Font.PLAIN;
            
            jtxtAMostrar.setFont( new Font(null, valKursiva+valNegrita, 12));
            
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jrbFemenino = new javax.swing.JRadioButton();
        jCheckNegrita = new javax.swing.JCheckBox();
        jCheckKursiva = new javax.swing.JCheckBox();
        jtxtName = new javax.swing.JTextField();
        jtxtYears = new javax.swing.JTextField();
        jtxtPromedio1 = new javax.swing.JTextField();
        jtxtPromedio2 = new javax.swing.JTextField();
        jtxtPromedio3 = new javax.swing.JTextField();
        jbtnCalcularPromedio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAMostrar = new javax.swing.JTextArea();
        jrbMasculino = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        setForeground(new java.awt.Color(255, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jrbFemenino.setBackground(new java.awt.Color(0, 0, 0));
        jrbFemenino.setForeground(new java.awt.Color(255, 255, 255));
        jrbFemenino.setText("Femenino");

        jCheckNegrita.setBackground(new java.awt.Color(0, 0, 0));
        jCheckNegrita.setForeground(new java.awt.Color(255, 255, 255));
        jCheckNegrita.setText("Negrita");

        jCheckKursiva.setBackground(new java.awt.Color(0, 0, 0));
        jCheckKursiva.setForeground(new java.awt.Color(255, 255, 255));
        jCheckKursiva.setText("Kursiva");

        jtxtName.setBackground(new java.awt.Color(102, 102, 102));
        jtxtName.setForeground(new java.awt.Color(255, 255, 255));
        jtxtName.setCaretColor(new java.awt.Color(255, 255, 255));
        jtxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNameActionPerformed(evt);
            }
        });

        jtxtYears.setBackground(new java.awt.Color(102, 102, 102));
        jtxtYears.setForeground(new java.awt.Color(255, 255, 255));
        jtxtYears.setCaretColor(new java.awt.Color(255, 255, 255));
        jtxtYears.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtYearsActionPerformed(evt);
            }
        });

        jtxtPromedio1.setBackground(new java.awt.Color(102, 102, 102));
        jtxtPromedio1.setForeground(new java.awt.Color(240, 240, 240));
        jtxtPromedio1.setCaretColor(new java.awt.Color(240, 240, 240));
        jtxtPromedio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPromedio1ActionPerformed(evt);
            }
        });

        jtxtPromedio2.setBackground(new java.awt.Color(102, 102, 102));
        jtxtPromedio2.setForeground(new java.awt.Color(255, 255, 255));
        jtxtPromedio2.setCaretColor(new java.awt.Color(240, 240, 240));
        jtxtPromedio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPromedio2ActionPerformed(evt);
            }
        });

        jtxtPromedio3.setBackground(new java.awt.Color(102, 102, 102));
        jtxtPromedio3.setForeground(new java.awt.Color(240, 240, 240));
        jtxtPromedio3.setCaretColor(new java.awt.Color(102, 102, 102));
        jtxtPromedio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPromedio3ActionPerformed(evt);
            }
        });

        jbtnCalcularPromedio.setBackground(new java.awt.Color(102, 102, 102));
        jbtnCalcularPromedio.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCalcularPromedio.setText("Calcular Promedio");
        jbtnCalcularPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularPromedioActionPerformed(evt);
            }
        });

        jtxtAMostrar.setBackground(new java.awt.Color(102, 102, 102));
        jtxtAMostrar.setColumns(20);
        jtxtAMostrar.setForeground(new java.awt.Color(255, 255, 255));
        jtxtAMostrar.setRows(5);
        jScrollPane1.setViewportView(jtxtAMostrar);

        jrbMasculino.setBackground(new java.awt.Color(0, 0, 0));
        jrbMasculino.setForeground(new java.awt.Color(255, 255, 255));
        jrbMasculino.setText("Masculino");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtYears, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbFemenino))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jCheckNegrita)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckKursiva)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxtPromedio3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnCalcularPromedio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxtPromedio1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtPromedio2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPromedio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtPromedio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtPromedio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnCalcularPromedio)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbMasculino)
                            .addComponent(jrbFemenino))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckNegrita)
                            .addComponent(jCheckKursiva))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtYearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtYearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtYearsActionPerformed

    private boolean promedio1(){
        return Double.parseDouble(jtxtPromedio1.getText()) >= 0 && Double.parseDouble(jtxtPromedio1.getText()) <= 20;
    }
    private boolean promedio2(){
        return Double.parseDouble(jtxtPromedio2.getText()) >= 0 && Double.parseDouble(jtxtPromedio2.getText()) <= 20;
    }
    private boolean promedio3(){
        return Double.parseDouble(jtxtPromedio3.getText()) >= 0 && Double.parseDouble(jtxtPromedio3.getText()) <= 20;
    }
    
    private boolean edad(){
        return Integer.parseInt(jtxtYears.getText()) > 0 && Integer.parseInt(jtxtYears.getText()) <= 60;
    }
    
    private void jbtnCalcularPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularPromedioActionPerformed
        // TODO add your handling code here:
        if ( jtxtName.getText().equals("") || jtxtYears.getText().equals("") || jtxtPromedio1.getText().equals("") || jtxtPromedio2.getText().equals("") || jtxtPromedio3.getText().equals("")){
            JOptionPane.showMessageDialog(ventana.this, "campo vacio", "ERROR DE CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        }else {
            if( promedio1() && promedio2() && promedio3() ){
            
                if ( edad() ){
                    
                    if(jrbMasculino.isSelected() || jrbFemenino.isSelected()){
                        user = new usuario( jtxtName.getText(), Integer.parseInt(jtxtYears.getText()), Double.parseDouble(jtxtPromedio1.getText()), Double.parseDouble(jtxtPromedio2.getText()), Double.parseDouble(jtxtPromedio3.getText()));
                        String genero;
                        if ( jrbMasculino.isSelected()) genero=jrbMasculino.getText();
                        else genero=jrbFemenino.getText();
                        
                        String mensaje = String.format("---DATOS DEL USUARIO---\nNombre: %s\nEdad: %d\nGenero: %s\nPromedio: %.1f", user.getNombre(), user.getEdad(), genero, user.Promedio());

                        jtxtAMostrar.setText(mensaje);
                    }else{
                        
                        JOptionPane.showMessageDialog(ventana.this, "Seleccione un genero", "ERROR DE GENERO", JOptionPane.ERROR_MESSAGE);
                        
                    }

                } else JOptionPane.showMessageDialog(ventana.this, " edad entre 0 y 60 años", "Error de edad", JOptionPane.ERROR_MESSAGE);

            }else{
                JOptionPane.showMessageDialog(null, "promedio entre 0 y 20", "Error promedio", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
        
    }//GEN-LAST:event_jbtnCalcularPromedioActionPerformed

    
    
    
    private void jtxtPromedio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPromedio1ActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jtxtPromedio1ActionPerformed

    private void jtxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNameActionPerformed

    private void jtxtPromedio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPromedio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPromedio2ActionPerformed

    private void jtxtPromedio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPromedio3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPromedio3ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckKursiva;
    private javax.swing.JCheckBox jCheckNegrita;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCalcularPromedio;
    private javax.swing.JRadioButton jrbFemenino;
    private javax.swing.JRadioButton jrbMasculino;
    private javax.swing.JTextArea jtxtAMostrar;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtPromedio1;
    private javax.swing.JTextField jtxtPromedio2;
    private javax.swing.JTextField jtxtPromedio3;
    private javax.swing.JTextField jtxtYears;
    // End of variables declaration//GEN-END:variables
}
