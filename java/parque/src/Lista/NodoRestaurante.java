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
public class NodoRestaurante {
    
    private Restaurante restaurante;
    private NodoRestaurante siguiente;

    public NodoRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
        this.siguiente = null;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public NodoRestaurante getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoRestaurante siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}
