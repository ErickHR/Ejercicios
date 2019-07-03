
package Lista;

import zonaTematica.Restaurante;

public class ListaRestaurante {
    private NodoRestaurante inicio;

    public ListaRestaurante() {
        this.inicio = null;
    }

    public NodoRestaurante getInicio() {
        return inicio;
    }

    public void setInicio(NodoRestaurante inicio) {
        this.inicio = inicio;
    }
    
    public void agregarAdelante(Restaurante restaurante){
        
        NodoRestaurante nuevo = new NodoRestaurante(restaurante);
        
        if(inicio == null) {
            inicio = nuevo;
            return;
        }
        
        NodoRestaurante aux;
        
        for(aux = inicio; aux.getSiguiente() != null; aux = aux.getSiguiente()) {}

        aux.setSiguiente(nuevo);
        
    }
    
    public NodoRestaurante modificar(String id){
        for(NodoRestaurante auxRestaurante = inicio; auxRestaurante != null; auxRestaurante = auxRestaurante.getSiguiente())
            if(auxRestaurante.getRestaurante().getIdRestaurante().equals(id))
                return auxRestaurante;
        return null;
    }
    
    public void eliminar(String id){
        if(inicio.getRestaurante().getIdRestaurante().equals(id)){
            inicio = inicio.getSiguiente();
            return;
        }
        for(NodoRestaurante aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getSiguiente().getRestaurante().getIdRestaurante().equals(id)){
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                return;
            }
    }
}
