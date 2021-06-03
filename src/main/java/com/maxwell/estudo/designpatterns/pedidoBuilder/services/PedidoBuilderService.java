package com.maxwell.estudo.designpatterns.pedidoBuilder.services;

import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Cliente;
import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Pedido;
import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Produto;
import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Vendedor;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoBuilderService {

    private Pedido pedidomodel;

    public PedidoBuilderService(){
        this.pedidomodel = new Pedido();
    }

    public PedidoBuilderService setPedido(Integer numeroPedido){
        this.pedidomodel.setNumero(numeroPedido);
        return this;
    }
    public PedidoBuilderService setCliente(Integer id,String nome){
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNome(nome);
        pedidomodel.setCliente(cliente);
        return this;
    }

    public PedidoBuilderService setProduto(Integer codigo, String descricao, int quantidade, BigDecimal valorUnitario){
        Produto produto = new Produto();
        produto.setId(codigo);
        produto.setDescricao(descricao);
        produto.setQuantidade(quantidade);
        produto.setValor(valorUnitario);

        if(pedidomodel.getProdutos() == null){
            pedidomodel.setProdutos(new ArrayList<>());
        }
        pedidomodel.getProdutos().add(produto);
        return this;
    }

    public PedidoBuilderService setVendedor(Integer identificador,String nomeFuncionario){
        Vendedor vendedor = new Vendedor();
        vendedor.setIdentificado(identificador);
        vendedor.setNome(nomeFuncionario);
        pedidomodel.setVendedor(vendedor);
        return this;
    }

    public Pedido getPedidoBuilder(){
     return pedidomodel;
    }

}
