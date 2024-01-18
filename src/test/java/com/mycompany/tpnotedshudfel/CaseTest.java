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
public class CaseTest {
    
    public CaseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getEtatCase method, of class Case.
     */
    @Test
    public void testGetEtatCase() {
        System.out.println("getEtatCase");
        Case instance = new Case();
        Case.EtatCase expResult = null;
        Case.EtatCase result = instance.getEtatCase();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEtatCase method, of class Case.
     */
    @Test
    public void testSetEtatCase() {
        System.out.println("setEtatCase");
        Case.EtatCase etatCase = null;
        Case instance = new Case();
        instance.setEtatCase(etatCase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
