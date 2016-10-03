package fga.unb.desenho20162.lavajato.Adapter;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

import fga.unb.desenho20162.lavajato.model.OrdemLavagem;

public class LavagemRecyclerAdapter extends FirebaseRecyclerAdapter <OrdemLavagem, LavagemViewHolder> {

    public LavagemRecyclerAdapter(Class<OrdemLavagem> modelClass, int modelLayout,
                                  Class<LavagemViewHolder> viewHolderClass, Query ref) {

        super(modelClass, modelLayout, viewHolderClass, ref);
    }

    @Override
    protected void populateViewHolder ( LavagemViewHolder viewHolder, OrdemLavagem model, int position ) {

        viewHolder.nome.setText(model.getNome());
        viewHolder.telefone.setText(model.getTelefone());
        viewHolder.tipo.setImageResource(model.getTipo());
        viewHolder.placa.setText(model.getPlaca());
        viewHolder.cor.setText(model.getCor());
        viewHolder.marca.setText(model.getMarca());
        viewHolder.modelo.setText(model.getModelo());
        viewHolder.tipoLavagem.setText(model.getTipo_lavagem());
    }
}
