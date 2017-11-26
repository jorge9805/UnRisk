/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CARGARDATOS;

import universidad.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Estudiante
 */
public class Almacenamiento {
    private Universidad universidad; 

    public Almacenamiento(Universidad videoStreamming) {
        this.universidad = videoStreamming;
    }

     public String listarSedes(){
      String listaSedes= "";
        for (Sede sede : this.universidad.getSedes()) {
            listaSedes+= sede.retornarInformacion();
        }
        return listaSedes;
    }

    public void cargar(String ruta){
      
       File lectura = new File(ruta);
       Scanner flujoEntrada = null;
       if(lectura.exists()){
           try {
               flujoEntrada = new Scanner(lectura);
               flujoEntrada.useDelimiter(",");
               String tipo = null, nombre= null, telefono= null, direccion= null, areaconstruida = null;
               while(flujoEntrada.hasNext()){
                   tipo = flujoEntrada.next().trim();
                   if(tipo.equals("tecnologico")){
                       nombre=flujoEntrada.next().trim();
                       telefono=flujoEntrada.next().trim();
                       direccion = flujoEntrada.next().trim();
                       areaconstruida = flujoEntrada.nextInt();
                       
                       
                  
                       tecnologico tecnologico = new Sede(nombre, telefono, direccion, areaconstruida,);
                       Almacenamiento.addSede(Tecnologico);
                       
                     
                  
                    
                
                   }
                
               }
               
               
           } catch (FileNotFoundException ex) {
               
           }
          
        
       }
    
    }
}
