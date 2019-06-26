/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import parque.Cliente;
import parque.Ticket;

/**
 *
 * @author JuanPablo
 */
public class Nodo {
    private Cliente cliente;
    private Ticket ticket;
    private Nodo siguiente;

    public Nodo(Cliente cliente, Ticket ticket) {
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

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
