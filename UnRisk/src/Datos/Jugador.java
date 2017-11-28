/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Datos.Edificios;
import Datos.Facultad;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author admin
 */
public class Jugador {
    /*private String name;
    private int soldadosporturno;
    private int soldadosfaltantes;

    public Jugador(String name, int soldadosporturno, int soldadosfaltantes) {
        this.name = name;
        this.soldadosporturno = soldadosporturno;
        this.soldadosfaltantes = soldadosfaltantes;
    }*/
    

    private int armies;
    private int turnInCount;
    private int index;
    private String name;
		
    private HashMap<String, Edificios> EdificiosTenidos;
    private HashMap<String, Facultad>  Facultadestenidas;
	
	//private Hand hand;

    public Jugador(String name, int armies, int index) {
	
		this.name = name;
		this.armies = armies;
		this.index = index;
		EdificiosTenidos = new HashMap<String, Edificios>();
		Facultadestenidas = new HashMap<String, Facultad>();
		turnInCount = 0;
    }
	
	public String getName() {
		return name;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getArmies() {
		return armies;
	}
	
	
    /**
     * Decreases the count of the number of numArmies the player has on the board
     * This count has to reflect the actual number of numArmies the players has on 
     * the board
     **/
    public void decrementArmies(int numArmies) {
	
		armies = armies - numArmies;
		System.out.println(name + " has " + armies + " reinforcements remaining.");
    }

    /**
     * Increases the count of the number of numArmies the player has on the board
     * This count has to reflect the actual number of numArmies the players has on 
     * the board
     **/
    public void incrementArmies(int numArmies) {
	
		armies = armies + numArmies;
		System.out.println(name + " has gained " + numArmies + " reinforcements. Total available: " + armies);
    }

    /**
     * When a player conquers a country the country needs to be added to a data structure
     * that keeps track of all the countries the player occupies
     **/
    public void addCountry(Edificios Edificio) {
	
		System.out.println(name + " now occupies " + Edificio.getName() + "!");
		EdificiosTenidos.put(Edificio.getName(), Edificio);
    }

    /**
     * Works like addCountry above, but can be used to add multiple countries at once
     **/
    /*public void addCountry(ArrayList<Country> countriesList) {
	
		for(int i = 0; i < countriesList.size(); i++) {
		
			countriesHeld.put(countriesList.get(i).getName(), countriesList.get(i));
		}
    }*/

    /**
     * When a player loses a country, the country must be removed from the data structure
     * tracking which countries the player occupies
     **/
    public void removeCountry(String edificioName) {
		
		System.out.println(name + " no longer occupies " + edificioName + "!");
		EdificiosTenidos.remove(edificioName);
    }

    /**
     * When a player occupies all the countries on a continent the continent must be added to
     * a data structure that tracks which continents the player occupies
     **/
    public void addContinent(Facultad facultad) {
	
		System.out.println(name + " now controls " + facultad.getName() + ", granting them " + facultad.getBonusArmies() + " per turn!");
		Facultadestenidas.put(facultad.getName(), facultad);
    }

    /**
     * Removes a contient from the data structure to reflect that the player no longer controls
     * the whole continent
     **/
    public void removeContinent(String continentName) {
	
		Facultadestenidas.remove(continentName);
    }

    /**
     * Adds a risk card to the players hand
     **/
    /*public void addRiskCard(Card riskCard) {
	
		hand.add(riskCard);
    }

    /**
     * Removed a set of risk cards from the players hand to reflect risk cards being turned in
     **/
    /*public void removeCards(int[] cardsTurnedInIndex) {
	
		hand.removeCardsFromHand(cardsTurnedInIndex[0], cardsTurnedInIndex[1], cardsTurnedInIndex[2]);
    }*/
	
	public ArrayList<Edificios> getOwnedCountries() {
	
		return new ArrayList<Edificios>(EdificiosTenidos.values());
	}
	
	public int getTurnInCount() {
	
		turnInCount++;
		return turnInCount;
	}
	
	/*public ArrayList<Card> getHand() {
	
		return hand.getCards();
	}
	
	public Hand getHandObject() {
		
		return hand;
	}
	
	public boolean mustTurnInCards() {
	
		return hand.mustTurnInCards();
	}*/
}
    
    

