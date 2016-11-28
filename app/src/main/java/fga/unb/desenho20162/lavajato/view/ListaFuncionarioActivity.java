package fga.unb.desenho20162.lavajato.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;

import fga.unb.desenho20162.lavajato.Adapter.FuncionarioRecyclerAdapter;
import fga.unb.desenho20162.lavajato.Adapter.IntemClickListenerFuncionario;
import fga.unb.desenho20162.lavajato.DAO.FirebaseConnection;
import fga.unb.desenho20162.lavajato.R;
import fga.unb.desenho20162.lavajato.Model.Funcionario;

public class ListaFuncionarioActivity extends Activity implements IntemClickListenerFuncionario {

    final private FirebaseConnection firebaseConnection = new FirebaseConnection();
    private final DatabaseReference firebaseRef = firebaseConnection.getConnection().child("Funcionario");
    private FuncionarioRecyclerAdapter adapter;

    @Override
    protected void onCreate (Bundle savedInstanceState ) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_funcionario);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleViewFuncionario);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new FuncionarioRecyclerAdapter(Funcionario.class, R.layout.item_funcionario,
            FuncionarioRecyclerAdapter.FuncionarioViewHolder.class, firebaseRef);

        adapter.setClickListener(this); // Bind the listener

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

    @Override
    public void onClick(View view, int position, DatabaseReference reference, Funcionario funcionario) {

        Toast.makeText(getApplicationContext(), "You clicked on: " + position, Toast.LENGTH_LONG).show();

        Intent funcionarioIntent = new Intent(this, Lavagem.class);

        funcionarioIntent.putExtra("nome", funcionario.getNome());
        funcionarioIntent.putExtra("telefone", funcionario.getTelefone());
        funcionarioIntent.putExtra("url", String.valueOf(reference));

        startActivity(funcionarioIntent);

    }
}
