/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

import java.util.ArrayList;
import java.util.Scanner;

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
        this(nom, flotte, etat);
    }

    public Joueur(String nom, Flotte flotte, boolean etat) {
        this.nom = nom;
        this.flotte = new Flotte();
        this.etat = etat;
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
        switch (caseCible.getEtatCase()) {
            case OCCUPEE:
                ArrayList<Bateau> bateaux = joueur.getFlotte().getBateaux();
                // Parcourir toutes les bateaux
                for (int a = 0; a < bateaux.size(); a++) {
                        // Vérifier si les coordonnées (x, y) correspondent à la position actuelle du tableau
                        for (int i = 0; i < bateaux.get(a).getTaille(); i++) {
                            if (bateaux.get(a).getCoordonnees().get(i).getX() == coord.getX() && bateaux.get(a).getCoordonnees().get(i).getY() == coord.getY()) {
                                caseCible.setEtatCase(Case.EtatCase.COULEE);
                                bateaux.get(a).recevoirTir(coord);
                                return true; // Les coordonnées existent dans le tablea
                            }
                        }     
                }
                case COULEE:
                    System.out.println("Vous avez déjà tiré ici.");
                default: return false; // Tir déjà effectué sur cette case
        }
    }
    
    public void placerBateaux() {
        Scanner scanner = new Scanner(System.in);

        for (Bateau bateau : flotte.getBateaux()) {
            boolean placementReussi = false;

            // Tentatives de placement jusqu'à réussite
            while (!placementReussi) {
                System.out.println("Placement du bateau " + bateau.getType() + "\nEntrez les coordonnées (x y) : ");

                // Lire les coordonnées de l'utilisateur
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                System.out.println("Entrez l'orientation H/V : ");
                
                String orientation = scanner.next();

                // Créer un Point avec les coordonnées saisies
                Point coord = new Point(x, y);

                // Tenter de placer le bateau à ces coordonnées
                placementReussi = grille.placerBateau(bateau, coord, orientation);

                if (!placementReussi) {
                    System.out.println("Placement invalide. Réessayez.");
                }
            }
        }

        // Fermer le scanner après utilisation
        scanner.close();
    }

    public boolean recevoirTir(Point coord) {
        // Logique pour mettre à jour l'état du joueur en fonction du tir reçu
        return false;
    }

    public boolean verifierFlotteCoulee() {
        return true;
    }
}
