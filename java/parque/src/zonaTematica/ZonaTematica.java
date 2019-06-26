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
public class ZonaTematica {
    private String idZonatematica;
    private String nombre;
    private String descripcion;
    private String color;
    private String tipo;

    public ZonaTematica(String idZonatematica, String nombre, String descripcion, String color) {
        this.idZonatematica = idZonatematica;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
    }
    
    public String getIdZonatematica() {
        return idZonatematica;
    }

    public void setIdZonatematica(String idZonatematica) {
        this.idZonatematica = idZonatematica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
