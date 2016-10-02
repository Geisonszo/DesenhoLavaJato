package fga.unb.desenho20162.lavajato.model;

import fga.unb.desenho20162.lavajato.R;

public class LavagemModel {

    private String nome;
    private String telefone;
    private String tipo;
    private String placa;
    private String cor;
    private String marca;
    private String modelo;
    private String tipo_lavagem;

    public LavagemModel() {

    }

    public LavagemModel(String nome, String telefone, String tipo, String placa, String cor,
                        String marca, String modelo, String tipo_lavagem) {

        this.nome = nome;
        this.telefone = telefone;
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo_lavagem = tipo_lavagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getTipo() {

        switch (tipo) {

            case "PEQUENO":

                return R.drawable.pequeno;
            case "SUV":

                return R.drawable.suv;
            case "CAMINHONETE":

                return R.drawable.caminhonete;
            case "MOTO" :

                return R.drawable.moto;
        }
        return 0;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo_lavagem () {
        return tipo_lavagem;
    }

    public void setTipo_lavagem ( String tipoLavagem ) {
        this.tipo_lavagem = tipoLavagem;
    }
}