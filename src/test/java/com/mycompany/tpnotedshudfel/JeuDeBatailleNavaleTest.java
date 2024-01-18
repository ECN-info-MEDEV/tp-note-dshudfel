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
public class JeuDeBatailleNavaleTest {
    
    public JeuDeBatailleNavaleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of initialiserPartie method, of class JeuDeBatailleNavale.
     */
    @Test
    public void testInitialiserPartie() {
        System.out.println("initialiserPartie");
        JeuDeBatailleNavale instance = null;
        instance.initialiserPartie();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of commencerTour method, of class JeuDeBatailleNavale.
     */
    @Test
    public void testCommencerTour() {
        System.out.println("commencerTour");
        JeuDeBatailleNavale instance = null;
        instance.commencerJeu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of effectuerTir method, of class JeuDeBatailleNavale.
     */
    @Test
    public void testEffectuerTir() {
        System.out.println("effectuerTir");
        Joueur joueur = null;
        Point coord = null;
        JeuDeBatailleNavale instance = null;
        boolean expResult = false;
        boolean result = instance.effectuerTir(joueur, coord);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierFinPartie method, of class JeuDeBatailleNavale.
     */
    @Test
    public void testVerifierFinPartie() {
        System.out.println("verifierFinPartie");
        JeuDeBatailleNavale instance = null;
        boolean expResult = false;
        boolean result = instance.verifierFinPartie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
