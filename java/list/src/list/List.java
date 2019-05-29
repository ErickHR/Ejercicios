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
        
        Scanner teclado = new Scanner(System.in);
        Lista listas = new Lista();
        
        listas.insertarF("erick", 10);
        listas.insertarF("juan", 10);
        listas.insertarF("perez", 0);
        listas.insertarF("isaaac", 0);
        listas.insertarF("pablo", 0);
        listas.showList();
        //listas.eliminar("pablo");
        System.out.println("");
        listas.eliminar("miguel");
        listas.eliminar("margoth");
        
        listas.eliminar("erick");
        listas.showList();
/*
        int opcion;
        do{
            System.out.println("1. añadir");
            System.out.println("2. mostrar");
            System.out.println("3. salir");
            System.out.print("opcion: ");
            opcion = teclado.nextInt();
            System.out.println("");
            switch(opcion){
                case 1:
                    System.out.print("nombre:");
                    String nombre = teclado.nextLine();
                    System.out.print("nota:");
                    int nota = teclado.nextInt();
                    listas.insertarF(nombre, nota);
                    break;
                case 2:
                    listas.showList();
                    break;
            }
        }while(opcion<3);*/
    }
    
}
