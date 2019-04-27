
package formulariofutbol;

public class Entrenador extends Persona{
    
    private String idFedereación;

    public Entrenador(String idFedereación, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.idFedereación = idFedereación;
    }

    public String getIdFedereación() {
        return idFedereación;
    }

    public void setIdFedereación(String idFedereación) {
        this.idFedereación = idFedereación;
    }

    @Override
    public void concentrarse() {
        super.concentrarse(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viajar() {
        super.viajar(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void dirigirPartido(){
        
        
        
    }
    
    public void dirigirEntrenamiento(){
        
        
        
    }
    
}
