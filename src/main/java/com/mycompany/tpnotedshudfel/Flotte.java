/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

import java.util.ArrayList;

/**
 *
 * @author Diego Felipe Lopez
 */
public class Flotte {
    private ArrayList<Bateau> flotte;

    // Constructeur
    public Flotte() {
        this.flotte = new ArrayList<>();
    }

    // Méthode d'ajout d'un bateau à la flotte
    public void ajout(Bateau bateau) {
        this.flotte.add(bateau);
    }

    // Méthode de retrait d'un bateau de la flotte
    public void retire(Bateau bateau) {
        this.flotte.remove(bateau);
    }

    // Méthode pour vérifier l'état de la flotte
    public boolean verifierEtat() {

        for (Bateau bateau : flotte) {
            
        }

        return true; // Tous les bateaux sont en bon état.
    }
}