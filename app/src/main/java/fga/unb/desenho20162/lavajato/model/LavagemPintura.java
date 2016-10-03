package fga.unb.desenho20162.lavajato.model;

public class LavagemPintura extends Lavagem{

    private double valor = 0;

    @Override
    public double calculaValor ( String tipoVeiculo ) {

        switch (tipoVeiculo) {
            case "PEQUENO":

                return valor = 20.00;
            case "SUV":

                return valor = 30.00;
            case "CAMINHONETE":

                return valor = 30.00;
            case "MOTO" :

                return  valor = 25.00;
        }

        return 0;
    }
}
