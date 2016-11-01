package fga.unb.desenho20162.lavajato.ConcretStartegy;

import fga.unb.desenho20162.lavajato.Estrategy.Lavagem;

public class LavagemMotor implements Lavagem {

    private String tipoVeiculo;

    public LavagemMotor (String tipoVeiculo) {

        setTipoVeiculo(this.tipoVeiculo);

    }

    private void setTipoVeiculo ( String tipoVeiculo ) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public double valorLavegem () {

        switch(tipoVeiculo) {

            case "PEQUENO" :
                return 25.00;

            case "SUV" :
                return 35.00;

            case "CAMINHONETE" :
                return 35.00;
        }

        return 0;
    }
}
