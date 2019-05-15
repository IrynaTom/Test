package com.test.stepic.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Logirovanie {
    public static void main(String[] args) {

    }
    private static void configureLogging() {
        Logger LOGGER1 = Logger.getLogger("org.example.java.logging.ClassA");
        Logger LOGGER2 = Logger.getLogger("org.example.java.logging.ClassB");
        Logger LOGGER3 = Logger.getLogger("org.example.java");

            LOGGER1.setLevel(Level.ALL);
            LOGGER2.setLevel(Level.WARNING);

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        LOGGER3.addHandler(handler);
        LOGGER3.setUseParentHandlers(false);

    }
}
