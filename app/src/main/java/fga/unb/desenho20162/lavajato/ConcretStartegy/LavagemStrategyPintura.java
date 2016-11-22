package fga.unb.desenho20162.lavajato.ConcretStartegy;

import fga.unb.desenho20162.lavajato.Estrategy.LavagemStrategy;

public class LavagemStrategyPintura implements LavagemStrategy {

    private String tamanho;

    public LavagemStrategyPintura(String tamanho) {

        setTipoVeiculo(tamanho);
    }

    private void setTipoVeiculo ( String tamanho ) {
        this.tamanho = tamanho;
    }


    @Override
    public double calculaValor ( ) {

        switch(tamanho) {

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
