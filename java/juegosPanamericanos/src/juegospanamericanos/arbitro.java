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
public class arbitro {
    
    private String doc_identidad;
    private String nombre;
    private String nacionalidad;
    private String especialidad;
    private String experiencia;
    private String tipo;

    public arbitro(String doc_identidad, String nombre, String nacionalidad, String especialidad, String experiencia, String tipo) {
        this.doc_identidad = doc_identidad;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
        this.tipo = tipo;
    }

    public String getDoc_identidad() {
        return doc_identidad;
    }

    public void setDoc_identidad(String doc_identidad) {
        this.doc_identidad = doc_identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
