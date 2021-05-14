package com.maxwell.estudo.designpatterns.menssageria.repositories;

//@Repository
public interface MensagemRepository {

    public String enviar(String destinatario,String assunto);

}
