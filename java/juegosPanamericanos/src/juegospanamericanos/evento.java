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
public class evento {
    
    private String codigo;
    private String fecha;
    private String hora;
    private String numeroParticipantes;
    private String nombre;
    private String numeroArbitros;

    public evento(String codigo, String fecha, String hora, String numeroParticipantes, String nombre, String numeroArbitros) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.hora = hora;
        this.numeroParticipantes = numeroParticipantes;
        this.nombre = nombre;
        this.numeroArbitros = numeroArbitros;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(String numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroArbitros() {
        return numeroArbitros;
    }

    public void setNumeroArbitros(String numeroArbitros) {
        this.numeroArbitros = numeroArbitros;
    }
    
    public void asignarArbitro(){
        
    }
    public void asignarEquipamiento(){
        
    }
    
}
