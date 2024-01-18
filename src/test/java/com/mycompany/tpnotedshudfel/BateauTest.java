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
public class BateauTest {
    
    public BateauTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getType method, of class Bateau.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        Bateau instance = null;
        TypeBateau expResult = null;
        TypeBateau result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoordonnees method, of class Bateau.
     */
    @Test
    public void testGetCoordonnees() {
        System.out.println("getCoordonnees");
        Bateau instance = null;
        ArrayList<Point> expResult = null;
        ArrayList<Point> result = instance.getCoordonnees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEtat method, of class Bateau.
     */
    @Test
    public void testGetEtat() {
        System.out.println("getEtat");
        Bateau instance = null;
        Etat expResult = null;
        Etat result = instance.getEtat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEtat method, of class Bateau.
     */
    @Test
    public void testSetEtat() {
        System.out.println("setEtat");
        Etat etat = null;
        Bateau instance = null;
        instance.setEtat(etat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of recevoirTir method, of class Bateau.
     */
    @Test
    public void testRecevoirTir() {
        System.out.println("recevoirTir");
        Point coord = null;
        Bateau instance = null;
        instance.recevoirTir(coord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaille method, of class Bateau.
     */
    @Test
    public void testGetTaille() {
        System.out.println("getTaille");
        Bateau instance = null;
        int expResult = 0;
        int result = instance.getTaille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaille method, of class Bateau.
     */
    @Test
    public void testSetTaille() {
        System.out.println("setTaille");
        int taille = 0;
        Bateau instance = null;
        instance.setTaille(taille);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
