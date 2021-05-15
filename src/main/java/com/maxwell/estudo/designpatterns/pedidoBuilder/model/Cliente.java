package com.maxwell.estudo.designpatterns.pedidoBuilder.model;

import java.io.Serializable;

public class Cliente implements Serializable {

    String nome;

    public Cliente(){

    }
    public Cliente(String n){
        this.nome = n;
    }

    public String getNome(){
        return this.nome;
    }

}
