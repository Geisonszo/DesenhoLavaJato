package fga.unb.desenho20162.lavajato.model;

public class TipoLavagem {

    private double valor;
    private String tipo_lavagem;

    public TipoLavagem () {

    }

    public TipoLavagem ( String tipo_lavagem, double valor) {

        this.tipo_lavagem = tipo_lavagem;
        this.valor = valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setTipo_lavagem(String descricao) {
        this.tipo_lavagem = descricao;
    }

    public double getValor() {
        return valor;
    }

    public String getTipo_lavagem() {
        return tipo_lavagem;
    }
}
