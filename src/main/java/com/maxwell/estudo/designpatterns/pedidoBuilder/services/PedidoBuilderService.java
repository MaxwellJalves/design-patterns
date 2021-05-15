package com.maxwell.estudo.designpatterns.pedidoBuilder.services;

import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Cliente;
import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Pedido;

public class PedidoBuilderService {

    public Pedido pedido;

    public PedidoBuilderService(){
        this.pedido = new Pedido();
    }
    public PedidoBuilderService getCliente(String nome){
        Cliente cli = new Cliente("Maxwell");
        pedido.setCliente(cli);
        return this;
    }

    public PedidoBuilderService getPedido(int id,String descricao,double valor){
        this.pedido = new Pedido(1,"HAMBURGUER",22.5d);
        pedido.setId(id,descricao,valor);
        return this;
    }
}
