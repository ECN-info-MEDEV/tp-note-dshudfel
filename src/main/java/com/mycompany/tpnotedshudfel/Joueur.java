/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

import static com.mycompany.tpnotedshudfel.Case.EtatCase.COULEE;
import static com.mycompany.tpnotedshudfel.Case.EtatCase.OCCUPEE;
import static com.mycompany.tpnotedshudfel.Case.EtatCase.TOUCHEE;
import static com.mycompany.tpnotedshudfel.Case.EtatCase.VIDE;
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


    public Joueur(String nom, Flotte flotte, boolean etat, int taille) {
        this.nom = nom;
        this.flotte = new Flotte();
        this.etat = etat;
        this.grille = new Grille(taille);
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
        Case caseCible = joueur.getGrille().getCases()[coord.getX()][coord.getY()];
        switch (caseCible.getEtatCase()) {
            case OCCUPEE:
                ArrayList<Bateau> bateaux = joueur.getFlotte().getBateaux();
                // Parcourir toutes les bateaux
                for (int a = 0; a < bateaux.size(); a++) {
                        // Vérifier si les coordonnées (x, y) correspondent à la position actuelle du tableau
                        for (int i = 0; i < bateaux.get(a).getTaille(); i++) {
                            if (bateaux.get(a).getCoordonnees().get(i).getX() == coord.getX() && bateaux.get(a).getCoordonnees().get(i).getY() == coord.getY()) {
                                caseCible.setEtatCase(Case.EtatCase.TOUCHEE);
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
        Bateau porteAvions = new Bateau(TypeBateau.PorteAvions, new ArrayList<>(), Etat.DETENT, 5);
        flotte.ajout(porteAvions);

        // Ajout d'un Cuirassé (Taille 4x1)
        Bateau cuirasse = new Bateau(TypeBateau.Cuirasse, new ArrayList<>(), Etat.DETENT, 4);
        flotte.ajout(cuirasse);

        // Ajout d'un Destroyer (Taille 3x1)
        Bateau destroyer = new Bateau(TypeBateau.Destroyer, new ArrayList<>(), Etat.DETENT, 3);
        flotte.ajout(destroyer);

        this.setFlotte(flotte);
        for (Bateau bateau : this.flotte.getBateaux()) {
            boolean placementReussi = false;

            // Tentatives de placement jusqu'à réussite
            while (!placementReussi) {
                afficherJeu();
                System.out.println("Placement du bateau " + bateau.getType() + "\nEntrez les coordonnées (x y) : ");

                // Lire les coordonnées de l'utilisateur
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                System.out.println("Entrez l'orientation H/V : ");
                
                String orientation = scanner.next();

                // Créer un Point avec les coordonnées saisies
                Point coord = new Point(x, y);

                // Tenter de placer le bateau à ces coordonnées
                placementReussi = this.grille.placerBateau(bateau, coord, orientation);
                System.out.println("hola"+this.grille.getGrille()[0][0].getEtatCase());
                if (!placementReussi) {
                    System.out.println("Placement invalide. Réessayez.");
                }
            }
        }
        afficherJeu();
        scanner.close();
    }

    public boolean recevoirTir(Point coord) {
        // Logique pour mettre à jour l'état du joueur en fonction du tir reçu
        return false;
    }

    public boolean verifierFlotteCoulee() {
        return true;
    }
    
    public void afficherJeu() {
        System.out.println("Grille du joueur " + this.nom + ":");
        System.out.println();


        for (int i = 0; i < this.grille.getTaille(); i++) {
            for (int j = 0; j < grille.getTaille(); j++) {
                Case.EtatCase etatCase = this.grille.getCase(i, j).getEtatCase();

                switch (etatCase) {
                    case VIDE:
                        System.out.print("~ "); // Eau non touchée
                        break;
                    case OCCUPEE:
                        System.out.print("O "); // Partie du bateau non touchée
                        break;
                    case TOUCHEE:
                        System.out.print("X "); // Partie du bateau touchée
                        break;
                    case COULEE:
                        System.out.print("C "); // Bateau coulé
                        break;
                }
            }
                System.out.println();
            }

            System.out.println();
    }
    
}
