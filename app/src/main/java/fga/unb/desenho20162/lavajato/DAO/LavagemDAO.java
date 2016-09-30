package fga.unb.desenho20162.lavajato.DAO;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import fga.unb.desenho20162.lavajato.model.ClienteModel;
import fga.unb.desenho20162.lavajato.model.VeiculoModel;

public class LavagemDAO {

    DatabaseReference dbReference = FirebaseDatabase.getInstance()
            .getReferenceFromUrl("https://lavajato-adcfb.firebaseio.com/Lavagem");
    
    DatabaseReference novaRef = dbReference.push();

    public LavagemDAO() {

    }

    public void createLavagem(ClienteModel cliente, VeiculoModel veiculo) {


        novaRef.child("nome").setValue(cliente.getNome());
        novaRef.child("telefone").setValue(cliente.getTelefone());

        novaRef.child("tamanho").setValue(veiculo.getTamanho());
        novaRef.child("placa").setValue(veiculo.getPlaca());
        novaRef.child("cor").setValue(veiculo.getCor());
        novaRef.child("marca").setValue(veiculo.getMarca());
        novaRef.child("modelo").setValue(veiculo.getModelo());
    }
}
