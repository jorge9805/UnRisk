/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Datos.Edificios;
import Datos.Facultad;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Mapa {

    private ArrayList<Edificios> EdificiosArtes;

    public Mapa() {
        this.EdificiosArtes = new ArrayList<>();
    }

    Edificios Arquitectura = new Edificios("Arquitectura");
    Edificios BellasArtes = new Edificios("BellasArtes");
    Edificios Conservatorio = new Edificios("Conservatorio");
    Edificios Museo = new Edificios("Museo de Arte");
    Edificios Aulas = new Edificios("Aulas de Construiccion");

    public void addEdificios() {
        EdificiosArtes.add(Arquitectura);
        EdificiosArtes.add(BellasArtes);
        EdificiosArtes.add(Conservatorio);
        EdificiosArtes.add(Museo);
        EdificiosArtes.add(Aulas);
    }

    Facultad artes = new Facultad("Artes", 5, EdificiosArtes);

}
