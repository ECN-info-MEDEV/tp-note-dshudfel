/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author hudsonteixeira
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.tpnotedshudfel.FlotteTest.class, com.mycompany.tpnotedshudfel.MainTest.class, com.mycompany.tpnotedshudfel.JeuDeBatailleNavaleTest.class, com.mycompany.tpnotedshudfel.CaseTest.class, com.mycompany.tpnotedshudfel.GrilleTest.class, com.mycompany.tpnotedshudfel.PointTest.class, com.mycompany.tpnotedshudfel.TypeBateauTest.class, com.mycompany.tpnotedshudfel.EtatTest.class, com.mycompany.tpnotedshudfel.BateauTest.class, com.mycompany.tpnotedshudfel.JoueurTest.class})
public class TpnotedshudfelSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
}
