package fga.unb.desenho20162.lavajato.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.firebase.database.DatabaseReference;

import fga.unb.desenho20162.lavajato.Adapter.LavagemRecyclerAdapter;
import fga.unb.desenho20162.lavajato.Adapter.LavagemViewHolder;
import fga.unb.desenho20162.lavajato.DAO.DatabaseConnection;
import fga.unb.desenho20162.lavajato.R;
import fga.unb.desenho20162.lavajato.model.OrdemLavagem;

public class ListaLavagensActivity extends AppCompatActivity {

    private LavagemRecyclerAdapter adapter;
    final private DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseReference firebaseRef = databaseConnection.getFirebase().child("Lavagem");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_lavagens);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleViewLavagem);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new LavagemRecyclerAdapter(OrdemLavagem.class, R.layout.item_lavagem, LavagemViewHolder.class, firebaseRef);

        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();

        adapter.cleanup();

    }

    public void cadastrarLavagem( View view) {

        Intent cadastrarLavagem = new Intent(this, CadastroLavagemActivity.class);
        startActivity(cadastrarLavagem);
    }
}
