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
public class NodoEspectaculo {
    private Espectaculo espectaculo;
    private NodoEspectaculo siguiente;

    public NodoEspectaculo(Espectaculo espectaculo) {
        this.espectaculo = espectaculo;
        this.siguiente = null;
    }

    public Espectaculo getEspectaculo() {
        return espectaculo;
    }

    public void setEspectaculo(Espectaculo espectaculo) {
        this.espectaculo = espectaculo;
    }

    public NodoEspectaculo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEspectaculo siguiente) {
        this.siguiente = siguiente;
    }
    
}
