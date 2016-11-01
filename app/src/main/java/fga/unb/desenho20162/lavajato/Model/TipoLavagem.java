package fga.unb.desenho20162.lavajato.Model;

public class TipoLavagem {

    private double valor;
    private String descricao;

    public TipoLavagem () {

    }

    public TipoLavagem ( String descricao, double valor) {

        this.descricao = descricao;
        this.valor = valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setTipo_lavagem(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo_lavagem() {
        return descricao;
    }
}
