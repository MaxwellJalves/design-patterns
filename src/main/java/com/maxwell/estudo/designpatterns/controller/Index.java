package com.maxwell.estudo.designpatterns.controller;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Index {

    @GetMapping
    public ResponseEntity<?> retorno (){
        return ResponseEntity.ok().body("CONEXÃO REALIZADA COM SUCESSO");
    }
}
