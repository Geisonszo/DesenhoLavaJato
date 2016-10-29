package fga.unb.desenho20162.lavajato.Controller;

import fga.unb.desenho20162.lavajato.DAO.LavagemDAO;
import fga.unb.desenho20162.lavajato.model.Cliente;
import fga.unb.desenho20162.lavajato.model.TipoLavagem;
import fga.unb.desenho20162.lavajato.model.Veiculo;


public class LavagemController {

    private Cliente cliente;
    private Veiculo veiculo;
    private TipoLavagem lavagem;

    private LavagemDAO novaLavagem;

    public void setLavagem(String nome, String telefone , String tipo, String placa, String cor,
                    String marca, String modelo, String tipo_lavagem) {

        double valor = calculaValorTotal(tipo_lavagem, tipo);

        cliente = new Cliente(nome, telefone);
        veiculo = new Veiculo(tipo, placa, cor, marca, modelo);
        lavagem = new TipoLavagem(tipo_lavagem, valor);

        salvarLavagem(cliente, veiculo, lavagem);
    }

    private void salvarLavagem( Cliente cliente, Veiculo veiculo,
                                TipoLavagem tipoLavagem) {

        novaLavagem = new LavagemDAO();

        novaLavagem.saveLavagemFirebase(cliente, veiculo, tipoLavagem);
    }

    private double calculaValorTotal ( String tipo_lavagem, String tipo ) {

        double valor = 0;

        if (tipo_lavagem.equals("PINTURA") && tipo.equals("PEQUENO")) {

            return valor =  20.00;
        } else if (tipo_lavagem.equals("AMERICANA") && tipo.equals("PEQUENO")) {

            return valor =  30.00;
        } else if (tipo_lavagem.equals("PINTURA") && tipo.equals("SUV")) {

            return valor =  30.00;
        } else if (tipo_lavagem.equals("AMERICANA") && tipo.equals("SUV")) {

            return valor =  40.00;
        } else if (tipo_lavagem.equals("PINTURA") && tipo.equals("CAMINHONETE")) {

            return valor =  30.00;
        } else if (tipo_lavagem.equals("AMERICANA") && tipo.equals("CAMINHONETE")) {

            return valor =  40.00;
        } else if (tipo_lavagem.equals("MOTOR")) {

            return valor =  25.00;
        } else if (tipo.equals("MOTO")) {

            return valor =  25.00;
        }
        
        return valor;
    }
}
