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
public class Edificios {

    private int armies;
    private boolean hasPlayer;

    private String name;
    private Jugador occupant;
    private ArrayList<Edificios> adjacencies;

    public Edificios(String name) {

        this.name = name;
        hasPlayer = false;
        armies = 0;

        System.out.println("Created country: " + name);
    }

    /**
     * Used only when contstructing the country object, it should not be called
     * after the board is initialized
     *
     */
    public void addAdjacencies(ArrayList<Edificios> adjacencies) {

        this.adjacencies = adjacencies;
    }

    public String getName() {
        return name;
    }

    

    /**
     * When a player conquers a country the player object is set as the occupant
     * of the country
     *
     */
    public void setOccupant(Jugador occupant) {
        hasPlayer = true;
        this.occupant = occupant;
    }

    /**
     * Returns the player object who currently occupies the country
     *
     */
    public Jugador getOccupant() {
        return occupant;
    }

    /**
     * Used to set the number of armies currently stationed in this country
     *
     */
    public void setNumArmies(int numArmies) {
        armies = numArmies;
    }

    public void incrementArmies(int numArmies) {
        armies = armies + numArmies;
        System.out.println(occupant.getName() + " added " + numArmies + " armies to " + name + ".");
    }

    public void decrementArmies(int numArmies) {
        armies = armies - numArmies;
        System.out.println(occupant.getName() + " lost " + numArmies + " armies in " + name + ".");
    }

    /**
     * Returns the number of armies currently stationed in this country
     *
     */
    public int getArmies() {
        return armies;
    }

    /**
     * Returns a list of the country objects that are adjacent to this country
     * on the baord
     *
     */
    public ArrayList<Edificios> getAdjacencies() {
        return adjacencies;
    }

    public boolean hasPlayer() {
        return hasPlayer;
    }
}
