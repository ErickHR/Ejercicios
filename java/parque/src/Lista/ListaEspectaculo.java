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

    public ListaEspectaculo() {
        this.inicio = null;
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
    
    public NodoEspectaculo modificar(String codigo){
        for(NodoEspectaculo aux = inicio; aux != null; aux = aux.getSiguiente()){
            if(aux.getEspectaculo().getIdEspectaculo().equals(codigo)) return aux;
        }
        return null;
    }
    
}
