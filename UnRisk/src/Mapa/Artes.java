/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import java.util.ArrayList;

/**
 *
 * @author MASTER
 */
public class Artes extends Facultad {

    public Artes(String nombre, ArrayList<Facultad> fronteras) {
        super(nombre, fronteras);
    }

    @Override
    public void addFrontera(Facultad front1, Facultad front2, Facultad front3) {
       fronteras.add(front1);
       fronteras.add(front2);
       fronteras.add(front3);
    }

   
    
}
