/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcoseleccionmultiple;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author PROPIETARIO
 */
public class MarcoSeleccionMultiple extends JFrame{

    /**
     * @param args the command line arguments
     */
    private JList listaJlistColores;
    private JList listaJlistCopia;
    
    private JButton botonJButtonCopiar;
    private final String nombresColores[]={ "Negro", "Azul", "Cyan",
    "Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta", "Naranja",
    "Rosa", "Rojo", "Blanco", "Amarillo"};
    
   public MarcoSeleccionMultiple(){
       
       setLayout( new FlowLayout() );
       
       listaJlistColores = new JList(nombresColores);
       
       listaJlistColores.setVisibleRowCount(5);
       
       listaJlistColores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
       
       add( new JScrollPane(listaJlistColores));
       
       botonJButtonCopiar =  new JButton("Copiar >>>");
       botonJButtonCopiar.addActionListener(
               new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               
               listaJlistCopia.setListData(listaJlistColores.getSelectedValues() );
               
           }
       }
       
       );
       
       add(botonJButtonCopiar);
       
       listaJlistCopia = new JList();
       
       listaJlistCopia.setVisibleRowCount(5);
       listaJlistCopia.setFixedCellWidth(100);
       listaJlistCopia.setFixedCellHeight(15);
       
       listaJlistCopia.setSelectionMode(
               ListSelectionModel.SINGLE_INTERVAL_SELECTION);
       add(new JScrollPane(listaJlistCopia));
   }
    
}
