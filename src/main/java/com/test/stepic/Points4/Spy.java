package com.test.stepic.Points4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService {
    private static final String AUSTIN_POWERS = "Austin Powers";


    @Override
    public Sendable processMail(Sendable mail) {
        Logger LOGGER = Logger.getLogger("org.stepic.java.logging.MailMessage");
        if (mail.getFrom().contains(AUSTIN_POWERS) ||
                (mail.getTo().contains(AUSTIN_POWERS))) {
            LOGGER.setLevel(Level.WARNING);
            System.out.println("WARN:Detected target mail correspondence: from {from} to {to} \"{message}\"");
        } else {
            LOGGER.setLevel(Level.INFO);
            System.out.println("INFO: Usual correspondence: from {from} to {to}");
        }
        return mail;
    }
}

