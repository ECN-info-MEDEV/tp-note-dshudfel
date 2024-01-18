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
public class FlotteTest {
    
    public FlotteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of ajout method, of class Flotte.
     */
    @Test
    public void testAjout() {
        System.out.println("ajout");
        Bateau bateau = null;
        Flotte instance = new Flotte();
        instance.ajout(bateau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retire method, of class Flotte.
     */
    @Test
    public void testRetire() {
        System.out.println("retire");
        Bateau bateau = null;
        Flotte instance = new Flotte();
        instance.retire(bateau);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifierEtat method, of class Flotte.
     */
    @Test
    public void testVerifierEtat() {
        System.out.println("verifierEtat");
        Flotte instance = new Flotte();
        boolean expResult = false;
        boolean result = instance.verifierEtat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBateaux method, of class Flotte.
     */
    @Test
    public void testGetBateaux() {
        System.out.println("getBateaux");
        Flotte instance = new Flotte();
        ArrayList<Bateau> expResult = null;
        ArrayList<Bateau> result = instance.getBateaux();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlotte method, of class Flotte.
     */
    @Test
    public void testSetFlotte() {
        System.out.println("setFlotte");
        ArrayList<Bateau> flotte = null;
        Flotte instance = new Flotte();
        instance.setFlotte(flotte);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
