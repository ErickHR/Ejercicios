
package Lista;

import zonaTematica.ZonaTematica;

public class ListaZonaTematica {
    private NodoZonaTematica inicio;

    public ListaZonaTematica() {
        this.inicio = null;
    }

    public NodoZonaTematica getInicio() {
        return inicio;
    }

    public void setInicio(NodoZonaTematica inicio) {
        this.inicio = inicio;
    }
    
    public void agregarAdelante(ZonaTematica zonaTematica){
        
        NodoZonaTematica nuevo = new NodoZonaTematica(zonaTematica);
        if(inicio == null) inicio = nuevo;
        else{
            NodoZonaTematica aux = inicio;
            while(aux.getSiguiente() != null)
                aux = aux.getSiguiente();
            
            aux.setSiguiente(nuevo);
        }
        
    }
    
    public NodoZonaTematica modificar(String id){
        for(NodoZonaTematica aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getZonaTematica().getIdZonatematica().equals(id))
                return aux;
        return null;
    }
    
    public void eliminar(String id){
        if(inicio.getZonaTematica().getIdZonatematica().equals(id)){
            inicio = inicio.getSiguiente();
            return;
        }
        for(NodoZonaTematica aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getSiguiente().getZonaTematica().getIdZonatematica().equals(id)){
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                return;
            }
    }
    
    public NodoZonaTematica nodoZonaTematica(String nombreListaZonaTematica){
        for(NodoZonaTematica auxZonaTematica = inicio; auxZonaTematica != null; auxZonaTematica = auxZonaTematica.getSiguiente())
            if(auxZonaTematica.getZonaTematica().getNombre().equals(nombreListaZonaTematica))
                return auxZonaTematica;
        return null;
    } 
    
    public ListaRestaurante listaRestaurante(String nombreListaZonaTematica){
        return nodoZonaTematica(nombreListaZonaTematica).getRestaurante();
    }
    
    public ListaEspectaculo listaEspectaculo(String nombreListaZonaTematica){
        return nodoZonaTematica(nombreListaZonaTematica).getEspectaculo();
    }
    
    public ListaAtraccion listaAtraccion(String nombreListaZonaTematica){
        return nodoZonaTematica(nombreListaZonaTematica).getAtraccion();
    }
    
}
