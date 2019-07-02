/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import zonaTematica.Pases.Entrada;

/**
 *
 * @author PROPIETARIO
 */
public class NodoPase {
    private Entrada entrada;
    private NodoPase siguiente;

    public NodoPase(Entrada entrada) {
        this.entrada = entrada;
        this.siguiente = null;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public NodoPase getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPase siguiente) {
        this.siguiente = siguiente;
    }
    
}
