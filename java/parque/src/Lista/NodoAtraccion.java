
package Lista;

import zonaTematica.Atraccion;

public class NodoAtraccion {
    private Atraccion atraccion;
    private NodoAtraccion siguiente;

    public NodoAtraccion(Atraccion atraccion) {
        this.atraccion = atraccion;
        this.siguiente = null;
    }

    public Atraccion getAtraccion() {
        return atraccion;
    }

    public void setAtraccion(Atraccion atraccion) {
        this.atraccion = atraccion;
    }

    public NodoAtraccion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoAtraccion siguiente) {
        this.siguiente = siguiente;
    }
    
}
