package fga.unb.desenho20162.lavajato.Controller;

import fga.unb.desenho20162.lavajato.DAO.LavagemDAO;
import fga.unb.desenho20162.lavajato.model.ClienteModel;
import fga.unb.desenho20162.lavajato.model.TipoLavagemModel;
import fga.unb.desenho20162.lavajato.model.VeiculoModel;


public class CadastroLavagemController {

    private ClienteModel cliente;
    private VeiculoModel veiculo;
    private TipoLavagemModel lavagem;

    private LavagemDAO novaLavagem;

    public void setLavagem(String nome, String telefone , String tipo, String placa, String cor,
                    String marca, String modelo, String tipo_lavagem) {

        float valor = 0;

        cliente = new ClienteModel(nome, telefone);
        veiculo = new VeiculoModel(tipo, placa, cor, marca, modelo);

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

    private void salvarLavagem(ClienteModel clienteModel, VeiculoModel veiculoModel,
                               TipoLavagemModel tipoLavagem) {

        novaLavagem = new LavagemDAO();

        novaLavagem.saveLavagemFirebase(clienteModel, veiculoModel, tipoLavagem);
    }
}
