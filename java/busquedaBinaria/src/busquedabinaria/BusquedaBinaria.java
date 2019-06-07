/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedabinaria;

/**
 *
 * @author PROPIETARIO
 */
public class BusquedaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int numero[] = {3,5,7,8,20,67};
        int existe = 68;
        if(busqueda(numero, existe, 0, numero.length-1))
            System.out.println("encontrado");
        else System.out.println("no existe");
        
    }
    
    public static boolean busqueda(int arreglo[], int numero, int primero, int ultimo){
        if(primero > ultimo) return false;
        else{
           int centro = (primero + ultimo)/2;
           if(arreglo[centro] == numero) return true;
           if(arreglo[centro] > numero) return busqueda(arreglo, numero, primero, centro - 1);
           return busqueda(arreglo, numero, centro + 1, ultimo);
        }
    }
    
}
