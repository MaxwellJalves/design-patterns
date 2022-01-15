package com.maxwell.estudo.designpatterns.facade.domain;

import com.maxwell.estudo.designpatterns.facade.domain.enums.TipoQuadro;

public class Quandro {

    public void escrolherOQuadroQueSeraUtilizado(TipoQuadro tipoQuadro){
        System.out.printf("Quadro Selecionado: >> %s ,\n Montagem será iniciada ...",tipoQuadro);
    }
}
