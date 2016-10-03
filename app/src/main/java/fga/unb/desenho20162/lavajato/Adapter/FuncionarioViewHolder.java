package fga.unb.desenho20162.lavajato.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import fga.unb.desenho20162.lavajato.R;

public class FuncionarioViewHolder extends RecyclerView.ViewHolder {

    TextView nome;
    TextView cpf;
    TextView sexo;
    TextView diaria;
    TextView telefone;
    TextView endereco;

    public FuncionarioViewHolder ( View itemView ) {
        super(itemView);

        nome = (TextView) itemView.findViewById(R.id.idNome);
        telefone = (TextView) itemView.findViewById(R.id.idTelefone);
        cpf = (TextView) itemView.findViewById(R.id.idPlaca);
        sexo = (TextView) itemView.findViewById(R.id.idCor);
        diaria = (TextView) itemView.findViewById(R.id.idMarca);
        telefone = (TextView) itemView.findViewById(R.id.idModelo);
        endereco = (TextView) itemView.findViewById(R.id.idTipoLavagem);
    }
}
