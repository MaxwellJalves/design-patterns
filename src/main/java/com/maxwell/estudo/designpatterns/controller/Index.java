package com.maxwell.estudo.designpatterns.controller;

import com.maxwell.estudo.designpatterns.repositories.MensagemRepository;
import com.maxwell.estudo.designpatterns.services.MenssagemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Index {

    @GetMapping
    public ResponseEntity<?> getPadraoFactorySemAnnotations(){
        MensagemRepository m = MenssagemServices.getMenssagem(1);
        return ResponseEntity.ok().body(m.enviar("Maxwell Costa",
                "Utilizando padrão Factory sem utilizar annotacao do spring, o objetivo é entender o padrao"));
    }
}
