/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class botones extends javax.swing.JFrame {

    /**
     * Creates new form botones
     */
    public botones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lpl1 = new javax.swing.JLabel();
        jrv1 = new javax.swing.JRadioButton();
        jrv2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jrv1.setText("area");
        jrv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrv1ActionPerformed(evt);
            }
        });

        jrv2.setText("perimetro");
        jrv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrv2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrv2)
                    .addComponent(jrv1)
                    .addComponent(lpl1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lpl1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jrv1)
                .addGap(18, 18, 18)
                .addComponent(jrv2)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrv1ActionPerformed
        // TODO add your handling code here:
        if (this.jrv1.isSelected()){
            this.lpl1.setText("selecciono el area");
        }else{
            this.lpl1.setText("");
        }
    }//GEN-LAST:event_jrv1ActionPerformed

    private void jrv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrv2ActionPerformed
        // TODO add your handling code here:
        if (this.jrv2.isSelected()){
            this.lpl1.setText("selecciono el perimeetro");
        }else{
            this.lpl1.setText("");
        }
    }//GEN-LAST:event_jrv2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton jrv1;
    private javax.swing.JRadioButton jrv2;
    private javax.swing.JLabel lpl1;
    // End of variables declaration//GEN-END:variables
}
