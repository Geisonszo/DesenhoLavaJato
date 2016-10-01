package fga.unb.desenho20162.lavajato.DAO;

import com.google.firebase.database.DatabaseReference;

import fga.unb.desenho20162.lavajato.model.ClienteModel;
import fga.unb.desenho20162.lavajato.model.VeiculoModel;

public class LavagemDAO {

    final private DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseReference firebaseRef = databaseConnection.getFirebase().child("Lavagem").push();

    public LavagemDAO() {

    }

    public void saveLavagemFirebase(ClienteModel cliente, VeiculoModel veiculo) {

        firebaseRef.child("nome").setValue(cliente.getNome());
        firebaseRef.child("telefone").setValue(cliente.getTelefone());
        firebaseRef.child("tamanho").setValue(veiculo.getTamanho());
        firebaseRef.child("placa").setValue(veiculo.getPlaca());
        firebaseRef.child("cor").setValue(veiculo.getCor());
        firebaseRef.child("marca").setValue(veiculo.getMarca());
        firebaseRef.child("modelo").setValue(veiculo.getModelo());
    }
}