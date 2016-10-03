package fga.unb.desenho20162.lavajato.DAO;


import com.google.firebase.database.DatabaseReference;

import fga.unb.desenho20162.lavajato.model.Funcionario;

public class FuncionarioDAO {

    final private DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseReference firebaseRef = databaseConnection.getFirebase().child("Funcionario").push();

    public void saveFuncionarioFirebase( Funcionario funcionario) {

        firebaseRef.child("nome").setValue(funcionario.getNome());
        firebaseRef.child("telefone").setValue(funcionario.getTelefone());
        firebaseRef.child("sexo").setValue(funcionario.getSexo());
        firebaseRef.child("cpf").setValue(funcionario.getCpf());
        firebaseRef.child("diaria").setValue(funcionario.getDiaria());
        firebaseRef.child("endereco").setValue(funcionario.getEndereco());
    }
}
