
package jlist;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class usandoJlist extends JFrame{
    
    private JList listaColores;
    
    private final String nombreColores[] = {"Negro", "Azul", "Cyan","Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta","Naranja", "Rosa", "Rojo", "Blanco", "Amarillo" };
    
    private final Color colores[] = { Color.BLACK, Color.BLUE, Color.CYAN,Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE,Color.YELLOW };

    public usandoJlist(){
        
        setLayout( new FlowLayout() );
        
        listaColores = new JList(nombreColores);
        listaColores.setVisibleRowCount(5);
        
        listaColores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add( new JScrollPane(listaColores) );
        
        listaColores.addListSelectionListener( new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evento) {
            
                getContentPane().setBackground(colores[listaColores.getSelectedIndex()]);
                
            }
        });
        
    }
    
}
