package fga.unb.desenho20162.lavajato.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import fga.unb.desenho20162.lavajato.Controller.FuncionarioController;
import fga.unb.desenho20162.lavajato.R;

public class CadastroFuncionarioActivity extends AppCompatActivity {

    private FuncionarioController cadastroFuncionario = new FuncionarioController();

    private EditText nomeFuncionario;
    private EditText telefoneFuncionario;
    private RadioButton sexoFuncionario;
    private Spinner tipoTelefone;
    private EditText cpfFuncionario;
    private EditText enderecoFuncionario;
    private EditText valorDiaria;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_funcionario);

        nomeFuncionario = (EditText) findViewById(R.id.id_nome_func);
        telefoneFuncionario = (EditText) findViewById(R.id.id_telefone_func);
        RadioGroup radioSexoGroup = (RadioGroup) findViewById(R.id.radio_group_sexo);
        tipoTelefone = (Spinner) findViewById(R.id.id_tipo_tel_func);
        cpfFuncionario = (EditText) findViewById(R.id.id_cpf_func);
        enderecoFuncionario = (EditText) findViewById(R.id.id_endereco_func);
        valorDiaria = (EditText) findViewById(R.id.id_diaria_func);

        ArrayAdapter<String> adapterTipoTelefone = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        adapterTipoTelefone.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        tipoTelefone.setAdapter(adapterTipoTelefone);

        adapterTipoTelefone.add("Celular");
        adapterTipoTelefone.add("Fixo");

        radioSexoGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch(checkedId) {

                    case R.id.id_radio_feminino:

                        // do operations specific to this selection
                        sexoFuncionario =  (RadioButton) findViewById(checkedId);
                        break;

                    case R.id.id_radio_maculino:

                        sexoFuncionario =  (RadioButton) findViewById(checkedId);
                        // do operations specific to this selection
                        break;
                }
            }
        });

        Button btnCadastrarFuncionario = (Button) this.findViewById(R.id.bt_cadastrar_func);

        btnCadastrarFuncionario.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                cadastroFuncionario.setFuncionario(
                        nomeFuncionario.getEditableText().toString(),
                        cpfFuncionario.getEditableText().toString(),
                        sexoFuncionario.getText().toString(),
                        Double.parseDouble(valorDiaria.getText().toString()),
                        telefoneFuncionario.getEditableText().toString(),
                        tipoTelefone.getSelectedItem().toString(),
                        enderecoFuncionario.getEditableText().toString());

                Intent listarFuncionario = new Intent();
                listarFuncionario.setClass(CadastroFuncionarioActivity.this, ListaFuncionarioActivity.class);
                startActivity(listarFuncionario);
                finish();

                Context context = getApplicationContext();
                CharSequence text = "O funcionário foi adicionado!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button btnCancelarFuncionario = (Button) this.findViewById(R.id.bt_cancelar_func);

        btnCancelarFuncionario.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent listarFuncionario = new Intent();
                listarFuncionario.setClass(CadastroFuncionarioActivity.this, ListaFuncionarioActivity.class);
                startActivity(listarFuncionario);
                finish();
            }
        });
    }
}
