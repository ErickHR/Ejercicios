/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import zonaTematica.Espectaculo;

/**
 *
 * @author PROPIETARIO
 */
public class ListaEspectaculo {
    private NodoEspectaculo inicio;

    public ListaEspectaculo(NodoEspectaculo inicio) {
        this.inicio = inicio;
    }

    public NodoEspectaculo getInicio() {
        return inicio;
    }

    public void setInicio(NodoEspectaculo inicio) {
        this.inicio = inicio;
    }
    
    public void agregarAdelante(Espectaculo espectaculo){
        
        NodoEspectaculo nuevo = new NodoEspectaculo(espectaculo);
        
        if(inicio == null) inicio = nuevo;
        else{
            
            NodoEspectaculo aux = inicio;
            
            while(aux.getSiguiente() != null)
                aux = aux.getSiguiente();
            
            aux.setSiguiente(nuevo);
            
        }
    }
    
}
