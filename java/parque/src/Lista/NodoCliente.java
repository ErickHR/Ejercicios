
package Lista;

import parque.Cliente;
import zonaTematica.Pases.Entrada;

public class NodoCliente {
    private Cliente cliente;
    private Entrada ticket;
    private NodoCliente siguiente;

    public NodoCliente(Cliente cliente, Entrada ticket) {
        this.cliente = cliente;
        this.ticket = ticket;
        this.siguiente = null;
    }

    public Entrada getTicket() {
        return ticket;
    }

    public void setTicket(Entrada ticket) {
        this.ticket = ticket;
    }
    
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public NodoCliente getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCliente siguiente) {
        this.siguiente = siguiente;
    }
    
}
