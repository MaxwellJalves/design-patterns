package com.maxwell.estudo.designpatterns.services;

import com.maxwell.estudo.designpatterns.model.Email;
import com.maxwell.estudo.designpatterns.model.Sms;
import com.maxwell.estudo.designpatterns.repositories.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
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
