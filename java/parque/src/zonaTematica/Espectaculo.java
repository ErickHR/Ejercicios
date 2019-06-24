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
public class Espectaculo {
    private String idEspectaculo;
    private String nombre;
    private String tipo;
    private int minutos;
    private int aforoMaximo;

    public Espectaculo(String idEspectaculo, String nombre, String tipo, int minutos, int aforoMaximo) {
        this.idEspectaculo = idEspectaculo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.minutos = minutos;
        this.aforoMaximo = aforoMaximo;
    }

    public String getIdEspectaculo() {
        return idEspectaculo;
    }

    public void setIdEspectaculo(String idEspectaculo) {
        this.idEspectaculo = idEspectaculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getAforoMaximo() {
        return aforoMaximo;
    }

    public void setAforoMaximo(int aforoMaximo) {
        this.aforoMaximo = aforoMaximo;
    }
    
}
