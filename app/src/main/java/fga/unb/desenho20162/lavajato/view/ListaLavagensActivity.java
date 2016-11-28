package fga.unb.desenho20162.lavajato.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

import fga.unb.desenho20162.lavajato.Adapter.LavagemRecyclerAdapter;
import fga.unb.desenho20162.lavajato.Adapter.ItemClickListenerLavagem;
import fga.unb.desenho20162.lavajato.DAO.FirebaseConnection;
import fga.unb.desenho20162.lavajato.R;
import fga.unb.desenho20162.lavajato.Model.OrdemLavagem;

public class ListaLavagensActivity extends Activity implements ItemClickListenerLavagem {

    final private FirebaseConnection firebaseConnection = new FirebaseConnection();
    private final DatabaseReference firebaseRef = firebaseConnection.getConnection().child("Lavagem");
    private LavagemRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_lavagens);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleViewLavagem);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new LavagemRecyclerAdapter(OrdemLavagem.class, R.layout.item_lavagem,
            LavagemRecyclerAdapter.LavagemViewHolder.class, firebaseRef);
        
        adapter.setClickListener(this); // Bind the listener

        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onDestroy () {

        super.onDestroy();

        adapter.cleanup();
    }

    public void cadastrarLavagem() {

        Intent cadastrarLavagem = new Intent(this, CadastroLavagemActivity.class);
        startActivity(cadastrarLavagem);
    }

    @Override
    public void onClick(View view, int position, DatabaseReference reference, OrdemLavagem ordemLavagem) {

        Toast.makeText(getApplicationContext(), "You clicked on: " + position, Toast.LENGTH_LONG).show();

        Intent lavagemIntent = new Intent(this,Lavagem.class);

        lavagemIntent.putExtra("nome", ordemLavagem.getNome());
        lavagemIntent.putExtra("telefone", ordemLavagem.getTelefone());
        lavagemIntent.putExtra("tipo", ordemLavagem.getTipo());
        lavagemIntent.putExtra("placa", ordemLavagem.getPlaca());
        lavagemIntent.putExtra("cor", ordemLavagem.getCor());
        lavagemIntent.putExtra("marca", ordemLavagem.getMarca());
        lavagemIntent.putExtra("modelo",ordemLavagem.getModelo() );
        lavagemIntent.putExtra("tipoLavagem", ordemLavagem.getTipo_lavagem());
        lavagemIntent.putExtra("url", String.valueOf(reference));

        startActivity(lavagemIntent);
    }
}
