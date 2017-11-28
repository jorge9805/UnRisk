/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unrisk;

import Datos.Edificios;
import Datos.Facultad;
import Interfaz.ControlInterfaz;
import Interfaz.DatosInterfaz;
import Interfaz.Pantalla;
import Interfaz.Pantallainicio;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author admin
 */
public class UnRisk extends JFrame {

    public static void main(String args[]) {
          ArrayList<Edificios> Artes = null;
            
            ArrayList<Edificios> contiguosArquitectura = null;
            Edificios Arquitectura = new Edificios("Arquitectura",contiguosArquitectura );
            
            ArrayList<Edificios> contiguosBellasArtes  = null;
            Edificios BellasArtes = new Edificios("BellasArtes",contiguosBellasArtes);
            
            ArrayList<Edificios> contiguosConservatorio  = null;
            Edificios Conservatorio = new Edificios("Conservatorio",contiguosConservatorio);
            
            ArrayList<Edificios> contiguosMuseo  = null;
            Edificios Museo = new Edificios("Museo de Arte",contiguosMuseo);
            
            ArrayList<Edificios> contiguosAulas  = null;
            Edificios Aulas = new Edificios("Aulas de Construiccion",contiguosAulas);

           
               Artes.add(Arquitectura);
               Artes.add(BellasArtes);
               Artes.add(Conservatorio);
               Artes.add(Museo);
               Artes.add(Aulas);
            

            Facultad artes = new Facultad("Artes", 5, Artes);
        }
    }
        
          
    
    