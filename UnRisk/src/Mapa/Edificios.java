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
public class Edificios {
    private String name;
    //private Player occupant;
    private ArrayList<Edificios> adjacencies;

    public Edificios(String name, ArrayList<Edificios> adjacencies) {
        this.name = name;
        this.adjacencies = adjacencies;
    }
    
    
    
}
