/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private String clave;
    
    public Usuario(String nombre, String clave){
        this.clave=clave;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

   // @Override
    //public String toString() {
    ///    return "Usuario{" + "nombre=" + nombre + ", clave=" + clave + '}';
    //}

    
    
}