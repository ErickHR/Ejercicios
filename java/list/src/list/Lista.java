/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Usuario
 */
public class Lista {
    private Nodo top;
    private int tamaño;

    public Lista() {
        this.top = null;
        this.tamaño = 0;
    }
    
    public boolean esVacia(){
        return top == null;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    public void insertarF(String nom, int not){
        Nodo nuevoN = new Nodo();
        nuevoN.setNombre(nom);
        nuevoN.setNota(not);
        if (esVacia()) {
            top = nuevoN;
        }else {
            Nodo temp=top;
            while(temp.getSiguiente() != null){
                temp= temp.getSiguiente();
            }
            temp.setSiguiente(nuevoN);
        }
        this.tamaño++;
    }
    
    public void insertI(String nom, int not){
        
        Nodo nuevoN = new Nodo();
        nuevoN.setNombre(nom);
        nuevoN.setNota(not);
        
        if (esVacia()) {
            top = nuevoN;
        }else {
            
            nuevoN.setSiguiente(top);
            top=nuevoN;
            
        }
        this.tamaño++;
        
    }
    
    public void showList(){
        Nodo temp=top;
        while(temp != null){
            System.out.print("|"+temp.getNombre()+", "+temp.getNota()+"| --->");
            temp = temp.getSiguiente();
        }
    }
    public boolean existe(String nombre){
        Nodo aux = top;
        while(aux.getSiguiente() !=null){
            if(aux.getNombre().equals(nombre)) return true;
            aux = aux.getSiguiente();
        }
        return false;
    }
    public void eliminar(String nombre){
        
        if(esVacia()){
            System.out.println("esta vacio");
        }else{
            //Nodo temp = top;
            if(!existe(nombre)) {
                System.out.println("no existe");
                return;
            }
            if(top.getNombre().equals(nombre)){
                top= top.getSiguiente();
            }else{
                Nodo aux = top;
                while(!aux.getSiguiente().getNombre().equals(nombre)){
                    //temp = aux;
                    aux = aux.getSiguiente();
                }

                aux.setSiguiente(aux.getSiguiente().getSiguiente());
            }
        }
        this.tamaño--;
    }
}
