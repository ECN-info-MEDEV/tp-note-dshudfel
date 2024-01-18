/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

/**
 *
 * @author Diego Felipe Lopez
 */
public class Point {
    private int x;
    private int y;

    // Constructeur
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Méthodes pour obtenir les coordonnées x et y
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Méthodes pour définir les coordonnées x et y
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Méthode pour afficher les coordonnées du point
    public void afficher() {
        System.out.println("Coordonnées : (" + x + ", " + y + ")");
    }
}