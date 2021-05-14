package com.maxwell.estudo.designpatterns.menssageria.services;

import com.maxwell.estudo.designpatterns.menssageria.model.Email;
import com.maxwell.estudo.designpatterns.menssageria.model.Sms;
import com.maxwell.estudo.designpatterns.menssageria.repositories.MensagemRepository;
import org.springframework.stereotype.Service;

@Service
public class MenssagemServices {

    public static MensagemRepository getMenssagem (int id){
        switch (id){
            case 1 :
                return new Email();
            case 2 :
                return new Sms();
            default:
                return new Email();
        }
    }
}
