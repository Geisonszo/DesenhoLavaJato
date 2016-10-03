package fga.unb.desenho20162.lavajato.Adapter;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

import fga.unb.desenho20162.lavajato.model.Funcionario;

public class FuncionarioRecyclerAdapter extends FirebaseRecyclerAdapter<Funcionario, FuncionarioViewHolder> {

    public FuncionarioRecyclerAdapter ( Class<Funcionario> modelClass, int modelLayout,
                                        Class<FuncionarioViewHolder> viewHolderClass, Query ref ) {
        super(modelClass, modelLayout, viewHolderClass, (DatabaseReference) ref);
    }

    @Override
    protected void populateViewHolder ( FuncionarioViewHolder viewHolder, Funcionario model, int position ) {

        viewHolder.nome.setText(model.getNome());
        viewHolder.cpf.setText(model.getCpf());
        viewHolder.sexo.setText(model.getSexo());
        viewHolder.diaria.setText((int) model.getDiaria());
        viewHolder.endereco.setText(model.getEndereco());
    }
}
