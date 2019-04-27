
package formulariofutbol;

public class Futbolista extends Persona{
    
    private int dorsal;
    private String demarcación;

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcación) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }

    @Override
    public void concentrarse() {
        super.concentrarse(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viajar() {
        super.viajar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void jugarPartido(){
        
        
        
    }
    
    public void entrenar(){
        
        
        
    }
    
}
