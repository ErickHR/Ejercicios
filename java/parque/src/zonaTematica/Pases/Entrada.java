/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaTematica.Pases;

/**
 * ticket para que el cliente ingrese al parque
 * @author PROPIETARIO
 */
public class Entrada {
    private String fecha;
    private float precio;

    public Entrada(String fecha, float precio) {
        this.fecha = fecha;
        this.precio = precio;
    }
    
    public Entrada() {
        this.fecha = "No comprado";
        this.precio = (float) 10.0;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
