package com.test.stepic.logging;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassA {

    private static final Logger LOGGER = Logger.getLogger(ClassA.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.ALL,"ALL", Arrays.toString(args));
    }
}
