
package ejercicio;

public class Futbolista extends Persona{
    public static int id = 0;
    private int dorsal;
    private String demarcación;

    public Futbolista(int dorsal, String demarcación, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcación = demarcación;
    }
    
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

    
    public void jugarPartido(){
        
        
        
    }
    
    public void entrenar(){
        
        
        
    }
    
}
