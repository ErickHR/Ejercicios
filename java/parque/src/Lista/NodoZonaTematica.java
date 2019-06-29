/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import zonaTematica.Atraccion;
import zonaTematica.ZonaTematica;

/**
 *
 * @author PROPIETARIO
 */
public class NodoZonaTematica {
    
    private ZonaTematica zonaTematica;
    private ListaRestaurante restaurante;
    private ListaEspectaculo espectaculo;
    private ListaAtraccion atraccion;
    private NodoZonaTematica siguiente;

    public NodoZonaTematica(ZonaTematica zonaTematica) {
        this.zonaTematica = zonaTematica;
        this.restaurante = new ListaRestaurante();
        this.espectaculo = new ListaEspectaculo();
        this.atraccion = new ListaAtraccion();
        this.siguiente = null;
    }

    public ListaAtraccion getAtraccion() {
        return atraccion;
    }

    public void setAtraccion(ListaAtraccion atraccion) {
        this.atraccion = atraccion;
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
