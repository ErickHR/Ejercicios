/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import zonaTematica.Restaurante;

/**
 *
 * @author PROPIETARIO
 */
public class ListaRestaurante {
    private NodoRestaurante inicio;

    public ListaRestaurante() {
        this.inicio = null;
    }

    public NodoRestaurante getInicio() {
        return inicio;
    }

    public void setInicio(NodoRestaurante inicio) {
        this.inicio = inicio;
    }
    
    public void agregarAdelante(Restaurante restaurante){
        
        NodoRestaurante nuevo = new NodoRestaurante(restaurante);
        
        if(inicio == null) {
            inicio = nuevo;
            return;
        }
        
        NodoRestaurante aux;
        
        for(aux = inicio; aux.getSiguiente() != null; aux = aux.getSiguiente()) {}

        aux.setSiguiente(nuevo);
        
    }
    
    public NodoRestaurante modificar(String id){
        for(NodoRestaurante aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getRestaurante().getIdRestaurante().equals(id))
                return aux;
        return null;
    }
    
    public void eliminar(String id){
        if(inicio.getRestaurante().getIdRestaurante().equals(id)){
            inicio = inicio.getSiguiente();
            return;
        }
        for(NodoRestaurante aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getSiguiente().getRestaurante().getIdRestaurante().equals(id)){
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                return;
            }
    }
}
