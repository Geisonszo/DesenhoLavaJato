package fga.unb.desenho20162.lavajato.DAO;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import fga.unb.desenho20162.lavajato.Model.Cliente;
import fga.unb.desenho20162.lavajato.Model.OrdemLavagem;
import fga.unb.desenho20162.lavajato.Model.TipoLavagem;
import fga.unb.desenho20162.lavajato.Model.Veiculo;

public class LavagemDAO {

    public LavagemDAO() {

    }

  private DatabaseReference connectToDB() {

    DatabaseReference factoryConnection = FirebaseConnection.getInstance().getConnection();

    return factoryConnection.child("Lavagem").push();
  }

   public void createLavagem(Cliente cliente, Veiculo veiculo, TipoLavagem tipoLavagem) {

       DatabaseReference firebaseRef = connectToDB();

       firebaseRef.child("nome").setValue(cliente.getNome());
       firebaseRef.child("telefone").setValue(cliente.getTelefone());
       firebaseRef.child("tipo").setValue(veiculo.getTipo());
       firebaseRef.child("placa").setValue(veiculo.getPlaca());
       firebaseRef.child("cor").setValue(veiculo.getCor());
       firebaseRef.child("marca").setValue(veiculo.getMarca());
       firebaseRef.child("modelo").setValue(veiculo.getModelo());
       firebaseRef.child("tipo_lavagem").setValue(tipoLavagem.getDescricao());
       firebaseRef.child("valor_lavagem").setValue(tipoLavagem.getValor());
    }
}