package com.maxwell.estudo.designpatterns.facade.useCase;

import com.maxwell.estudo.designpatterns.facade.domain.BicicletaFacade;

public class ObterRetornoDoFacade {

    public static void main(String[] args) {
        var fabrica = new BicicletaFacade();
        fabrica.montarBicicleta();

    }
}
