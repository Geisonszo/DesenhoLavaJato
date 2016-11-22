package fga.unb.desenho20162.lavajato.Model;


public class TipoLavagem {

    double valor;
    String descricao;


    public TipoLavagem () {

        // Contrutor vazio.
    }

    public TipoLavagem(double valor, String descricao) {

        this.setValor(valor);
        this.setDescricao(descricao);
    }

    public double getValor() {
        return valor;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
