/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcocheckbox;
import javax.swing.JFrame;
/**
 *
 * @author PROPIETARIO
 */
public class MarcoCheckBox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cajas c1 = new cajas();
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.setTitle("PRUEBAS CON CHECKBOX");
        c1.setBounds(350, 200, 400, 100);
        c1.setVisible(true);
        
    }
    
}
