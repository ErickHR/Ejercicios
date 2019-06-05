
package marcocheckbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class cajas extends JFrame{
    
    private JTextField campoTexto;
    private JCheckBox negritaCheckBox;
    private JCheckBox kursivaCheckBox;
    
    public cajas(){
        
        
        setLayout( new FlowLayout() );
        
        campoTexto = new JTextField("Isaac Erick Huarancca Rivas", 20);
        campoTexto.setToolTipText("campo texto");
        campoTexto.setForeground(Color.red);
        campoTexto.setFont( new Font("Serif", Font.PLAIN, 14));
        campoTexto.setBorder(javax.swing.BorderFactory.createTitledBorder("campo de texto"));
        add(campoTexto);
        
        negritaCheckBox = new JCheckBox("negrita");
        kursivaCheckBox = new JCheckBox("kursiva");
        
        add(negritaCheckBox);
        add(kursivaCheckBox);
        
        //ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        //campoTexto.addActionListener(manejador);
        
        ManejadorCheckBox manejacheck = new ManejadorCheckBox();
        negritaCheckBox.addItemListener(manejacheck);
        kursivaCheckBox.addItemListener(manejacheck);
        
        
        
    }
    
    private class ManejadorCheckBox implements ItemListener{
        
        private int valNegrita = Font.PLAIN;
        private int valCursica = Font.PLAIN;
        
        public void itemStateChanged (ItemEvent evt){
                            

            //if (evt.getSource() == negritaCheckBox){
                valNegrita=negritaCheckBox.isSelected()? Font.BOLD: Font.PLAIN;
            //}
            //if (evt.getSource() == kursivaCheckBox){
                valCursica = kursivaCheckBox.isSelected()? Font.ITALIC:Font.PLAIN;
            //}
            
            campoTexto.setFont(new Font("Serif", valNegrita+valCursica, 14));
             
        }
        
    }
    
}
