package fga.unb.desenho20162.lavajato.Controller;

import fga.unb.desenho20162.lavajato.DAO.FuncionarioDAO;
import fga.unb.desenho20162.lavajato.model.Funcionario;

public class FuncionarioController {

    public void setFuncionario ( String nome, String cpf, String sexo, double diaria, String telefone, String tipoTelefone, String endereco ) {

        Funcionario funcionario =  new Funcionario(nome, cpf, sexo, diaria, telefone, tipoTelefone, endereco );

        salvarFuncionario(funcionario);
    }

    private void salvarFuncionario(Funcionario funcionario) {

        FuncionarioDAO novoFuncionario = new FuncionarioDAO();

        novoFuncionario.saveFuncionarioFirebase(funcionario);
    }
}
