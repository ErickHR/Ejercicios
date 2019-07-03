
package Lista;

import zonaTematica.Espectaculo;

public class ListaEspectaculo {
    private NodoEspectaculo inicio;

    public ListaEspectaculo() {
        this.inicio = null;
    }

    public NodoEspectaculo getInicio() {
        return inicio;
    }

    public void setInicio(NodoEspectaculo inicio) {
        this.inicio = inicio;
    }
    
    public void agregarAdelante(Espectaculo espectaculo){
        
        NodoEspectaculo nuevo = new NodoEspectaculo(espectaculo);
        
        if(inicio == null){
            inicio = nuevo;
            return;
        }
        
        NodoEspectaculo auxEspectaculo;

        for(auxEspectaculo = inicio; auxEspectaculo.getSiguiente() != null; auxEspectaculo = auxEspectaculo.getSiguiente()) {}

        auxEspectaculo.setSiguiente(nuevo);
        
    }
    
    public NodoEspectaculo modificar(String codigo){
        for(NodoEspectaculo aux = inicio; aux != null; aux = aux.getSiguiente()){
            if(aux.getEspectaculo().getIdEspectaculo().equals(codigo))
                return aux;
        }
        return null;
    }
    
    public void eliminar(String id){
        if(inicio.getEspectaculo().getIdEspectaculo().equals(id)){
            inicio = inicio.getSiguiente();
            return;
        }
        for(NodoEspectaculo aux = inicio; aux != null; aux = aux.getSiguiente())
            if(aux.getSiguiente().getEspectaculo().getIdEspectaculo().equals(id)){
                aux.setSiguiente(aux.getSiguiente().getSiguiente());
                return;
            }
    }
    
}
