package fga.unb.desenho20162.lavajato.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import fga.unb.desenho20162.lavajato.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void listarLavagens(View view) {

        Intent listarLavagens = new Intent(this, ListaLavagensActivity.class);
        startActivity(listarLavagens);
    }
}
