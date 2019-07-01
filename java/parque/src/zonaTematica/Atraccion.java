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
    private float estaturaMinima;
    private float precio;
    private int capacidad;//peso;
    private float duracion;

    public Atraccion(String idAtraccion, String nombre, float estaturaMinima,float precio, int capacidad, float duracion) {
        this.idAtraccion = idAtraccion;
        this.nombre = nombre;
        this.estaturaMinima = estaturaMinima;
        this.precio = precio;
        this.capacidad = capacidad;
        this.duracion = duracion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
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

    public float getEstaturaMinima() {
        return estaturaMinima;
    }

    public void setEstaturaMinima(float estaturaMinima) {
        this.estaturaMinima = estaturaMinima;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
    
}
