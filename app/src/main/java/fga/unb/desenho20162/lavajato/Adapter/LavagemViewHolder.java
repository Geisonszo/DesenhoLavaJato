package fga.unb.desenho20162.lavajato.Adapter;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import fga.unb.desenho20162.lavajato.R;

public class LavagemViewHolder extends RecyclerView.ViewHolder{

    TextView nome;
    TextView telefone;
    TextView tamanho;
    TextView placa;
    TextView cor;
    TextView marca;
    TextView modelo;

    public LavagemViewHolder ( View itemView ) {
        super(itemView);

        nome = (TextView) itemView.findViewById(R.id.idNome);
        telefone = (TextView) itemView.findViewById(R.id.idTelefone);
        tamanho = (TextView) itemView.findViewById(R.id.idTamanho);
        placa = (TextView) itemView.findViewById(R.id.idPlaca);
        cor = (TextView) itemView.findViewById(R.id.idCor);
        marca = (TextView) itemView.findViewById(R.id.idMarca);
        modelo = (TextView) itemView.findViewById(R.id.idModelo);
    }
}
