/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import zonaTematica.ZonaTematica;

/**
 *
 * @author PROPIETARIO
 */
public class ListaZonaTematica {
    private NodoZonaTematica inicio;

    public ListaZonaTematica() {
        this.inicio = null;
    }

    public NodoZonaTematica getInicio() {
        return inicio;
    }

    public void setInicio(NodoZonaTematica inicio) {
        this.inicio = inicio;
    }
    
    public void agregarAdelante(ZonaTematica zonaTematica){
        
        NodoZonaTematica nuevo = new NodoZonaTematica(zonaTematica);
        if(inicio == null) inicio = nuevo;
        else{
            NodoZonaTematica aux = inicio;
            while(aux.getSiguiente() != null)
                aux = aux.getSiguiente();
            
            aux.setSiguiente(nuevo);
        }
        
    }
    
    public NodoZonaTematica modificar(String id){
        for(NodoZonaTematica aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getZonaTematica().getIdZonatematica().equals(id))
                return aux;
        return null;
    }
    
    public void eliminar(String id){
        if(inicio.getZonaTematica().getIdZonatematica().equals(id)){
            inicio = inicio.getSiguiente();
            return;
        }
        for(NodoZonaTematica aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getSiguiente().getZonaTematica().getIdZonatematica().equals(id)){
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                return;
            }
    }
    
}
