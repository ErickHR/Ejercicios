/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author PROPIETARIO
 */
public class usandoComboBox extends JFrame{
   
    private JTextArea campofoto;
    
    private JComboBox listaImagenes;
    
    private JLabel etiqueta;
    
    private String nombres [ ] = { "infinity.jpg", "infinity1.jpg", "infinity2.jpg"};
    
    private Icon imagenes[] = {
        new ImageIcon( getClass().getResource( nombres[0] ) ),
        new ImageIcon( getClass().getResource( nombres[1] ) ),
        new ImageIcon( getClass().getResource( nombres[2] ) )
    };
    
    public usandoComboBox(){
        
        setLayout( new FlowLayout() );
        
        listaImagenes = new JComboBox( nombres );
        listaImagenes.setMaximumRowCount(3);
        
        listaImagenes.addItemListener(new ItemListener(){
            
            public void itemStateChanged( ItemEvent evento ){
                
                if ( evento.getStateChange() == ItemEvent.SELECTED )
                    etiqueta.setIcon(imagenes[ listaImagenes.getSelectedIndex()]);
                
            }
            
        });
        
        add(listaImagenes);
        etiqueta = new JLabel(imagenes[0]);
        add(etiqueta);
        
    }
    
}
