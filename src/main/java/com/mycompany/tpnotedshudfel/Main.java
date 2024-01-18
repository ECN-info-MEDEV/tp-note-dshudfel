/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpnotedshudfel;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 *
 * @author hudsonteixeira
 */
public class Main {
    public static void main(String[] args) {
        JeuDeBatailleNavale jeu = new JeuDeBatailleNavale(5);
        jeu.initialiserPartie();
    }
}
