/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;


/**
 *
 * @author PROPIETARIO
 */
public class objeto{
    
    private double radio;
    
    public objeto(){
        radio=5;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public objeto(double radio){
        this.radio = radio;
    }
    public double Area(double radio){
        return Math.PI*Math.pow(radio, 2);
    }
    public double Perimetro(double radio){
        return 2*radio*Math.PI;
    }
}
