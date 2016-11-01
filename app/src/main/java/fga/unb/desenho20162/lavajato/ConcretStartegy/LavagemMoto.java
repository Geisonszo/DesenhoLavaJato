package fga.unb.desenho20162.lavajato.ConcretStartegy;

import fga.unb.desenho20162.lavajato.Estrategy.Lavagem;

public class LavagemMoto implements Lavagem {

    private String tipoVeiculo;

    public LavagemMoto ( String tipoVeiculo ) {

        setTipoVeiculo(this.tipoVeiculo);
    }

    private void setTipoVeiculo ( String tipoVeiculo ) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public double valorLavegem () {
        return 25.00;
    }
}
