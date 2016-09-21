package fga.unb.desenho20162.lavajato.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;

import fga.unb.desenho20162.lavajato.R;

public class CadastrarLavagem extends AppCompatActivity {

    EditText nome;
    EditText telefone;
    Spinner tamanho;
    EditText cor;
    EditText marca;
    EditText modelo;
    Spinner tipoLavagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_lavagem);

        nome = (EditText) findViewById(R.id.nomeCliente);
        telefone = (EditText) findViewById(R.id.telefoneCliente);
        tamanho = (Spinner) findViewById(R.id.tamanhoVeiculo);
        cor = (EditText) findViewById(R.id.corVeiculo);
        marca = (EditText) findViewById(R.id.marcaVeiculo);
        modelo = (EditText) findViewById(R.id.modeloVeiculo);
        tipoLavagem = (Spinner) findViewById(R.id.tipoLavagem);


    }
}
