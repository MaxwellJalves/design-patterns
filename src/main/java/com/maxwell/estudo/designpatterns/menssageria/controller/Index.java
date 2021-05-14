package com.maxwell.estudo.designpatterns.menssageria.controller;

import com.maxwell.estudo.designpatterns.menssageria.repositories.MensagemRepository;
import com.maxwell.estudo.designpatterns.menssageria.services.MenssagemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("menssagem")
public class Index {

    @Autowired
    MenssagemServices services;

    @GetMapping
    public ResponseEntity<?> sendMessage(){
        MensagemRepository m = services.getMenssagem(2);
        return ResponseEntity.ok().body(m.enviar("Maxwell","PADRAO CRIACIONAL : CRIADO OBJETO SEM ESPECIFICAR QUAL CLASSE ESTÁ SENDO UTILIZADA"));
    }
}
