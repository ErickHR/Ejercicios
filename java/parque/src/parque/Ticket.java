/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parque;

/**
 * ticket para que el cliente ingrese al parque
 * @author PROPIETARIO
 */
public class Ticket {
    private String fecha;
    private float precio;

    public Ticket(String fecha, float precio) {
        this.fecha = fecha;
        this.precio = precio;
    }
    
    public Ticket() {
        this.fecha = "No comprado";
        this.precio = (float) 0;
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
