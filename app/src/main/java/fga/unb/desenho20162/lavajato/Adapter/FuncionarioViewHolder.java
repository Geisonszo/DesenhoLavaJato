package fga.unb.desenho20162.lavajato.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import fga.unb.desenho20162.lavajato.R;

public class FuncionarioViewHolder extends RecyclerView.ViewHolder {

    TextView nome;
    /*TextView cpf;
    TextView sexo;
    TextView diaria;*/
    TextView telefone;
    //TextView tipoTelefone;
    //TextView endereco;

    public FuncionarioViewHolder ( View itemView ) {
        super(itemView);

        nome = (TextView) itemView.findViewById(R.id.item_nome_funcionario);
        telefone = (TextView) itemView.findViewById(R.id.item_telefone_funcionario);
        //cpf = (TextView) itemView.findViewById(R.id.)
    }
}
