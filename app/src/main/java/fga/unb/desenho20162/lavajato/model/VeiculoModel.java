package fga.unb.desenho20162.lavajato.model;

public class VeiculoModel {

    private String placa;
    private String cor;
    private String marca;
    private String modelo;
    private String tamanho;

    public VeiculoModel() {}

    public VeiculoModel(String tamanho, String placa, String cor, String marca, String modelo) {

        setTamanho(tamanho);
        setPlaca(placa);
        setCor(cor);
        setMarca(marca);
        setModelo(modelo);
    }

    public void setTamanho(String tamanho) {

        this.tamanho = tamanho;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    private void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getTamanho() {

        return tamanho;
    }

    public String getPlaca() {

        return placa;
    }

    public String getCor() {

        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {

        return modelo;
    }


}
