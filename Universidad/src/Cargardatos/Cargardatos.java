/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cargardatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import universidad.datos.*;

/**
 *
 * @author admin
 */
public class Cargardatos {
    private Universidad universidad; 

    public Cargardatos() {
      this.universidad = new Universidad();
    }
    
    
     public String listarSedes(){
      String listaSedes = "";
        for (Sede sede : this.universidad.getSedes()) {
            listaSedes+=sede.darinformacion();
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
               String tipo = null, nombre= null, cursomaspopular=null;
               int telefono=0,  areaconstruida= 0, numprogramasaltacalidad = 0, numestudiantes=0;
               while(flujoEntrada.hasNext()){
                   tipo = flujoEntrada.next().trim();
                   if(tipo.equals("tecnologico")){
                       nombre=flujoEntrada.next().trim();
                       telefono=flujoEntrada.nextInt();
                       areaconstruida=flujoEntrada.nextInt();
                       numestudiantes=flujoEntrada.nextInt();
                       universidad.addSede(nombre, telefono, areaconstruida, cursomaspopular, numestudiantes, numprogramasaltacalidad, tipo);
                       
                       
                   }else if(tipo.equals("profesional")){
                       nombre=flujoEntrada.next().trim();
                       cursomaspopular=flujoEntrada.next().trim();
                       telefono=flujoEntrada.nextInt();
                       areaconstruida=flujoEntrada.nextInt();
                       numestudiantes=flujoEntrada.nextInt();
                       numprogramasaltacalidad=flujoEntrada.nextInt();
                       universidad.addSede(nombre, telefono, areaconstruida, cursomaspopular, numestudiantes, numprogramasaltacalidad, tipo);
                   }else if(tipo.equals("educacion continuada")){
                       nombre=flujoEntrada.next().trim();
                       cursomaspopular=flujoEntrada.next().trim();
                       telefono=flujoEntrada.nextInt();
                       areaconstruida=flujoEntrada.nextInt();
                       universidad.addSede(nombre, telefono, areaconstruida, cursomaspopular, numestudiantes, numprogramasaltacalidad, tipo);
                   }
                   
                  
               }
               
               
           } catch (FileNotFoundException ex) {
               Logger.getLogger(Universidad.class.getName()).log(Level.SEVERE, null, ex);
           }
          
        
       }
    
    }
}
