package com.maxwell.estudo.designpatterns.facade.domain;

import com.maxwell.estudo.designpatterns.facade.domain.enums.TipoQuadro;

public class BicicletaFacade {

    private Quandro quandro;
    private Garfo garfo;
    private Guidon guidon;
    private Rodas rodas;
    private Acessorios acessorios;

    public void montarBicicleta(){

        this.quandro = new Quandro();
        this.garfo = new Garfo();
        this.guidon = new Guidon();
        this.rodas  = new Rodas();
        this.acessorios = new Acessorios();
        iniciarMontagem();

    }

    private void iniciarMontagem(){
        this.quandro.escrolherOQuadroQueSeraUtilizado(TipoQuadro.MONARK_20);
        this.garfo.montarGafo();
        this.guidon.montarGuidon();
        this.rodas.montarRodas();
        this.acessorios.montarAcessorios();
    }
}
