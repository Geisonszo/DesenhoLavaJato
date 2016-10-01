package fga.unb.desenho20162.lavajato.Controller;

import fga.unb.desenho20162.lavajato.DAO.LavagemDAO;
import fga.unb.desenho20162.lavajato.model.ClienteModel;
import fga.unb.desenho20162.lavajato.model.TipoLavagemModel;
import fga.unb.desenho20162.lavajato.model.VeiculoModel;


public class CadastrarLavagemController {

    private ClienteModel clienteModel;
    private VeiculoModel veiculoModel;

    public void cadastrar(String nome, String telefone, String tamanho, String placa, String cor,
                          String marca, String modelo) {

        clienteModel = new ClienteModel(nome, telefone);
        veiculoModel = new VeiculoModel(tamanho, placa, cor, marca, modelo);

        salvarLavagem(clienteModel, veiculoModel);
    }

    private void salvarLavagem(ClienteModel clienteModel, VeiculoModel veiculoModel) {

        LavagemDAO lavagem = new LavagemDAO();

        lavagem.saveLavagemFirebase(clienteModel, veiculoModel);
    }
}
