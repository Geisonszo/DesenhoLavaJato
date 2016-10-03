package fga.unb.desenho20162.lavajato.Controller;

import fga.unb.desenho20162.lavajato.DAO.LavagemDAO;
import fga.unb.desenho20162.lavajato.model.Cliente;
import fga.unb.desenho20162.lavajato.model.TipoLavagemModel;
import fga.unb.desenho20162.lavajato.model.Veiculo;


public class LavagemController {

    private Cliente cliente;
    private Veiculo veiculo;
    private TipoLavagemModel lavagem;

    private LavagemDAO novaLavagem;

    public void setLavagem(String nome, String telefone , String tipo, String placa, String cor,
                    String marca, String modelo, String tipo_lavagem) {

        float valor = 0;

        cliente = new Cliente(nome, telefone);
        veiculo = new Veiculo(tipo, placa, cor, marca, modelo);

        if (tipo_lavagem.equals("PINTURA") && tipo.equals("PEQUENO")) {

            valor = (float) 20.00;
        } else if (tipo_lavagem.equals("AMERICANA") && tipo.equals("PEQUENO")) {

            valor = (float) 30.00;
        } else if (tipo_lavagem.equals("PINTURA") && tipo.equals("SUV")) {

            valor = (float) 30.00;
        } else if (tipo_lavagem.equals("AMERICANA") && tipo.equals("SUV")) {

            valor = (float) 40.00;
        } else if (tipo_lavagem.equals("PINTURA") && tipo.equals("CAMINHONETE")) {

            valor = (float) 30.00;
        } else if (tipo_lavagem.equals("AMERICANA") && tipo.equals("CAMINHONETE")) {

            valor = (float) 40.00;
        } else if (tipo_lavagem.equals("MOTOR")) {

            valor = (float) 25.00;
        }

        lavagem = new TipoLavagemModel(tipo_lavagem, valor);

        salvarLavagem(cliente, veiculo, lavagem);
    }

    private void salvarLavagem( Cliente cliente, Veiculo veiculo,
                                TipoLavagemModel tipoLavagem) {

        novaLavagem = new LavagemDAO();

        novaLavagem.saveLavagemFirebase(cliente, veiculo, tipoLavagem);
    }
}
