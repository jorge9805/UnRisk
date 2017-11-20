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
public class Profesional extends Sede {
    private int numprogramasaltacalidad;
     private ArrayList<Programaformacion>programasdeformacion;
     private Tecnologico educaciontecnologica;
     private String cursomaspopular;
     private int numestudiantes;
     private Educacioncontinuada educacioncontinuada;
    public Profesional(String nombre, int telefono, double areaconstruida, int numprogramasaltacalidad, 
             String cursomaspopular, int numestudiantes) {
        super(nombre, telefono, areaconstruida);
        this.numprogramasaltacalidad=numprogramasaltacalidad;
        this.programasdeformacion=new ArrayList<>();
        this.educaciontecnologica=new Tecnologico(nombre, telefono, areaconstruida, numestudiantes);
        this.educacioncontinuada=new Educacioncontinuada(nombre, telefono, areaconstruida, cursomaspopular);
    }
    
    public ArrayList<Programaformacion> getProgramasdeformacion() {
        return programasdeformacion;
    }

    public void setProgramasdeformacion(ArrayList<Programaformacion> programasdeformacion) {
        this.programasdeformacion = programasdeformacion;
    }

    public Tecnologico getEducaciontecnologica() {
        return educaciontecnologica;
    }

    public void setEducaciontecnologica(Tecnologico educaciontecnologica) {
        this.educaciontecnologica = educaciontecnologica;
    }

    public Educacioncontinuada getEducacioncontinuada() {
        return educacioncontinuada;
    }

    public void setEducacioncontinuada(Educacioncontinuada educacioncontinuada) {
        this.educacioncontinuada = educacioncontinuada;
    }

    public int getNumprogramasaltacalidad() {
        return numprogramasaltacalidad;
    }

    public void setNumprogramasaltacalidad(int numprogramasaltacalidad) {
        this.numprogramasaltacalidad = numprogramasaltacalidad;
    }
    public void addProgramaformacion(Programaformacion prog) {
        this.programasdeformacion.add(prog);
    }
    //Si fuera relacion de composicion
    public String darinformacion(){
       String informacion = "";
        for (Programaformacion prog : programasdeformacion) {
           informacion+=prog; 
        }  
        return informacion+ educaciontecnologica.numeroestudiantes+educacioncontinuada.getCursomaspopular()+ super.toString();
    }
    
}
