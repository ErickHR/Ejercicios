
package Lista;

import parque.Cliente;
import parque.Ticket;

public class NodoCliente {
    private Cliente cliente;
    private Ticket ticket;
    private NodoCliente siguiente;

    public NodoCliente(Cliente cliente, Ticket ticket) {
        this.cliente = cliente;
        this.ticket = ticket;
        this.siguiente = null;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
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
