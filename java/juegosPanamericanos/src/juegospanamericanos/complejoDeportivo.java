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
public class complejoDeportivo {
    
    private String codigo;
    private String nombre;
    private String direccion;
    private String capacidad;
    private String jefeComplejo;

    public complejoDeportivo(String codigo, String nombre, String direccion, String capacidad, String jefeComplejo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.jefeComplejo = jefeComplejo;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getJefeComplejo() {
        return jefeComplejo;
    }

    public void setJefeComplejo(String jefeComplejo) {
        this.jefeComplejo = jefeComplejo;
    }
    
    
    
}
