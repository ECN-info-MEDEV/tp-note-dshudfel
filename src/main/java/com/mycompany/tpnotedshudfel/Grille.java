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
    private int taille;
    

    // Constructeur
    public Grille(int taille) {
        this.grille = new Case[taille][taille];
        this.taille = taille;
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
    public Case getCase(int pos) {
        return grille[pos][pos];
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
            caseVisee.setEtatCase(Case.EtatCase.TOUCHEE);
            return false; // Tir dans l'eau
        }
    }

    
    // Autres méthodes et fonctionnalités de la classe Grille...

    public boolean placerBateau(Bateau bateau, Point coord, String orientation) {
        // Vérifier si les coordonnées sont valides
        int x = (int) coord.getX();
        int y = (int) coord.getY();

        if (x < 0 || x >= grille.length || y < 0 || y >= grille[x].length) {
            System.out.println("Coordonnées de placement invalides.");
            return false;
        }
        
           
        if(orientation.equals("H")){
            // Vérifier si les emplacements sont déjà occupés par d'autres bateaux
            for (int i = 0; i < bateau.getTaille(); i++) {
                if (grille[x + i][y].getEtatCase() != Case.EtatCase.VIDE) {
                    System.out.println("Emplacement déjà occupé par un autre bateau.");
                    return false;
                }
            }
        }else{
            for (int i = 0; i < bateau.getTaille(); i++) {
                if (grille[x][y + i].getEtatCase() != Case.EtatCase.VIDE) {
                    System.out.println("Emplacement déjà occupé par un autre bateau.");
                    return false;
                }
            }
        }

        // Vérifier si le bateau peut s'adapter à cet emplacement en fonction de son type
        switch (bateau.getType()) {
            case PorteAvions:
                if (x + 5 > grille.length || y + 5 > grille.length) {
                    System.out.println("Le porte-avions ne peut pas s'adapter à cet emplacement.");
                    return false;
                }
                break;
            case Cuirasse:
                if (x + 4 > grille.length || y + 5 > grille.length) {
                    System.out.println("Le cuirassé ne peut pas s'adapter à cet emplacement.");
                    return false;
                }
                break;
            case Destroyer:
                if (x + 3 > grille.length || y + 5 > grille.length) {
                    System.out.println("Le destroyer ne peut pas s'adapter à cet emplacement.");
                    return false;
                }
                break;
            default:
                System.out.println("Type de bateau non reconnu.");
                return false;
        }

        if(orientation.equals("H")){
            System.out.println(bateau.getTaille());
            for (int i = 0; i < bateau.getTaille(); i++) {
                this.grille[x][y + i].setEtatCase(Case.EtatCase.OCCUPEE);
            }
        }else{
            for (int i = 0; i < bateau.getTaille(); i++) {
                this.grille[x + i][y].setEtatCase(Case.EtatCase.OCCUPEE);
            }
        }

        return true; // Placement réussi
    }

    public Case[][] getCases() {
        return grille;
    }
    
    public Case getCase(int i, int j) {
        return grille[i][j];
    }

    public void setGrille(Case[][] grille) {
        this.grille = grille;
    }

    public Case[][] getGrille() {
        return grille;
    }

    public int getTaille() {
        return taille;
    }
    
    
}
