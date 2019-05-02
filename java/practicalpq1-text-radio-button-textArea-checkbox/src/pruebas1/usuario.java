/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas1;

/**
 *
 * @author PROPIETARIO
 */
public class usuario {
    
    private String nombre;
    private int edad;
    
    private double promedio1;
    private double promedio2;
    private double promedio3;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio1() {
        return promedio1;
    }

    public void setPromedio1(double promedio1) {
        this.promedio1 = promedio1;
    }

    public double getPromedio2() {
        return promedio2;
    }

    public void setPromedio2(double promedio2) {
        this.promedio2 = promedio2;
    }

    public double getPromedio3() {
        return promedio3;
    }

    public void setPromedio3(double promedio3) {
        this.promedio3 = promedio3;
    }
    
    public usuario( String nombre, int edad, double promedio1, double promedio2, double promedio3){
        
        this.nombre = nombre;
        this.edad = edad;
        
        this.promedio1 = promedio1;
        this.promedio2 = promedio2;
        this.promedio3 = promedio3;
        
    }
    
    public double Promedio(){
        
        if(promedio3 >= 10 ){
            promedio3 = promedio3 + 2;
        }
        if(promedio3 >20 ){
            promedio3 = 20;
        }
        
        return (promedio1+promedio2+promedio3)/3;
    }
    
}
