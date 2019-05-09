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
public class polideportivo extends complejoDeportivo{
    
    private String area;

    public polideportivo(String area, String codigo, String nombre, String direccion, String capacidad, String jefeComplejo) {
        super(codigo, nombre, direccion, capacidad, jefeComplejo);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public void registrarDeporte(){
        
    }
    
}
