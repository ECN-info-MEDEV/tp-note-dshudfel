/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

/**
 *
 * @author felipelavila
 */
public class Grille {
    private Case[][] grille;

    // Constructeur
    public Grille(int taille) {
        this.grille = new Case[taille][taille];
        initialiserGrille();
    }

    // Méthode pour initialiser la grille avec des cases vides
    private void initialiserGrille() {
        for (int i = 0; i < grille.length; i++) {
            for (int j = 0; j < grille[i].length; j++) {
                grille[i][j] = new Case(); // Utilisation du constructeur par défaut de Case
            }
        }
    }

    // Méthode pour obtenir une case spécifique dans la grille
    public Case getCase(int ligne, int colonne) {
        return grille[ligne][colonne];
    }

    // Méthode pour définir la taille de la grille (grille carrée)
    public void setTaille(int nouvelleTaille) {
        if (nouvelleTaille <= 0) {
            System.out.println("La taille de la grille doit être supérieure à zéro.");
            return;
        }

        Case[][] nouvelleGrille = new Case[nouvelleTaille][nouvelleTaille];

        for (int i = 0; i < nouvelleTaille; i++) {
            for (int j = 0; j < nouvelleTaille; j++) {
                if (i < grille.length && j < grille[i].length) {
                    nouvelleGrille[i][j] = grille[i][j];
                } else {
                    nouvelleGrille[i][j] = new Case();
                }
            }
        }

        grille = nouvelleGrille;
    }
    
    public boolean effectuerTir(Point coord) {
        int x = (int) coord.getX();
        int y = (int) coord.getY();

        if (x < 0 || x >= grille.length || y < 0 || y >= grille[x].length) {
            return false; // Coordonnées de tir invalides
        }

        Case caseVisee = grille[x][y];

        if (caseVisee.getEtatCase() == Case.EtatCase.OCCUPEE) {
            caseVisee.setEtatCase(Case.EtatCase.COULEE);
            return true; // Bateau touché
        } else {
            caseVisee.setEtatCase(Case.EtatCase.COULEE);
            return false; // Tir dans l'eau
        }
    }

    
    // Autres méthodes et fonctionnalités de la classe Grille...
}
