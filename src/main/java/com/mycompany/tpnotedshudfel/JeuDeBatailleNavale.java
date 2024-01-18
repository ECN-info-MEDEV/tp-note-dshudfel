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
public class JeuDeBatailleNavale {
    ArrayList<Joueur> joueurs;
    int tour;
    boolean finPartie;
    int taille;

    public JeuDeBatailleNavale(int taille) {
        this.joueurs = new ArrayList<>();
        this.tour = 0;
        this.taille = taille;
        this.finPartie = false;
    }

    public void initialiserPartie() {
        // Créer deux joueurs avec des grilles de jeu
        Joueur joueur1 = new Joueur("Joueur 1", new Flotte(), false, taille);
        Joueur joueur2 = new Joueur("Joueur 2", new Flotte(), false, taille);

        // Ajouter les joueurs à la liste
        joueurs.add(joueur1);
        joueurs.add(joueur2);
        
        

        // Placer les bateaux sur les grilles des joueurs
        joueur1.placerBateaux();
        joueur2.placerBateaux();
        commencerJeu();
        
    }

    public void commencerJeu() {
    Scanner scanner = new Scanner(System.in);

    while (!finPartie) {
        Joueur joueurActuel = joueurs.get(tour % 2);
        Joueur joueurOppose = joueurs.get((tour + 1) % 2);

        System.out.println("C'est le tour du joueur : " + (tour % 2 + 1));
        joueurOppose.afficherJeu();

        // Demander au joueur actuel de tirer
        System.out.println("Entrez les coordonnées de tir (format : x y) : ");
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean bateauTouche = joueurActuel.effectuerTir(joueurOppose, new Point(x,y));



        // Vérifier si un bateau a été touché
        if (bateauTouche) {
            System.out.println("Un bateau a été touché !");
        } else {
            System.out.println("Aucun bateau touché.");
        }
        joueurOppose.afficherJeu();

        // Vérifier si la partie est terminée
        finPartie = verifierFinPartie();
    }

    scanner.close();
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
