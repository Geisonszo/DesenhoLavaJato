package fga.unb.desenho20162.lavajato.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.*;

import fga.unb.desenho20162.lavajato.Controller.LavagemController;
import fga.unb.desenho20162.lavajato.R;

public class CadastroLavagemActivity extends AppCompatActivity {

    private LavagemController cadastroLavagem = new LavagemController();

    private EditText nome;
    private EditText telefone;
    private Spinner tipo;
    private EditText placa;
    private EditText cor;
    private EditText marca;
    private EditText modelo;
    private Spinner tipoLavagem;

    Button btnCadastrar;
    Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_lavagem);

        nome = (EditText) findViewById(R.id.nomeCliente);
        telefone = (EditText) findViewById(R.id.telefoneCliente);
        tipo = (Spinner) findViewById(R.id.tipoVeiculo);
        placa = (EditText) findViewById(R.id.placaVeiculo);
        cor = (EditText) findViewById(R.id.corVeiculo);
        marca = (EditText) findViewById(R.id.marcaVeiculo);
        modelo = (EditText) findViewById(R.id.modeloVeiculo);
        tipoLavagem = (Spinner) findViewById(R.id.tipoLavagem);

        nome.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        cor.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        marca.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        modelo.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        placa.setFilters(new InputFilter[]{new InputFilter.AllCaps()});


        ArrayAdapter<String> adapterTipo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapterTipo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        ArrayAdapter<String> adapterTipoLavagem = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapterTipoLavagem.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        tipo.setAdapter(adapterTipo);
        tipoLavagem.setAdapter(adapterTipoLavagem);

        adapterTipo.add("PEQUENO");
        adapterTipo.add("SUV");
        adapterTipo.add("CAMINHONETE");
        adapterTipo.add("MOTO");

        adapterTipoLavagem.add("PINTURA");
        adapterTipoLavagem.add("AMERICANA");
        adapterTipoLavagem.add("MOTOR");

        btnCadastrar = (Button) this.findViewById(R.id.buttonCandastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                cadastroLavagem.setLavagem(nome.getEditableText().toString(),
                        telefone.getEditableText().toString(), tipo.getSelectedItem().toString(),
                        placa.getEditableText().toString(), cor.getEditableText().toString(),
                        marca.getEditableText().toString(), modelo.getEditableText().toString(),
                        tipoLavagem.getSelectedItem().toString());

                /*cadastroLavagem.setCliente(nome.getEditableText().toString(),
                        telefone.getEditableText().toString());

                cadastroLavagem.setVeiculo(tipo.getSelectedItem().toString(),
                        placa.getEditableText().toString(), cor.getEditableText().toString(),
                        marca.getEditableText().toString(), modelo.getEditableText().toString());

                cadastroLavagem.setTipoLavagem(tipoLavagem.getSelectedItem().toString(),
                    tipo.getSelectedItem().toString());*/

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
