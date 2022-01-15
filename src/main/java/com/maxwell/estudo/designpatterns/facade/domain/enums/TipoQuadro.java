package com.maxwell.estudo.designpatterns.facade.domain.enums;

public enum TipoQuadro {

    MONARK_20("Quadro Monark Aro 20"),
    MONARK_24("Quadro Monark Aro 24"),
    MONARK_26("Quadro Monark Aro 26");

    private String tipo;

    TipoQuadro(String opcao){
     this.tipo = opcao;
    }

    public String getTipo(){
        return  this.tipo;
    }
}
