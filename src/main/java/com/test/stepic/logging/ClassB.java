package com.test.stepic.logging;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassB {
    private static final Logger LOGGER = Logger.getLogger(ClassB.class.getName());

    public static void main(String[] args) {
        LOGGER.log(Level.WARNING,"WARNING", Arrays.toString(args));
    }
}
