/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author admin
 */
    public class ControlInterfaz implements ActionListener {
        private DatosInterfaz datos;
        Pantalla pantalla;
        NumeroJugadores pantallanumjug;
    public ControlInterfaz(DatosInterfaz datos) {
        this.datos = datos;
        pantalla.addActionListeners(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionEvent = e.getActionCommand();
        if (actionEvent.equals("jugar")){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                pantallanumjug.setVisible(true);
            }
        });
        }else if(actionEvent.equals("ayuda")){
            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instrucciones().setVisible(true);
                
            }
        });
        }
    }
   


    }
    class Ingresarjugadores implements ActionListener{
    public Ingresarjugadores(DatosInterfaz Datos, IngresarJugadores ingrjug) {
        this.Datos = Datos;
        this.ingrjug=ingrjug;
        
    }
        private DatosInterfaz Datos;
        private IngresarJugadores ingrjug;
        
	public void actionPerformed(ActionEvent e) {
		String actionEvent = e.getActionCommand();
		
		if (actionEvent.equals("3")) {
		        Datos.setContarjugadores(3);
                        ingrjug = new IngresarJugadores(Datos.getContarjugadores());
                        ingrjug.setVisible(true);
		}
		
		else if (actionEvent.equals("4")) {
		
			Datos.setContarjugadores(4);
                        ingrjug = new IngresarJugadores(Datos.getContarjugadores());
                        ingrjug.setVisible(true);
		} else{
                    ingrjug = new IngresarJugadores(2);
                        ingrjug.setVisible(true);
                }
		
		
	}
}

