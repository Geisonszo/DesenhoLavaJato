package fga.unb.desenho20162.lavajato.DAO;

import com.google.firebase.database.DatabaseReference;

import fga.unb.desenho20162.lavajato.Model.Cliente;
import fga.unb.desenho20162.lavajato.Model.TipoLavagem;
import fga.unb.desenho20162.lavajato.Model.Veiculo;

public class LavagemDAO {

    public LavagemDAO() {

    }

   public void createLavagem( Cliente cliente, Veiculo veiculo, TipoLavagem tipoLavagem) {

       DatabaseReference firebaseRef = connectToDB();

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

   private DatabaseReference connectToDB() {

       DatabaseReference factoryConnection = FactoryConnection.getInstance().getConnection();

       return factoryConnection.child("Lavagem").push();
   }
}