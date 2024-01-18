/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

/**
 *
 * @author felipelavila
 */
public class Case {
    // Enum pour l'état de la case
    enum EtatCase {
        VIDE,
        OCCUPEE,
        TOUCHEE,
        COULEE
    }

    private EtatCase etatCase;
    

    // Constructeur par défaut, initialise la case comme vide
    public Case() {
        this.etatCase = EtatCase.VIDE;
    }

    // Méthode pour obtenir l'état de la case
    public EtatCase getEtatCase() {
        return etatCase;
    }

    // Méthode pour définir l'état de la case
    public void setEtatCase(EtatCase etatCase) {
        this.etatCase = etatCase;
    }
}

