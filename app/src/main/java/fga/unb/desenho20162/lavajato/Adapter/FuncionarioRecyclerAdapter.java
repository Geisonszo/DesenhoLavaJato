package fga.unb.desenho20162.lavajato.Adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

import fga.unb.desenho20162.lavajato.Model.Funcionario;
import fga.unb.desenho20162.lavajato.R;

public class FuncionarioRecyclerAdapter extends FirebaseRecyclerAdapter<Funcionario, FuncionarioRecyclerAdapter.FuncionarioViewHolder> {

    private static IntemClickListenerFuncionario clickListener;

    private static final String TAG = "FuncionarioRecyclerAdap";
    
    public FuncionarioRecyclerAdapter ( Class<Funcionario> modelClass, int modelLayout,
                                        Class<FuncionarioViewHolder> viewHolderClass, Query ref ) {

        super(modelClass, modelLayout, viewHolderClass, (DatabaseReference) ref);
    }

    @Override
    protected void populateViewHolder (final FuncionarioViewHolder viewHolder, Funcionario model, final int position ) {

        viewHolder.nome.setText(model.getNome());
        viewHolder.telefone.setText(model.getTelefone());
        //viewHolder.cpf.setText(model.getCpf());
        //viewHolder.tipoTelefone.setText(model.getTipoTelefone());
        //viewHolder.endereco.setText(model.getEndereco());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Log.d(TAG, "onClick:[" + getRef(position) + " ]");

                clickListener.onClick(v, position, getRef(position), getItem(position));
            }
        });
        
    }

    public void setClickListener(IntemClickListenerFuncionario itemClickListener) {

        clickListener = itemClickListener;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    static public class FuncionarioViewHolder extends RecyclerView.ViewHolder {

        View mView;

        TextView nome;
        TextView telefone;
        /*TextView cpf;
        TextView sexo;
        TextView diaria;*/
        //TextView tipoTelefone;
        //TextView endereco;

        public FuncionarioViewHolder ( View itemView ) {

            super(itemView);

            this.mView = itemView;

            nome = (TextView) itemView.findViewById(R.id.item_nome_funcionario);
            telefone = (TextView) itemView.findViewById(R.id.item_telefone_funcionario);
            //cpf = (TextView) itemView.findViewById(R.id.)
        }
    }
}
