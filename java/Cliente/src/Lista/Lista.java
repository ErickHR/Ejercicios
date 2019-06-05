/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import cliente.Persona;
/**
 *
 * @author PROPIETARIO
 */
public class Lista {
    
    private Nodo top;
    private int cantidad;
    public Lista() {
        this.top = null;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public Nodo getTop() {
        return top;
    }

    public void setTop(Nodo top) {
        this.top = top;
    }
    
    public void insertarFinal(Persona cliente){
        Nodo nuevo = new Nodo();
        nuevo.setDireccion(cliente.getDireccion());
        nuevo.setDni(cliente.getDni());
        nuevo.setEmail(cliente.getEmail());
        nuevo.setNombre(cliente.getNombre());
        nuevo.setTelefono(cliente.getTelefono());
        if( top == null ){
            top = nuevo;
        } else {
            Nodo aux = top;
            while ( aux.getSiguiente() != null ){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        cantidad++;
    }
    
    public boolean modificar(int orden, Nodo nuevo){
        
        if(top == null){
            return false;
        }else{
            Nodo aux = top;
            int ubicacion = 1;
            while(aux != null){
                if(ubicacion == orden) break;
                aux = aux.getSiguiente();
                ubicacion++;
            }
            aux.setDni(nuevo.getDni());
            aux.setDireccion(nuevo.getDireccion());
            aux.setEmail(nuevo.getEmail());
            aux.setNombre(nuevo.getNombre());
            aux.setTelefono(nuevo.getTelefono());
        }
        return true;
    }
    
    public void eliminar(int orden){
        
        if(orden == 1){
            top = top.getSiguiente();
        }else{
            Nodo aux = top;
            int ubicacion = 1;
            while(aux != null){
                if(ubicacion == orden-1) break;
                ubicacion++;
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
        }
        cantidad --;
    }
    
}
