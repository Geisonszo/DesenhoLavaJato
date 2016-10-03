package fga.unb.desenho20162.lavajato.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import fga.unb.desenho20162.lavajato.R;

public class CadastroFuncionarioActivity extends AppCompatActivity {

    private EditText nome;
    private EditText telefone;
    private Spinner sexo;
    private EditText cpf;
    private EditText endereco;
    private ArrayAdapter<String> adapterSexo;

    Button btnCadastrar;
    Button btnCancelar;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_funcionario);

        nome = (EditText) findViewById(R.id.nomeFuncionario);
        telefone = (EditText) findViewById(R.id.telefoneFuncionario);
        sexo = (Spinner) findViewById(R.id.tipoVeiculo);
        cpf = (EditText) findViewById(R.id.placaVeiculo);
        endereco = (EditText) findViewById(R.id.corVeiculo);

        adapterSexo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapterSexo.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        sexo.setAdapter(adapterSexo);

        adapterSexo.add("MASCULINO");
        adapterSexo.add("FEMININO");
    }
}
