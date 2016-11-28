package fga.unb.desenho20162.lavajato.Adapter;

import android.view.View;

import com.google.firebase.database.DatabaseReference;

import fga.unb.desenho20162.lavajato.Model.OrdemLavagem;

public interface ItemClickListenerLavagem {

  void onClick(View view, int position, DatabaseReference reference, OrdemLavagem ordemLavagem);
}
