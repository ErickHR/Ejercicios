/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etiquetaslabel;
import javax.swing.JFrame;
/**
 *
 * @author PROPIETARIO
 */
public class EtiquetasLabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        claseEtiqueta ticket = new claseEtiqueta();
        ticket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticket.setSize(500, 500);
        ticket.setVisible(true);
    }
    
}
