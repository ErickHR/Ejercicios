
package pruebamarcoboton;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BorderFactory;

/**
 *
 * @author PROPIETARIO
 */
public class MarcoBoton extends JFrame{
    
    private JButton boton1;
    private JButton boton2;
    
    private JTextField texto;
    
    public MarcoBoton(){
        
        setLayout( new FlowLayout() );
        
        texto = new JTextField("texto", 30);
        texto.setBorder(javax.swing.BorderFactory.createTitledBorder("ingrese texto"));
        
        add(texto);
        
        boton1 = new JButton( "boton simple" );
        boton1.setToolTipText("Boton 1");
        add(this.boton1);
        
        Icon foto = new ImageIcon(getClass().getResource("foto - copia1.png" ) );
        Icon foto1 = new ImageIcon( getClass().getResource("foto - copia.png") );
        boton2 = new JButton("Enviar", foto1);
        boton2.setFont( new Font( "Serif", Font.PLAIN, 30 ) );
        boton2.setRolloverIcon(foto);
        boton2.setToolTipText("boton 2");
        add( boton2 );
        
        ManejadorBoton manejador = new ManejadorBoton();
        
        boton2.addActionListener(manejador);
        boton1.addActionListener(manejador);
        
    }
    
    private class ManejadorBoton implements ActionListener{
            
        public void actionPerformed( ActionEvent evento){
            
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format("usted oprimio: %s", evento.getActionCommand()));
                
        }
            
    }
}
