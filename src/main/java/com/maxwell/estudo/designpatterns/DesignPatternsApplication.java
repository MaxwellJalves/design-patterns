package com.maxwell.estudo.designpatterns;

import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Cliente;
import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Pedido;
import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Produto;
import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Vendedor;
import com.maxwell.estudo.designpatterns.pedidoBuilder.services.PedidoBuilderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.ArrayList;

@SpringBootApplication
public class DesignPatternsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Cliente cli1 = new Cliente();
//		cli1.setId(1010);
//		cli1.setNome("JOAO");
//
//		Cliente cli2 = new Cliente();
//		cli2.setId(1012);
//		cli2.setNome("MARIA");
//
//		Produto prd1 = new Produto();
//		prd1.setId(101010);
//		prd1.setDescricao("COCA COLA");
//		prd1.setValor(BigDecimal.valueOf(5.20).setScale(2));
//		prd1.setQuantidade(2);
//
//		Produto prd2 = new Produto();
//		prd2.setId(101011);
//		prd2.setDescricao("HAMBURGUER");
//		prd2.setQuantidade(2);
//		prd2.setValor(BigDecimal.valueOf(12.3).setScale(2));
//
//		Vendedor vendedor = new Vendedor();
//		vendedor.setIdentificado(1);
//		vendedor.setNome("PAULO SILVA");
//
//		System.out.println(cli1);
//		System.out.println(cli2);
//		System.out.println(prd1);
//		System.out.println(prd2);
//		System.out.println(vendedor);
//
//		//Sem utilizar Patterns Builder
//		Pedido ped1 = new Pedido();
//		ped1.setVendedor(vendedor);
//		ped1.setCliente(cli1);
//		ped1.setProdutos(new ArrayList<>());
//		ped1.getTotalItens();
//		ped1.getProdutos().add(prd1);
//		ped1.getProdutos().add(prd2);
//
//		//Return extrato do pedido
//
//
//		System.out.println(ped1.getCliente());
//		System.out.println("###\t[CONFERENCIA]\t###\n### ITENS DO PEDIDO ###");
//		for(Produto p : ped1.getProdutos()){
//			System.out.println("##\t" +p);
//		}
//		System.out.println("Quantidade de Itens :\t"+ped1.getTotalItens());
//		System.out.println("Total do Pedido     :\t" + ped1.getValorTotal());

		Pedido ped = new PedidoBuilderService()
				.setPedido(10100)
				.setCliente(10,"MAXWELL")
				.setProduto(2001,"COMBO PROMOCIONAL IFOOD",2, BigDecimal.valueOf(50.2))
				.setProduto(2002,"COMBO KIDS",2, BigDecimal.valueOf(29.2))
				.setVendedor(1000,"FUNCIONARIO PADRAO").getPedidoBuilder();

		System.out.println("UTILIZANDO BUILDER");
		System.out.println(ped);
		System.out.println("###\t[CONFERENCIA]\t###\n### ITENS DO PEDIDO ###");
		for(Produto p : ped.getProdutos()){
			System.out.println("##\t" +p);
		}
		System.out.println("Quantidade de Itens :\t"+ped.getTotalItens());
		System.out.println("Total do Pedido     :\t" + ped.getValorTotal());

	}
}
