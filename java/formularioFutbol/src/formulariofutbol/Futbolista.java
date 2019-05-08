
package formulariofutbol;

public class Futbolista extends Persona{
    public static int id = 0;
    private int dorsal;
    private String demarcación;

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcación() {
        return demarcación;
    }

    public void setDemarcación(String demarcación) {
        this.demarcación = demarcación;
    }
    
    
    
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
