/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebascampotexto;

import javax.swing.JFrame;

/**
 *
 * @author PROPIETARIO
 */
public class PruebasCampoTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here+
        campoTexto campText = new campoTexto();
        campText.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campText.setSize(500, 500);
        campText.setVisible(true);
        
    }
    
}
