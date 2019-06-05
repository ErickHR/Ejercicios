/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class ventana extends JFrame{
    
    JRadioButton radioNegrita;
    JRadioButton radiokursiva;
    JRadioButton radiokursivanegrita;
    JRadioButton radioSimple;
    ButtonGroup grupoRadios;
    
    JTextField campo;
    
    Font simple;
    Font kuriva;
    Font negrita;
    Font negritaKursiva;
    
    public ventana(){
        
        setLayout( new FlowLayout() );
        
        campo =  new JTextField("erick", 15);
        campo.setFont( new Font("Serif", Font.PLAIN, 40));
        add(campo);
        
        radioNegrita = new JRadioButton("Negrita", false);
        radiokursiva = new JRadioButton("Kursiva", false);
        radiokursivanegrita = new JRadioButton("Kuriva/Negrita", false);
        radioSimple = new JRadioButton("simple", true);
        
        add(radioSimple);
        add(radioNegrita);
        add(radiokursiva);
        add(radiokursivanegrita);
        
        grupoRadios = new ButtonGroup();
        grupoRadios.add(radioSimple);
        grupoRadios.add(radioNegrita);
        grupoRadios.add(radiokursiva);
        grupoRadios.add(radiokursivanegrita);
        
        simple = new Font("Serif", Font.PLAIN, 40);
        negrita = new Font("Serif", Font.BOLD, 40);
        kuriva = new Font("Serif", Font.ITALIC, 40);
        negritaKursiva = new Font("Serif", Font.ITALIC+Font.BOLD, 40);
        
        campo.setFont(simple);
        
        radioNegrita.addItemListener(new manejadorRadio(negrita));
        radioSimple.addItemListener(new manejadorRadio(simple));
        radiokursiva.addItemListener(new manejadorRadio(kuriva));
        radiokursivanegrita.addItemListener(new manejadorRadio(negritaKursiva));
        
    }
    
    private class manejadorRadio implements ItemListener{
        
        private Font tipoletra;
        
        public manejadorRadio(Font evn){
            tipoletra = evn;
        }
        
        public void itemStateChanged(ItemEvent evento){
            campo.setFont(tipoletra);
        }
        
    }
    
}
