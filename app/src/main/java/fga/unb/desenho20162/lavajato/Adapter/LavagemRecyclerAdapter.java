package fga.unb.desenho20162.lavajato.Adapter;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

import fga.unb.desenho20162.lavajato.model.LavagemModel;

public class LavagemRecyclerAdapter extends FirebaseRecyclerAdapter <LavagemModel, LavagemViewHolder> {

    public LavagemRecyclerAdapter(Class<LavagemModel> modelClass, int modelLayout, Class<LavagemViewHolder> viewHolderClass, Query ref) {

        super(modelClass, modelLayout, viewHolderClass, ref);
    }

    @Override
    protected void populateViewHolder ( LavagemViewHolder viewHolder, LavagemModel model, int position ) {

        viewHolder.nome.setText(model.getNome());
        viewHolder.telefone.setText(model.getTelefone());
        viewHolder.tamanho.setImageResource(model.getTamanho());
        viewHolder.placa.setText(model.getPlaca());
        viewHolder.cor.setText(model.getCor());
        viewHolder.marca.setText(model.getMarca());
        viewHolder.modelo.setText(model.getModelo());
        viewHolder.tipoLavagem.setText(model.getTipoLavagem());
    }
}
