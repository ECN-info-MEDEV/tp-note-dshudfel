/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

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
                Flotte bateaux = joueur.getFlotte().getFlotte();
                // Parcourir toutes les bateaux
                for (int a = 0; i < bateaux.length; i++) {
                        // Vérifier si les coordonnées (x, y) correspondent à la position actuelle du tableau
                        for (int i = 0; i < bateaux[a].getCoordonnees().length; i++) {
                            if (bateaux[a].getCoordonnees().[i].getX == coord.getX && bateaux[a].getCoordonnees().[i].getY == coord.getY) {
                                caseCible.setEtatCase(Case.EtatCase.COULEE);
                                joueur.recevoirTir(coord);
                                return true; // Les coordonnées existent dans le tablea
                            }
                        }     
                }
                case COULEE:
                    System.out.println("Vous avez déjà tiré ici.");
                default: return false; // Tir déjà effectué sur cette case
        }
        return false; // Par défaut, considérons que le tir a manqué
    }
    
    public void placerBateaux() {
        Scanner scanner = new Scanner(System.in);

        for (Bateau bateau : flotte.getFlotte()) {
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
