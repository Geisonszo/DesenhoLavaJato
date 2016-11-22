package fga.unb.desenho20162.lavajato.ConcretStartegy;

import fga.unb.desenho20162.lavajato.Estrategy.LavagemStrategy;

public class LavagemStrategyMotor implements LavagemStrategy {

    private String tamanho;

    public LavagemStrategyMotor(String tamanho) {

        this.setTipoVeiculo(tamanho);
    }

    private void setTipoVeiculo ( String tamanho ) {

        this.tamanho = tamanho;
    }

    @Override
    public double calculaValor () {

        switch(tamanho) {

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
