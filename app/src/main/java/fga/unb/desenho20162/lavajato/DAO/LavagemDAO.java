package fga.unb.desenho20162.lavajato.DAO;

import com.google.firebase.database.DatabaseReference;

import fga.unb.desenho20162.lavajato.model.Cliente;
import fga.unb.desenho20162.lavajato.model.TipoLavagemModel;
import fga.unb.desenho20162.lavajato.model.Veiculo;

public class LavagemDAO {

    final private DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseReference firebaseRef = databaseConnection.getFirebase().child("Lavagem").push();

    public LavagemDAO() {

    }

   public void saveLavagemFirebase( Cliente cliente, Veiculo veiculo, TipoLavagemModel tipoLavagem) {

       firebaseRef.child("nome").setValue(cliente.getNome());
       firebaseRef.child("telefone").setValue(cliente.getTelefone());
       firebaseRef.child("tipo").setValue(veiculo.getTipo());
       firebaseRef.child("placa").setValue(veiculo.getPlaca());
       firebaseRef.child("cor").setValue(veiculo.getCor());
       firebaseRef.child("marca").setValue(veiculo.getMarca());
       firebaseRef.child("modelo").setValue(veiculo.getModelo());
       firebaseRef.child("tipo_lavagem").setValue(tipoLavagem.getTipo_lavagem());
       firebaseRef.child("valor_lavagem").setValue(tipoLavagem.getValor());
    }
}