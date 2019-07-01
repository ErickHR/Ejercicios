
package Lista;

import zonaTematica.Espectaculo;

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
