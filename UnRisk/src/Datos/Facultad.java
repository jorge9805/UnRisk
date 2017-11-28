package Datos;

import java.util.ArrayList;

public class Facultad {
    private String name;
    private int bonusArmies;
    private ArrayList<Edificios> Edificios;

    public Facultad(String name, int bonusArmies, ArrayList<Edificios> memberEdificios) {
	this.name = name;
	this.bonusArmies = bonusArmies;
	this.Edificios = memberEdificios;
	System.out.println("Se ha creado la facultad de " + name + "\nBunus de ejercitos: " + bonusArmies);
    }

    public String getName() {
	return name;
    }

    /**
     *  Returns the number of bonus armies a player gets per round when the player controls this
     * faculty
     **/
    public int getBonusArmies() {
	return bonusArmies;
    }

    /**
     * Retuens a list of the country objects that are on this continent
     **/
    public ArrayList<Edificios> getEdificios() {
	return Edificios;
    }
}
