/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public abstract class Facultad {

    private String nombre;
    private int bonusArmies; 
    protected ArrayList<Facultad> fronteras;
    private ArrayList<Edificios> Edificios;

    public Facultad(String nombre, ArrayList<Facultad> fronteras) {
        this.nombre = nombre;
        this.fronteras = fronteras;
    }

    public abstract void addFrontera(Facultad front1,Facultad front2,Facultad front3);

}
