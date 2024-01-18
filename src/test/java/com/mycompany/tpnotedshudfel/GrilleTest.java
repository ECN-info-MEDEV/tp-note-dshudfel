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
public class GrilleTest {
    
    public GrilleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getCase method, of class Grille.
     */
    @Test
    public void testGetCase() {
        System.out.println("getCase");
        int taille = 0;
        Grille instance = null;
        Case expResult = null;
        Case result = instance.getCase(taille);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaille method, of class Grille.
     */
    @Test
    public void testSetTaille() {
        System.out.println("setTaille");
        int nouvelleTaille = 0;
        Grille instance = null;
        instance.setTaille(nouvelleTaille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of effectuerTir method, of class Grille.
     */
    @Test
    public void testEffectuerTir() {
        System.out.println("effectuerTir");
        Point coord = null;
        Grille instance = null;
        boolean expResult = false;
        boolean result = instance.effectuerTir(coord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placerBateau method, of class Grille.
     */
    @Test
    public void testPlacerBateau() {
        System.out.println("placerBateau");
        Bateau bateau = null;
        Point coord = null;
        String orientation = "";
        Grille instance = null;
        boolean expResult = false;
        boolean result = instance.placerBateau(bateau, coord, orientation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrille method, of class Grille.
     */
    @Test
    public void testGetGrille() {
        System.out.println("getGrille");
        Grille instance = null;
        Case[][] expResult = null;
        Case[][] result = instance.getGrille();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGrille method, of class Grille.
     */
    @Test
    public void testSetGrille() {
        System.out.println("setGrille");
        Case[][] grille = null;
        Grille instance = null;
        instance.setGrille(grille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
