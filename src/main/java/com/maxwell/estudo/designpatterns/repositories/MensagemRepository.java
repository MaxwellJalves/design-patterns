package com.maxwell.estudo.designpatterns.repositories;

import org.springframework.stereotype.Repository;

//@Repository
public interface MensagemRepository {

    public String enviar(String destinatario,String assunto);

}
