package fga.unb.desenho20162.lavajato.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import fga.unb.desenho20162.lavajato.R;

public class ListaLavagensActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_lavagens);

    }


    public void cadastrarLavagem(View view) {

        Intent cadastrarLavagem = new Intent(this, CadastroLavagemActivity.class);
        startActivity(cadastrarLavagem);
    }
}
