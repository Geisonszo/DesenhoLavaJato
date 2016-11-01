package fga.unb.desenho20162.lavajato.ConcretStartegy;

import fga.unb.desenho20162.lavajato.Estrategy.Lavagem;

public class LavagemPintura implements Lavagem {

    private String tipoVeiculo;

    public LavagemPintura ( String tipoVeiculo) {

        setTipoVeiculo(this.tipoVeiculo);
    }

    private void setTipoVeiculo ( String tipoVeiculo ) {
        this.tipoVeiculo = tipoVeiculo;
    }


    @Override
    public double valorLavegem ( ) {

        switch(tipoVeiculo) {

            case "PEQUENO" :
                return 20.00;

            case "SUV" :
                return 30.00;

            case "CAMINHONETE" :
                return 30.00;
        }

        return 0;
    }
}
