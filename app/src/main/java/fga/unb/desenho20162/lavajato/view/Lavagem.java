package fga.unb.desenho20162.lavajato.view;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import fga.unb.desenho20162.lavajato.R;

public class Lavagem extends Activity {

  private TextView nome_cliente;
  private TextView telefone_cliente;
  private ImageView tipo_veiculo;
  private TextView placa_veiculo;
  private TextView cor_veiculo;
  private TextView marca_veiculo;
  private TextView modelo_veiculo;
  private TextView tipoLavagem_lavagem;

  private static final String TAG = "Lavagem";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lavagem);

    String url = getIntent().getStringExtra("ref");
    String nome = getIntent().getStringExtra("nome");
    String telefone = getIntent().getStringExtra("telefone");
    int tipo = getIntent().getIntExtra("tipo", 0);
    String placa = getIntent().getStringExtra("placa");
    String cor = getIntent().getStringExtra("cor");
    String marca = getIntent().getStringExtra("marca");
    String modelo = getIntent().getStringExtra("modelo");
    String tipoLavagem = getIntent().getStringExtra("tipoLavagem");

    /*Log.d(TAG, "nome: " + nome);
    Log.d(TAG, "telefone: " + telefone);
    Log.d(TAG, "tipo: " + tipo);
    Log.d(TAG, "placa: " + placa);
    Log.d(TAG, "cor: " + cor);
    Log.d(TAG, "marca: " + marca);
    Log.d(TAG, "modelo: " + modelo);
    Log.d(TAG, "tipoLavagem: " + tipoLavagem);
    Log.d(TAG, "Reference: " + url);*/


    nome_cliente = (TextView) findViewById(R.id.lavagem_nome_cliente);
    telefone_cliente = (TextView) findViewById(R.id.lavagem_telefone_cliente);
    tipo_veiculo = (ImageView) findViewById(R.id.lavagem_tamanho);
    placa_veiculo = (TextView) findViewById(R.id.lavagem_veiculo_placa);
    cor_veiculo = (TextView) findViewById(R.id.lavagem_veiculo_cor);
    marca_veiculo = (TextView) findViewById(R.id.lavagem_veiculo_marca);
    modelo_veiculo = (TextView) findViewById(R.id.lavagem_veiculo_modelo);
    tipoLavagem_lavagem = (TextView) findViewById(R.id.lavagem_tipo_lavagem);
  }

}
