/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpnotedshudfel;

/**
 *
 * @author hudsonteixeira
 */

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class LogHandler extends StreamHandler {

    @Override
    public synchronized void publish(LogRecord record) {
        //add own logic to publish
        super.publish(record);
    }


    @Override
    public synchronized void flush() {
        super.flush();
    }


    @Override
    public synchronized void close() throws SecurityException {
        super.close();
    }

}