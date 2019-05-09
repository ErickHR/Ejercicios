/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegospanamericanos;

/**
 *
 * @author Usuario
 */
public class sede {
    
    private String codigo; 
    private String nombre; 
    private String numeroComplejos; 
    private String lugar; 
    private String presupuesto; 

    public sede(String codigo, String nombre, String numeroComplejos, String lugar, String presupuesto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroComplejos = numeroComplejos;
        this.lugar = lugar;
        this.presupuesto = presupuesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroComplejos() {
        return numeroComplejos;
    }

    public void setNumeroComplejos(String numeroComplejos) {
        this.numeroComplejos = numeroComplejos;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public void asignarComlejos(){
        
    }
    
}
