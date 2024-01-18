/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hudsonteixeira
 */
public class JoueurTest {
    
    public JoueurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNom method, of class Joueur.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Joueur instance = new Joueur();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Joueur.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "john";
        Joueur instance = new Joueur();
        instance.setNom(nom);
        assertEquals(nom,instance.getNom());
    }

    /**
     * Test of setFlotte method, of class Joueur.
     */
    @Test
    public void testSetFlotte() {
        System.out.println("setFlotte");
        Flotte flotte = new Flotte();
        Joueur instance = new Joueur();
        instance.setFlotte(flotte);
        assertEquals(flotte ,instance.getFlotte());
    }

    /**
     * Test of effectuerTir method, of class Joueur.
     */
    @Test
    public void testEffectuerTir() {
        System.out.println("effectuerTir");
        // Créer deux joueurs avec des grilles de jeu
        Joueur joueur1 = new Joueur("Joueur 1", new Flotte(), false);
        Joueur joueur2 = new Joueur("Joueur 2", new Flotte(), false);
        ArrayList<Point> PositionBateau;
        PositionBateau.add(new Point(0,0));
        PositionBateau.add(new Point(0,1));
        PositionBateau.add(new Point(0,2));
        Bateau bateau = new Bateau(TypeBateau.Destroyer,PositionBateau,Etat.DETENT,3);
        joueur2.getFlotte().ajout(bateau);
        boolean expResult = true;
        boolean result = joueur1.effectuerTir(joueur2, new Point(0,0));
        assertEquals(expResult, result);
    }

    /**
     * Test of placerBateaux method, of class Joueur.
     */
    @Test
    public void testPlacerBateaux() {
        System.out.println("placerBateaux");
        Joueur instance = new Joueur();
        instance.placerBateaux();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
}
