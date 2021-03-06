
package Lista;

import parque.Cliente;
import zonaTematica.Pases.Entrada;

public class ListaCliente { 
    
    private NodoCliente inicio;
    private int cantidad = 0;

    public ListaCliente() {
        this.inicio = null;
    }

    public NodoCliente getInicio() {
        return inicio;
    }

    public void setInicio(NodoCliente inicio) {
        this.inicio = inicio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void agregarAdelante(Cliente cliente, Entrada ticket){
        
        cantidad++;
        
        NodoCliente nuevo = new NodoCliente(cliente, ticket);
        
        if(inicio == null) {
            inicio = nuevo;
            return;
        }
        
        NodoCliente aux;
        
        for(aux = inicio; aux.getSiguiente() != null; aux = aux.getSiguiente()) {}

        aux.setSiguiente(nuevo);
        
    }
    
    public void modificar(String dni, Cliente cliente){
        
        NodoCliente aux = buscar(dni);
        aux.setCliente(cliente);
        
    }
    
    public void eliminar(String dni){
        
        if(inicio.getCliente().getDni().equals(dni)) {
            inicio = inicio.getSiguiente();
            return;
        }
        for(NodoCliente aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getSiguiente().getCliente().getDni().equals(dni)){
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                return;
            }
        
    }
    
    public NodoCliente buscar(String dni){
        
        for(NodoCliente aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getCliente().getDni().equals(dni)) return aux;
        
        return null;
    }
    
}
