/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista listas = new Lista();
        
        listas.insertarF("erick", 10);
        listas.insertarF("juan", 10);
        listas.insertarF("perez", 0);
        listas.insertarF("isaaac", 0);
        listas.insertarF("pablo", 0);
        listas.showList();
        System.out.println("");
        listas.eliminar("miguel");
        listas.eliminar("margoth");
        
        listas.eliminar("erick");
        listas.showList();
    }
    
}
