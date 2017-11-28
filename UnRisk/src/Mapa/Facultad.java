/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mapa;

import java.util.ArrayList;
import unrisk.Jugador;

/**
 *
 * @author admin
 */
public class Facultad {

    private String name;
    private int bonusArmies;
    private ArrayList<Edificios> Edificios;

    public Facultad(String name, int bonusArmies, ArrayList<Edificios> memberEdificios) {
		this.name = name;
		this.bonusArmies = bonusArmies;
		Edificios = memberEdificios;
		
		System.out.println("Created continent: " + name + "\nBonus armies: " + bonusArmies);
    }

    public String getName() {
		return name;
    }

    /**
     *  Returns the number of bonus armies a player gets per round when the player controls this
     * continent
     **/
    public int getBonusArmies() {
		return bonusArmies;
    }

    /**
     * Retuens a list of the country objects that are on this continent
     **/
    public ArrayList<Edificios> getMemberEdificios() {
		return Edificios;
    }
}
