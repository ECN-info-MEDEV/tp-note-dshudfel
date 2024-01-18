/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

/**
 *
 * @author hudsonteixeira
 */


public class Joueur {
    private String nom;
    private Flotte flotte;
    private boolean etat;
    private Grille grille;

    public Joueur(String nom, Flotte flotte, boolean etat, Grille grille) {
        this.nom = nom;
        this.flotte = new Flotte();
        this.etat = etat;
        this.grille = new Grille();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Flotte getFlotte() {
        return flotte;
    }

    public void setFlotte(Flotte flotte) {
        this.flotte = flotte;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public Grille getGrille() {
        return grille;
    }

    public void setGrille(Grille grille) {
        this.grille = grille;
    }
    
    public void setTailleGrille(int taille) {
        this.grille.setTaille(taille);
    }
    
    public Joueur(){}

    public boolean effectuerTir(Joueur joueur, Point coord){
            Case caseCible = joueur.getGrille().getCase(coord);

        
        return false; // Par défaut, considérons que le tir a manqué
    }
    
    public void placerBateaux() {
        // Logique pour permettre au joueur de placer ses bateaux sur le plateau
    }

    public boolean recevoirTir(Point coord) {
        // Logique pour mettre à jour l'état du joueur en fonction du tir reçu
        return false;
    }

    public boolean verifierFlotteCoulee() {
        return flotte.verifierFlotteCoulee();
    }
}
