/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrimonio;

/**
 *
 * @author PROPIETARIO
 */
public class ListaDeConyuge {
    
    //private Persona[] lista = new Persona[10];
    private Persona[][] lista;
    private static int fila = 0;
    public ListaDeConyuge() {
        this.lista = new Persona[20][2];
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        ListaDeConyuge.fila = fila;
    }
    
    public Persona[][] getLista() {
        return lista;
    }

    public void setLista(Persona[][] lista) {
        this.lista = lista;
    }
    
    public void agregar(Persona esposo, Persona esposa){
        lista[fila][0] = esposo;
        lista[fila][1] = esposa;
        /*
        lista[fila][0].setDni(esposo.getDni());
        lista[fila][1].setNombre(esposo.getNombre());
        lista[fila][2].setApellido(esposo.getApellido());
        lista[fila][3].setFechaNacimiento(esposo.getFechaNacimiento());
        
        lista[fila][4].setDni(esposa.getDni());
        lista[fila][5].setNombre(esposa.getNombre());
        lista[fila][6].setApellido(esposa.getApellido());
        lista[fila][7].setFechaNacimiento(esposa.getFechaNacimiento());
        */
        fila ++;
    }
    
    public boolean buscar(Persona arreglo[][], String apellido, int primero, int ultimo,int tipo){
        if(primero > ultimo) return false;
        else{
           int centro = (primero + ultimo)/2;
           if(arreglo[centro][tipo].getApellido().equalsIgnoreCase(apellido)) return true;
           if(arreglo[centro][tipo].getApellido().compareToIgnoreCase(apellido) > 0) return buscar(arreglo, apellido, primero, centro - 1, tipo);
           else return buscar(arreglo, apellido, centro + 1, ultimo, tipo);
        }
    }
    
    public boolean busqueda(String apellido, int tipo){
        return buscar(lista, apellido, 0, fila - 1, tipo);
    }
    
    public void ordenar(int tipo){
        
        Persona aux[];
        for ( int i = 0; i < fila -1 ; i++){
            for ( int j = i+1; j < fila; j++){
                if(lista[i][tipo].getApellido().compareTo(lista[j][tipo].getApellido()) > 0){
                    aux = lista[i];
                    lista[i] = lista[j];
                    lista[j]= aux;
                }
            }
        }
        
    }
    
}
