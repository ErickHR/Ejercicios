
package Lista;

import zonaTematica.Atraccion;

public class ListaAtraccion {
    private NodoAtraccion inicio;

    public ListaAtraccion() {
        this.inicio = null;
    }

    public NodoAtraccion getInicio() {
        return inicio;
    }

    public void setInicio(NodoAtraccion inicio) {
        this.inicio = inicio;
    }
   
    public void agregarAdelante(Atraccion restaurante){
        
        NodoAtraccion nuevo = new NodoAtraccion(restaurante);
        
        if(inicio == null) {
            inicio = nuevo;
            return;
        }
        
        NodoAtraccion aux;
        
        for(aux = inicio; aux.getSiguiente() != null; aux = aux.getSiguiente()) {}

        aux.setSiguiente(nuevo);
        
    }
    
    public NodoAtraccion modificar(String id){
        for(NodoAtraccion aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getAtraccion().getIdAtraccion().equals(id))
                return aux;
        return null;
    }
    
    public void eliminar(String id){
        if(inicio.getAtraccion().getIdAtraccion().equals(id)){
            inicio = inicio.getSiguiente();
            return;
        }
        for(NodoAtraccion aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getSiguiente().getAtraccion().getIdAtraccion().equals(id)){
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                return;
            }
    }
    
}
