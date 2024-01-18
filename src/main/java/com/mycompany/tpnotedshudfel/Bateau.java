/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

import java.awt.Point;
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
 * @param etat
 * @param taille 
 */
    // Constructeur
    public Bateau(TypeBateau type, ArrayList<Point> coordonnees, Etat etat, int taille) {
        this.type = type;
        this.coordonnees = coordonnees;
        this.etat = etat;
    }

    // Méthode pour obtenir le type du bateau
    public TypeBateau getType() {
        return type;
    }

    // Méthode pour obtenir les coordonnées du bateau
    public ArrayList<Point> getCoordonnees() {
        return coordonnees;
    }

    // Méthode pour obtenir l'état du bateau
    public Etat getEtat() {
        return etat;
    }

    // Méthode pour définir l'état du bateau
    public void setEtat(Etat etat) {
        this.etat = etat;
    }
    
     public void recevoirTir(Point coord) {
        etat = Etat.TOUCHE;
        
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
     
     
}
