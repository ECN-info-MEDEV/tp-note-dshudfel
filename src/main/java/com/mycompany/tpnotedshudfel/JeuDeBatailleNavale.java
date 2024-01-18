/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

import java.util.ArrayList;

/**
 *
 * @author hudsonteixeira
 */
public class JeuDeBatailleNavale {
    ArrayList<Joueur> joueurs;
    int tour;
    boolean finPartie;

    public JeuDeBatailleNavale(int taille) {
        this.joueurs = new ArrayList<>();
        this.tour = 1;
        this.finPartie = false;
    }

    public void initialiserPartie() {
        // Créer deux joueurs avec des grilles de jeu
        Joueur joueur1 = new Joueur("Joueur 1", new Flotte(), false);
        Joueur joueur2 = new Joueur("Joueur 2", new Flotte(), false);

        // Définir la taille des grilles
        joueur1.setTailleGrille(10);
        joueur2.setTailleGrille(10);

        // Ajouter les joueurs à la liste
        joueurs.add(joueur1);
        joueurs.add(joueur2);

        // Placer les bateaux sur les grilles des joueurs
        joueur1.placerBateaux();
        joueur2.placerBateaux();
    }

    public void commencerTour() {
        // Afficher l'état actuel du jeu (grilles, bateaux coulés, etc.)
        afficherEtatJeu();

        // Demander au joueur actuel de tirer
        Joueur joueurActuel = joueurs.get(tour % 2);
        Point coordTir = demanderCoordonneesTir(joueurActuel);

        // Effectuer le tir
        boolean bateauTouche = effectuerTir(joueurActuel, coordTir);

        // Mettre à jour l'état du joueur en fonction du tir
        joueurActuel.recevoirTir(coordTir);

        // Vérifier si un bateau a été touché
        if (bateauTouche) {
            System.out.println("Un bateau a été touché !");
        } else {
            System.out.println("Aucun bateau touché.");
        }

        // Vérifier si la partie est terminée
        finPartie = verifierFinPartie();

        // Passer au tour suivant
        tour++;
    }

    public boolean effectuerTir(Joueur joueur, Point coord) {
        // Logique pour effectuer un tir sur le plateau et renvoyer vrai si un bateau est touché
        return false;
    }

    public boolean verifierFinPartie() {
        // Logique pour vérifier si la partie est terminée en fonction de certaines conditions
        return finPartie;
    }
    
}
