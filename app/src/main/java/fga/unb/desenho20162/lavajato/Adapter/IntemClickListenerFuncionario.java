package fga.unb.desenho20162.lavajato.Adapter;

import android.view.View;

import com.google.firebase.database.DatabaseReference;

import fga.unb.desenho20162.lavajato.Model.Funcionario;

public interface IntemClickListenerFuncionario {

  void onClick(View view, int position, DatabaseReference reference, Funcionario funcionario);
}
