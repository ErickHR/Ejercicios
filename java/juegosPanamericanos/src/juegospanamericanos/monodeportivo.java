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
public class monodeportivo extends complejoDeportivo{
    
    private String deportivo;

    public monodeportivo(String deportivo, String codigo, String nombre, String direccion, String capacidad, String jefeComplejo) {
        super(codigo, nombre, direccion, capacidad, jefeComplejo);
        this.deportivo = deportivo;
    }

    public String getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(String deportivo) {
        this.deportivo = deportivo;
    }
    
    
    
}
