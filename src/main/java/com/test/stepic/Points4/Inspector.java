package com.test.stepic.Points4;

public class Inspector implements MailService {

    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    @Override
    public Sendable processMail(Sendable mail) {

        MailPackage mailPackage;
        if (mail instanceof MailPackage) {
            mailPackage = (MailPackage) mail;
            if (mailPackage.getContent().getContent().equals(WEAPONS)
                    || mailPackage.getContent().getContent().equals(BANNED_SUBSTANCE)) {
                throw new IllegalPackageException();
            }
            if(mailPackage.getContent().getContent().contains("stones")){
                throw new StolenPackageException();
            }
        }
        return mail;
    }


    public static class StolenPackageException extends java.lang.RuntimeException {

    }

    public static class IllegalPackageException extends java.lang.RuntimeException {

    }
}
