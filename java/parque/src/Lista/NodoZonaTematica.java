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
    private ListaEspectaculo espectaculo;
    private NodoZonaTematica siguiente;

    public NodoZonaTematica(ZonaTematica zonaTematica) {
        this.zonaTematica = zonaTematica;
        this.restaurante = new ListaRestaurante();
        this.espectaculo = new ListaEspectaculo();
        this.siguiente = null;
    }

    public ListaEspectaculo getEspectaculo() {
        return espectaculo;
    }

    public void setEspectaculo(ListaEspectaculo espectaculo) {
        this.espectaculo = espectaculo;
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
