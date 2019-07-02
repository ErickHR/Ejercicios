/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonaTematica.Pases;

/**
 *
 * @author PROPIETARIO
 */
public class Pases {
    /*private String fecha; 
    private String hora;*/
    private String aforo;

    public Pases(/*String fecha, String hora, */String aforo) {
        /*this.fecha = fecha;
        this.hora = hora;*/
        this.aforo = aforo;
    }

    /*public String getFecha() {
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
    */
    public String getAforo() {
        return aforo;
    }

    public void setAforo(String aforo) {
        this.aforo = aforo;
    }
    
}
