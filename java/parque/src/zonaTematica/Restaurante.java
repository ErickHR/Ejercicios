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
public class Restaurante {
    private String idRestaurante;
    private String nombre;
    private String horario;
    private float precioMedio;

    public Restaurante(String idRestaurante, String nombre, String horario, float precioMedio) {
        this.idRestaurante = idRestaurante;
        this.nombre = nombre;
        this.horario = horario;
        this.precioMedio = precioMedio;
    }

    public String getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(String idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getPrecioMedio() {
        return precioMedio;
    }

    public void setPrecioMedio(float precioMedio) {
        this.precioMedio = precioMedio;
    }
    
}
