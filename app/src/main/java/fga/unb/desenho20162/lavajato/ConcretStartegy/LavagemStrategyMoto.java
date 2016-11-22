package fga.unb.desenho20162.lavajato.ConcretStartegy;

import fga.unb.desenho20162.lavajato.Estrategy.LavagemStrategy;

public class LavagemStrategyMoto implements LavagemStrategy {

    private String tamanho;

    public LavagemStrategyMoto(String tamanho ) {

        this.setTipoVeiculo(tamanho);
    }

    private void setTipoVeiculo ( String tamanho ) {
        this.tamanho = tamanho;
    }

    @Override
    public double calculaValor () {
        return 25.00;
    }
}
