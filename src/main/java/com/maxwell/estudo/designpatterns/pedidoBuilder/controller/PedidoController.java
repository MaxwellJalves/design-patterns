package com.maxwell.estudo.designpatterns.pedidoBuilder.controller;



import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Pedido;
import com.maxwell.estudo.designpatterns.pedidoBuilder.model.Produto;
import com.maxwell.estudo.designpatterns.pedidoBuilder.services.PedidoBuilderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("pedidos")
public class PedidoController {

    Pedido ped = new PedidoBuilderService()
                     .setPedido(1020)
                     .setCliente(10,"MAXWELL")
                     .setProduto(2001,"COCA COLA",2, BigDecimal.valueOf(5.2))
                     .setProduto(2002,"2x Pizza de bacon mais Antarctica de 1 litro",1, BigDecimal.valueOf(91,0))
                     .setVendedor(1000,"IFOOD ONLINE").getPedidoBuilder();

    @GetMapping
    public ResponseEntity<?> getPedido(){
        return ResponseEntity.ok().body(ped);
    }
}
