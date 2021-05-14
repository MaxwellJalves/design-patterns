package com.maxwell.estudo.designpatterns.model;

import com.maxwell.estudo.designpatterns.repositories.MensagemRepository;

public class Email implements MensagemRepository {
    private String destinatario;
    private String assunto;

    public Email(){}

    public Email(String destinatario, String assunto) {
        super();
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
    public String enviar(String mensagem,String m2) {
        return "Email : " + mensagem +" -"+ m2;
    }
}
