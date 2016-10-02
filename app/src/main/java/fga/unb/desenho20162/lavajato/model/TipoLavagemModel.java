package fga.unb.desenho20162.lavajato.model;

public class TipoLavagemModel {

    private float valor;
    private String tipo_lavagem;

    public TipoLavagemModel() {

    }

    public TipoLavagemModel(String tipo_lavagem, float valor) {

        this.tipo_lavagem = tipo_lavagem;
        this.valor = valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setTipo_lavagem(String descricao) {
        this.tipo_lavagem = descricao;
    }

    public float getValor() {
        return valor;
    }

    public String getTipo_lavagem() {
        return tipo_lavagem;
    }
}
