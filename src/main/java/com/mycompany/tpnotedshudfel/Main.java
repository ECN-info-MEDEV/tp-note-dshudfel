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
    static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        try {
          LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
        } catch (SecurityException | IOException e1) {
        }
        try {
            //FileHandler file name with max size and number of log files limit
            Handler fileHandler = new FileHandler("./logger.log", 2000, 5);
            fileHandler.setFormatter(new LogFormatter());
            //setting custom filter for FileHandler
            fileHandler.setFilter(new MyLoggerFilter());
        } catch (SecurityException | IOException e) {
        }
                 logger.log(Level.INFO, "Hello LOG Word =)");
    }
}
