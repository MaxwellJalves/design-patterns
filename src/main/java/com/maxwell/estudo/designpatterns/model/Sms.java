package com.maxwell.estudo.designpatterns.model;

import com.maxwell.estudo.designpatterns.repositories.MensagemRepository;

public class Sms implements MensagemRepository {

    private String destinatario;
    private String assunto;

    public Sms(){}
    public Sms(String destinatario, String assunto) {
        this.destinatario = destinatario;
        this.assunto = assunto;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String enviar(String m1, String m2) {
        return "SMS : " + m1 + " - " + m2;
    }
}
