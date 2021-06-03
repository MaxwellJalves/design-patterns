package com.maxwell.estudo.designpatterns.pedidoBuilder.model;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {

    private Integer numero;
    private List<Produto> produtos;
    private Cliente cliente;
    private Vendedor vendedor;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public BigDecimal getValorTotal(){
        BigDecimal total = BigDecimal.ZERO;
        for(Produto prd : produtos){
            total = total.add(prd.getValor()
                                 .multiply(BigDecimal.valueOf(
                              prd.getQuantidade())));
        }
        return total;
    }

    public int getTotalItens(){
        int n = 0;
        for(Produto prod : produtos){
            n += prod.getQuantidade();
        }
        return n;
    }
    public List<Produto> getProdutos() {
       return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "produtos=" + produtos +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                '}';
    }
}
