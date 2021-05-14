package com.maxwell.estudo.designpatterns.menssageria.model;

import com.maxwell.estudo.designpatterns.menssageria.repositories.MensagemRepository;

public class Sms implements MensagemRepository {

    @Override
    public String enviar(String destinatario, String assunto) {
        return "SMS :  Destinatario : " + destinatario + "\t Assunto: " +assunto;
    }
}
