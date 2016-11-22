package fga.unb.desenho20162.lavajato.Model;

public class Veiculo {

    private String tamanho;
    private String placa;
    private String cor;
    private String marca;
    private String modelo;

    public Veiculo () {

        // Construtor vazio.
    }

    public Veiculo (String tamanho, String placa, String cor, String marca, String modelo) {

        this.setTipo(tamanho);
        this.setPlaca(placa);
        this.setCor(cor);
        this.setMarca(marca);
        this.setModelo(modelo);
    }

    private void setTipo(String tamanho) {

        this.tamanho = tamanho;
    }

    private void setPlaca(String placa) {

        this.placa = placa;
    }

    private void setCor(String cor) {

        this.cor = cor;
    }

    private void setMarca(String marca) {

        this.marca = marca;
    }

    private void setModelo(String modelo) {

        this.modelo = modelo;
    }


    public String getTipo() {

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
