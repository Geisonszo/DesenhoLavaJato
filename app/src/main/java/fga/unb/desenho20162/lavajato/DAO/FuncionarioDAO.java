package fga.unb.desenho20162.lavajato.DAO;


import com.google.firebase.database.DatabaseReference;

import fga.unb.desenho20162.lavajato.Model.Funcionario;

public class FuncionarioDAO {

    public void createFuncionario( Funcionario funcionario) {

        DatabaseReference firebaseRef = connectToDB();

        firebaseRef.child("nome").setValue(funcionario.getNome());
        firebaseRef.child("sexo").setValue(funcionario.getSexo());
        firebaseRef.child("telefone").setValue(funcionario.getTelefone());
        firebaseRef.child("tipo_telefone").setValue(funcionario.getTipoTelefone());
        firebaseRef.child("cpf").setValue(funcionario.getCpf());
        firebaseRef.child("diaria").setValue(funcionario.getDiaria());
        firebaseRef.child("endereco").setValue(funcionario.getEndereco());
    }

    private DatabaseReference connectToDB() {

        FirebaseConnection firebaseConnection = FirebaseConnection.getInstance();

        return firebaseConnection.getConnection().child("Funcionario").push();
    }


}
