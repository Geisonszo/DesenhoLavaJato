package fga.unb.desenho20162.lavajato.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import fga.unb.desenho20162.lavajato.Controller.CadastrarLavagemController;
import fga.unb.desenho20162.lavajato.R;

public class CadastroLavagemActivity extends AppCompatActivity {

    private CadastrarLavagemController cadastro = new CadastrarLavagemController();

    private EditText nome;
    private EditText telefone;
    private Spinner tamanho;
    private EditText placa;
    private EditText cor;
    private EditText marca;
    private EditText modelo;
    private Spinner tipoLavagem;
    private ArrayAdapter<String> adapterTamanho;
    private ArrayAdapter<String> adapterTipoLavagem;

    Button btnCadastrar;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_lavagem);

        nome = (EditText) findViewById(R.id.nomeCliente);
        telefone = (EditText) findViewById(R.id.telefoneCliente);
        tamanho = (Spinner) findViewById(R.id.tamanhoVeiculo);
        placa = (EditText) findViewById(R.id.placaVeiculo);
        cor = (EditText) findViewById(R.id.corVeiculo);
        marca = (EditText) findViewById(R.id.marcaVeiculo);
        modelo = (EditText) findViewById(R.id.modeloVeiculo);
        tipoLavagem = (Spinner) findViewById(R.id.tipoLavagem);

        adapterTamanho = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapterTamanho.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        adapterTipoLavagem = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapterTipoLavagem.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        tamanho.setAdapter(adapterTamanho);
        tipoLavagem.setAdapter(adapterTipoLavagem);

        adapterTamanho.add("Pequeno");
        adapterTamanho.add("SUV");
        adapterTamanho.add("Caminhonete");

        adapterTipoLavagem.add("Simples");
        adapterTipoLavagem.add("Americana");
        adapterTipoLavagem.add("Motor");

        btnCadastrar = (Button) this.findViewById(R.id.buttonCandastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                cadastro.cadastrar(nome.getEditableText().toString(),
                        telefone.getEditableText().toString(),
                        tamanho.getSelectedItem().toString(),
                        placa.getEditableText().toString(),
                        cor.getEditableText().toString(),
                        marca.getEditableText().toString(),
                        modelo.getEditableText().toString());

                Intent listarLavagem = new Intent();
                listarLavagem.setClass(CadastroLavagemActivity.this, ListaLavagensActivity.class);
                startActivity(listarLavagem);
                finish();

                Context context = getApplicationContext();
                CharSequence text = "A lavagem foi adicionada!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        btnCancelar = (Button) this.findViewById(R.id.buttonCancelar);

        btnCancelar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent listarLavagem = new Intent();
                listarLavagem.setClass(CadastroLavagemActivity.this, ListaLavagensActivity.class);
                startActivity(listarLavagem);
                finish();
            }
        });
    }
}
