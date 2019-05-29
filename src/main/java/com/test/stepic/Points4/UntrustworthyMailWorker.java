package com.test.stepic.Points4;

public  class UntrustworthyMailWorker implements MailService {


    private RealMailService realMailService;
    private MailService[] mailServices;

    public RealMailService getRealMailService() {
        return realMailService;
    }

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices;
        for (MailService ms : this.mailServices) {
            if (ms instanceof RealMailService)
                this.realMailService = (RealMailService)ms;
        }
        if (this.realMailService == null) {
            this.realMailService = new RealMailService();
        }
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable m = mail;
        for (MailService ms : this.mailServices) {
            if (ms instanceof RealMailService)
                continue;
            m = ms.processMail(m);
        }
        if (getRealMailService() != null) {
            m = this.realMailService.processMail(m);
        }
        return m;
    }

    }
