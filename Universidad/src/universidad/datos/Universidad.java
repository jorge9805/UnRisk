/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.datos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Universidad {
    private ArrayList<Sede> sedes;

    public ArrayList<Sede> getSedes() {
        return sedes;
    }

    public void setSedes(ArrayList<Sede> sedes) {
        this.sedes = sedes;
    }

    public Universidad() {
        this.sedes = new ArrayList<>();
    }
    public void addSede(String nombre, int telefono, double areaconstruida,
    String cursomaspopular, int numestudiantes, int numprogaltacalidad, String tipo ){
        if(tipo.equals("tecnologico")){
        Tecnologico tecnologico=new Tecnologico(nombre, telefono, areaconstruida, numestudiantes);
        this.sedes.add(tecnologico);
        }else if (tipo.equals("profesional")){
            Profesional profesional=new Profesional(nombre, telefono, areaconstruida, numprogaltacalidad, cursomaspopular, numestudiantes);
            
        }else if (tipo.equals("educacion continuada")){
            Educacioncontinuada educacioncontinuada=new Educacioncontinuada(nombre, telefono, areaconstruida, cursomaspopular);
        }
   }

}
