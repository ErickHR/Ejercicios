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
public class NodoZonaTematica {
    
    private ZonaTematica zonaTematica;
    private ListaRestaurante restaurante;
    private NodoZonaTematica siguiente;

    public NodoZonaTematica(ZonaTematica zonaTematica) {
        this.zonaTematica = zonaTematica;
        this.restaurante = null;
        this.siguiente = null;
    }

    public ListaRestaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(ListaRestaurante restaurante) {
        this.restaurante = restaurante;
    }
    
    public ZonaTematica getZonaTematica() {
        return zonaTematica;
    }

    public void setZonaTematica(ZonaTematica zonaTematica) {
        this.zonaTematica = zonaTematica;
    }

    public NodoZonaTematica getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoZonaTematica siguiente) {
        this.siguiente = siguiente;
    }
    
}
