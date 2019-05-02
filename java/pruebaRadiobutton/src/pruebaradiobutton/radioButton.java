/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaradiobutton;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;

/**
 *
 * @author PROPIETARIO
 */
public class radioButton extends JFrame{
    
    private Font simple;
    private Font negrita;
    private Font kursiva;
    private Font negritaKursiva;
    
    private JTextField campoTexto;
    private JRadioButton radioSimple;
    private JRadioButton radioNegrita;
    private JRadioButton radioKursiva;
    private JRadioButton radioNegritaKursiva;
    private ButtonGroup grupoRadio;
    
    public radioButton(){
        
        setLayout( new FlowLayout() );
        
        campoTexto = new JTextField("Isaac Erick Huarancca Rivas",20);
        campoTexto.setBorder(javax.swing.BorderFactory.createTitledBorder("campo de texto"));
        add(campoTexto);
        
        radioSimple = new JRadioButton("simple", true);
        radioKursiva = new JRadioButton("kursiva",false);
        radioNegrita = new JRadioButton("negrita", false);
        radioNegritaKursiva = new JRadioButton("negrita/kursiva", false);
        
        add(radioSimple);
        add(radioKursiva);
        add(radioNegrita);
        add(radioNegritaKursiva);
        
        grupoRadio = new ButtonGroup();
        grupoRadio.add(radioSimple);
        grupoRadio.add(radioKursiva);
        grupoRadio.add(radioNegrita);
        grupoRadio.add(radioNegritaKursiva);
        
        simple = new Font("Serif", Font.PLAIN, 20);
        negrita = new Font("Serif", Font.BOLD, 20);
        kursiva = new Font("Serif", Font.ITALIC, 20);
        negritaKursiva = new Font("Serif", Font.BOLD + Font.ITALIC, 20);
        campoTexto.setFont(simple);
        
        /*radioSimple.addActionListener(new ManejadorRadio(simple));
        radioKursiva.addActionListener(new ManejadorRadio(kursiva));
        radioNegrita.addActionListener(new ManejadorRadio(negrita));
        radioNegritaKursiva.addActionListener(new ManejadorRadio(negritaKursiva));*/
        
        radioSimple.addItemListener(new ManejadorRadio(simple));
        radioKursiva.addItemListener(new ManejadorRadio(kursiva));
        radioNegrita.addItemListener(new ManejadorRadio(negrita));
        radioNegritaKursiva.addItemListener(new ManejadorRadio(negritaKursiva));
        
    }
    
    private class ManejadorRadio implements ItemListener{
        
        private Font tipoLetra;
        
        public ManejadorRadio(Font tipoLetra){
            this.tipoLetra = tipoLetra; 
        }
        
       /* private int valSimple = Font.PLAIN;
        private int valKursiva = Font.PLAIN;
        private int valNegrita = Font.PLAIN;
        private int valNegritaKursiva = Font.PLAIN;
        */
        public void itemStateChanged( ItemEvent evt ){
            
            /*valKursiva = radioKursiva.isSelected()? Font.ITALIC : Font.PLAIN;
            valNegrita = radioNegrita.isSelected()? Font.BOLD : Font.PLAIN;
            valNegritaKursiva = radioNegritaKursiva.isSelected()? Font.BOLD + Font.ITALIC : Font.PLAIN;
            */
            campoTexto.setFont( tipoLetra);
            //Font letra = new Font("Serif", Font.BOLD, 30);
            //campoTexto.setFont(letra);
            //campoTexto.setFont(new Font("Serif", Font.BOLD, 30));
            
        }
        
    }
   
    /*private class ManejadorRadio implements ActionListener{
        
        private Font tipoletra;
        
        public ManejadorRadio( Font tipoletra ){
            
            this.tipoletra = tipoletra;
            
        }
        
        public void actionPerformed(ActionEvent e ){
            
            campoTexto.setFont(tipoletra);
            
        }
        
    }*/
}

