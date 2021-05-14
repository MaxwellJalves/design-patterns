package com.maxwell.estudo.designpatterns.menssageria.model;

import com.maxwell.estudo.designpatterns.menssageria.repositories.MensagemRepository;

public class Email implements MensagemRepository {


    @Override
    public String enviar(String destinatario, String assunto) {
        return "EMAIL :  Destinatario : " + destinatario + "\t Assunto: " +assunto;
    }
}
