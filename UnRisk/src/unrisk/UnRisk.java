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
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantallainicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /*DatosInterfaz datos = new DatosInterfaz(datos.getContarjugadores());
                ControlInterfaz control = new ControlInterfaz(datos);*/
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