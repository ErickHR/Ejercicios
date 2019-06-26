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
public class Lista { 
    
    private Nodo inicio;
    private int cantidad = 0;

    public Lista() {
        this.inicio = null;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void agregarAdelante(Cliente cliente, Ticket ticket){
        
        Nodo nuevo = new Nodo(cliente, ticket);
        
        if(inicio == null) inicio = nuevo;
        else{
            
            Nodo aux = inicio;
            
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            
            aux.setSiguiente(nuevo);
            
        }
        
        cantidad++;
        
    }
    
    public void modificar(String dni, Cliente cliente){
        
        //for(Nodo aux = inicio; aux != null; aux = aux.getSiguiente()){
            
          //  if(aux.getCliente().getDni().equals(dni)) aux.setCliente(cliente);
            
        //}
        
        Nodo aux = buscar(dni);
        aux.setCliente(cliente);
        
    }
    
    public void eliminar(String dni){
        
        if(inicio.getCliente().getDni().equals(dni)) inicio = inicio.getSiguiente();
        else{
            
            for(Nodo aux = inicio; aux != null; aux = aux.getSiguiente())
                if(aux.getSiguiente().getCliente().getDni().equals(dni)){
                    aux.setSiguiente(aux.getSiguiente().getSiguiente());
                    return;
                }
            
        }
        
    }
    
    public Nodo buscar(String dni){
        
        for(Nodo aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getCliente().getDni().equals(dni)) return aux;
        
        return null;
    }
    
}
