package fga.unb.desenho20162.lavajato.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.google.firebase.database.DatabaseReference;

import fga.unb.desenho20162.lavajato.Adapter.FuncionarioRecyclerAdapter;
import fga.unb.desenho20162.lavajato.Adapter.FuncionarioViewHolder;
import fga.unb.desenho20162.lavajato.DAO.FactoryConnection;
import fga.unb.desenho20162.lavajato.R;
import fga.unb.desenho20162.lavajato.Model.Funcionario;

public class ListaFuncionarioActivity extends AppCompatActivity {

    private FuncionarioRecyclerAdapter adapter;
    final private FactoryConnection factoryConnection = new FactoryConnection();

    private final DatabaseReference firebaseRef = factoryConnection.getConnection().child("Funcionario");

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_funcionario);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleViewFuncionario);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new FuncionarioRecyclerAdapter(Funcionario.class, R.layout.item_funcionario, FuncionarioViewHolder.class, firebaseRef);

        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onDestroy () {

        super.onDestroy();
        adapter.cleanup();
    }

    public void cadastrarFuncionario( View view) {

        Intent cadastrarFuncionario = new Intent(this, CadastroFuncionarioActivity.class);
        startActivity(cadastrarFuncionario);
    }
}
