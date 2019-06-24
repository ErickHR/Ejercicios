/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaTematica;

/**
 *
 * @author PROPIETARIO
 */
public class Atraccion {
    
    private String idAtraccion;
    private String nombre;
    private float estatura;
    private int capacidad;
    private double duracion;

    public Atraccion(String idAtraccion, String nombre, float estatura, int capacidad, double duracion) {
        this.idAtraccion = idAtraccion;
        this.nombre = nombre;
        this.estatura = estatura;
        this.capacidad = capacidad;
        this.duracion = duracion;
    }

    public String getIdAtraccion() {
        return idAtraccion;
    }

    public void setIdAtraccion(String idAtraccion) {
        this.idAtraccion = idAtraccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    
    
    
}
