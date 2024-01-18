/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

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
        String nom = "";
        Joueur instance = new Joueur();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlotte method, of class Joueur.
     */
    @Test
    public void testGetFlotte() {
        System.out.println("getFlotte");
        Joueur instance = new Joueur();
        Flotte expResult = null;
        Flotte result = instance.getFlotte();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlotte method, of class Joueur.
     */
    @Test
    public void testSetFlotte() {
        System.out.println("setFlotte");
        Flotte flotte = null;
        Joueur instance = new Joueur();
        instance.setFlotte(flotte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEtat method, of class Joueur.
     */
    @Test
    public void testIsEtat() {
        System.out.println("isEtat");
        Joueur instance = new Joueur();
        boolean expResult = false;
        boolean result = instance.isEtat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEtat method, of class Joueur.
     */
    @Test
    public void testSetEtat() {
        System.out.println("setEtat");
        boolean etat = false;
        Joueur instance = new Joueur();
        instance.setEtat(etat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrille method, of class Joueur.
     */
    @Test
    public void testGetGrille() {
        System.out.println("getGrille");
        Joueur instance = new Joueur();
        Grille expResult = null;
        Grille result = instance.getGrille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrille method, of class Joueur.
     */
    @Test
    public void testSetGrille() {
        System.out.println("setGrille");
        Grille grille = null;
        Joueur instance = new Joueur();
        instance.setGrille(grille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTailleGrille method, of class Joueur.
     */
    @Test
    public void testSetTailleGrille() {
        System.out.println("setTailleGrille");
        int taille = 0;
        Joueur instance = new Joueur();
        instance.setTailleGrille(taille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of effectuerTir method, of class Joueur.
     */
    @Test
    public void testEffectuerTir() {
        System.out.println("effectuerTir");
        Joueur joueur = null;
        Point coord = null;
        Joueur instance = new Joueur();
        boolean expResult = false;
        boolean result = instance.effectuerTir(joueur, coord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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

    /**
     * Test of recevoirTir method, of class Joueur.
     */
    @Test
    public void testRecevoirTir() {
        System.out.println("recevoirTir");
        Point coord = null;
        Joueur instance = new Joueur();
        boolean expResult = false;
        boolean result = instance.recevoirTir(coord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierFlotteCoulee method, of class Joueur.
     */
    @Test
    public void testVerifierFlotteCoulee() {
        System.out.println("verifierFlotteCoulee");
        Joueur instance = new Joueur();
        boolean expResult = false;
        boolean result = instance.verifierFlotteCoulee();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
