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
public abstract class Sede {
    protected String nombre;
    protected int telefono;
    protected double areaconstruida;
    protected ArrayList<Estudiante> estudiantes;

    public Sede(String nombre, int telefono, double areaconstruida) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.areaconstruida = areaconstruida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getAreaconstruida() {
        return areaconstruida;
    }

    public void setAreaconstruida(double areaconstruida) {
        this.areaconstruida = areaconstruida;
    }
    @Override
    public String toString() {
        return "Sede  nombre: "+ nombre+"telefono"+ telefono+"areaconstruida: "+areaconstruida+"";
    }
    public abstract String darinformacion();
}
