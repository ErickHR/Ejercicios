/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import javax.swing.JFrame;
/**
 *
 * @author PROPIETARIO
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ventana vnt =  new ventana();
        vnt.setBounds(200, 500, 500, 500);
        vnt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vnt.setVisible(true);
        
    }
    
}
