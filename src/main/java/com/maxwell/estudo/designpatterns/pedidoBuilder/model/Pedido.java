package com.maxwell.estudo.designpatterns.pedidoBuilder.model;

public class Pedido {

    private Integer id;
    private String descricao;
    private double valor;
    private Cliente cliente= new Cliente();

    public Pedido(){}
    public Pedido(Integer id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setId(int id, String descricao, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;

    }
}
