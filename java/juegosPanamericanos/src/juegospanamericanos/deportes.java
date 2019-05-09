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
public class deportes {
    
    private String codigo;
    private String nombre;
    private String numeroJugadores;
    private String detalles;

    public deportes(String codigo, String nombre, String numeroJugadores, String detalles) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numeroJugadores = numeroJugadores;
        this.detalles = detalles;
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

    public String getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(String numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    
    
}
