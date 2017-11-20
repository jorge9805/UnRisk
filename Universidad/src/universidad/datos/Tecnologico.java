/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.datos;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Tecnologico extends Sede {
    int numeroestudiantes;
    private ArrayList<Programaformacion>programasdeformacion;
   
    public ArrayList<Programaformacion> getProgramasdeformacion() {
        return programasdeformacion;
    }

    public void setProgramasdeformacion(ArrayList<Programaformacion> programasdeformacion) {
        this.programasdeformacion = programasdeformacion;
    }
    
    public Tecnologico(String nombre, int telefono, double areaconstruida, int numeroestudiantes) {
        super(nombre, telefono, areaconstruida);
        this.numeroestudiantes=numeroestudiantes;
        this.programasdeformacion = new ArrayList<>();
    }
    
    public int getNumeroestudiantes() {
        return numeroestudiantes;
    }

    public void setNumeroestudiantes(int numeroestudiantes) {
        this.numeroestudiantes = numeroestudiantes;
    }
    public void addProgramaformacion(Programaformacion prog) {
        this.programasdeformacion.add(prog);
    }
    public String darinformacion(){
       String informacion = "";
        for (Programaformacion prog : programasdeformacion) {
           informacion+=prog; 
        }
        return informacion+ this.numeroestudiantes+super.toString();
    }
    
    
}
