package com.maxwell.estudo.designpatterns.pedidoBuilder.model;

public class Vendedor {
    private Integer identificado;
    private String nome;

    public Integer getIdentificado() {
        return identificado;
    }

    public void setIdentificado(Integer identificado) {
        this.identificado = identificado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "identificado=" + identificado +
                ", nome='" + nome + '\'' +
                '}';
    }
}
