/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

import java.util.ArrayList;

enum TypeBateau {
    PorteAvions,
    Cuirasse,
    Destroyer
}

enum Etat {
    DETENT,
    TOUCHE,
    COULE
}
/**
 * Classe pour la création des bateaux
 * @author Diego Felipe Lopez
 */
public class Bateau {
    private TypeBateau type;
    private ArrayList<Point> coordonnees;
    private Etat etat;
    private int taille;
/**
 * Constructeur d'un bateau 
 * @param type Choisir un des types existants des bateaux d'une liste
 * @param coordonnees le Arraylist des points qui constitut le bateaus
 * @param etat le etat du bateau de la list (DETENT,TOUCHE,COULE)
 * @param taille la taille du bateau, le nombre de cas qu'ils occupe
 */
    // Constructeur
    public Bateau(TypeBateau type, ArrayList<Point> coordonnees, Etat etat, int taille) {
        this.type = type;
        this.coordonnees = coordonnees;
        this.etat = etat;
        this.taille = taille;
    }
    /**
     * Methode qui return le type du bateau
     * @return 
     */
    // Méthode pour obtenir le type du bateau
    public TypeBateau getType() {
        return type;
    }
/**
 * Return les cordonees relatif au bateau dans un array
 * @return 
 */
    // Méthode pour obtenir les coordonnées du bateau
    public ArrayList<Point> getCoordonnees() {
        return coordonnees;
    }
    /**
     * Methode pour obtenir l'etat du bateau
     * @return 
     */
    // Méthode pour obtenir l'état du bateau
    public Etat getEtat() {
        return etat;
    }
    /**
     * Méthode pour définir l'état du bateau d'apres les valeurs listé
     * @param etat  etat liste entre (DETENT,TOUCHE,COULE)
     */
    // Méthode pour définir l'état du bateau
    public void setEtat(Etat etat) {
        this.etat = etat;
    }
        /**
         * Methode pour chancher pour touché la case
         * @param coord coordoné d'ou c'etait l'attaque
         */
     public void recevoirTir(Point coord) {
        etat = Etat.TOUCHE;
        
    }
/**
 * Methode qui donne la taille du bateau
 * @return 
 */
    public int getTaille() {
        return taille;
    }
    /**
     * Methode POUR SETTER la taille du bateau
     * @param taille integer de la taile du bateau
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }
     
     
}
