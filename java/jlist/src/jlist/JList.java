/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jlist;
import javax.swing.JFrame;
/**
 *
 * @author PROPIETARIO
 */
public class JList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        usandoJlist list = new usandoJlist();
        list.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        list.setBounds(350, 100, 500, 500);
        list.setVisible(true);
                
    }
    
}
