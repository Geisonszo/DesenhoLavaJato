package fga.unb.desenho20162.lavajato.model;

public class LavagemModel {

    public LavagemModel() {

    }


    public LavagemModel(String nome, String telefone, String tamanho, String placa, String cor, String marca, String modelo) {

        this.nome = nome;
        this.telefone = telefone;
        this.tamanho = tamanho;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }


    private String nome;
    private String telefone;
    private String tamanho;
    private String placa;
    private String cor;
    private String marca;
    private String modelo;

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

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
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
}