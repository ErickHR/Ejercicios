/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class arrayProducto {
    ArrayList<producto> listaProducto;
    public arrayProducto(){
        listaProducto = new ArrayList<>();
    }
    
    public void adicionar(producto p){
        listaProducto.add(p);
    }
    public void eliminar(int i){
        listaProducto.remove(i);
    }
    public producto consultar(int i){
        return listaProducto.get(i-1);
    }
    public producto consultarCodigo(String codigo){
        for(int i = 0; i < listaProducto.size(); i++){
            if(listaProducto.get(i).getCodigo().equals(codigo)){
                return listaProducto.get(i);
            }
        }
        return null;
    }
    public int cantidadProducto(){
        return listaProducto.size();
    }
    
    public producto Caro(String produc){
        float masCaro= listaProducto.get(0).getPrecio();
        int j=0;
        for(int i = 1; i < listaProducto.size(); i++){
            if(listaProducto.get(i).getPrecio()>masCaro){
                masCaro = listaProducto.get(i).getPrecio();
                j=i;
            }
        }
        return listaProducto.get(j);
    }
    public producto barato(String produc){
        float masBarato= listaProducto.get(0).getPrecio();
        int j=0;
        for(int i = 1; i < listaProducto.size(); i++){
            if(listaProducto.get(i).getPrecio()<masBarato){
                masBarato = listaProducto.get(i).getPrecio();
                j=i;
            }
        }
        return listaProducto.get(j);
    }
}
