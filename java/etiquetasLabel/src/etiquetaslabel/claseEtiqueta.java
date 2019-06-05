/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etiquetaslabel;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
/**
 *
 * @author PROPIETARIO
 */
public class claseEtiqueta extends JFrame{
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    
    public claseEtiqueta(){
        
        super( "Ejercicio con etiquetas" );
        setLayout( new FlowLayout() );
        
        etiqueta1 = new JLabel( "etiqueta 1" );
        etiqueta1.setToolTipText("esta es etiqueta1");
        add( etiqueta1 );
        
        Icon foto = new ImageIcon( getClass().getResource("foto - copia1.png"));
        etiqueta2 = new JLabel("etiqueta 2", foto,SwingConstants.LEFT);
        etiqueta2.setToolTipText("esta es etiqueta2");
        add( etiqueta2 );
        
        etiqueta3 = new JLabel();
        etiqueta3.setText("etiqueta 3");
        etiqueta3.setIcon(foto);
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("esta es etiqueta3");
        add( etiqueta3 );
        
    }
    
}
