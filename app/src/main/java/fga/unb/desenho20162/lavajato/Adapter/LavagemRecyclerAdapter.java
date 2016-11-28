package fga.unb.desenho20162.lavajato.Adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

import fga.unb.desenho20162.lavajato.Model.OrdemLavagem;
import fga.unb.desenho20162.lavajato.R;


public class LavagemRecyclerAdapter extends FirebaseRecyclerAdapter <OrdemLavagem, LavagemRecyclerAdapter.LavagemViewHolder> {

    private static ItemClickListenerLavagem clickListener;

    private static final String TAG = "LavagemRecyclerAdapter";

    public LavagemRecyclerAdapter(Class<OrdemLavagem> modelClass, int modelLayout,
                                  Class<LavagemViewHolder> viewHolderClass, Query ref) {

        super(modelClass, modelLayout, viewHolderClass, ref);
    }

    @Override
    protected void populateViewHolder (final LavagemViewHolder viewHolder, OrdemLavagem model, final int position ) {

        viewHolder.nome.setText(model.getNome());
        viewHolder.telefone.setText(model.getTelefone());
        viewHolder.tipo.setImageResource(model.getTipo());
        viewHolder.placa.setText(model.getPlaca());
        viewHolder.cor.setText(model.getCor());
        viewHolder.marca.setText(model.getMarca());
        viewHolder.modelo.setText(model.getModelo());
        viewHolder.tipoLavagem.setText(model.getTipo_lavagem());

        viewHolder.mView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.d(TAG, "onClick:[" + getRef(position) + " ]");

                clickListener.onClick(v, position, getRef(position), getItem(position));
            }
        });
    }

    public void setClickListener(ItemClickListenerLavagem itemClickListener) {

        clickListener = itemClickListener;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    static public class LavagemViewHolder extends RecyclerView.ViewHolder {

        View mView;

        TextView nome;
        TextView telefone;
        ImageView tipo;
        TextView placa;
        TextView cor;
        TextView marca;
        TextView modelo;
        TextView tipoLavagem;

        public LavagemViewHolder (View itemView) {

            super(itemView);

            this.mView = itemView;

            nome = (TextView) itemView.findViewById(R.id.idNome);
            telefone = (TextView) itemView.findViewById(R.id.idTelefone);
            tipo = (ImageView) itemView.findViewById(R.id.imageTipo);
            placa = (TextView) itemView.findViewById(R.id.idPlaca);
            cor = (TextView) itemView.findViewById(R.id.idCor);
            marca = (TextView) itemView.findViewById(R.id.idMarca);
            modelo = (TextView) itemView.findViewById(R.id.idModelo);
            tipoLavagem = (TextView) itemView.findViewById(R.id.idTipoLavagem);
        }
    }
}
