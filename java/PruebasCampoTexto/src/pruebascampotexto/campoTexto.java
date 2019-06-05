
package pruebascampotexto;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author PROPIETARIO
 */
public class campoTexto extends JFrame{
 
    private JTextField campotexto1;
    private JTextField campotexto2;
    private JPasswordField campoClave;

    public campoTexto(){
        
        setLayout( new FlowLayout() );
        
        campotexto1 = new JTextField("campo de texto",15);
        campotexto1.setToolTipText("campo texto 1");
        campotexto1.setEnabled(false);
        add(this.campotexto1);
        
        campotexto2 = new JTextField("texto sin columnas");
        campotexto2.setToolTipText("campo texto 2");
        add(this.campotexto2);
        
        campoClave = new JPasswordField("texto oculto",15);
        campoClave.setToolTipText("campo de clave");
        add( campoClave );
        
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campotexto1.addActionListener(manejador);
        campotexto2.addActionListener(manejador);
        campoClave.addActionListener(manejador);
        
    }
    
    private class ManejadorCampoTexto implements ActionListener{
        
        public void actionPerformed( ActionEvent evento){
            
            /*String cadena = "";
            if ( evento.getSource() == campotexto1 ) {
                
                cadena = String.format( "campotexto1: %s", evento.getActionCommand());
                
            } else if ( evento.getSource() == campotexto2 ) {
                
                cadena = String.format("campotexto2: %s", evento.getActionCommand());
                JOptionPane.showMessageDialog(null, evento.getActionCommand());
             
            } else if ( evento.getSource() == campoClave ){
                cadena = String.format( "campoClave: %s", evento.getActionCommand());
            }*/
            JOptionPane.showMessageDialog(null, String.format("usted pulso enter en : %s", evento.getActionCommand()) );
            
        }
        
    }
    
}
