package fga.unb.desenho20162.lavajato.model;

public class Veiculo {

    private String tipo;
    private String placa;
    private String cor;
    private String marca;
    private String modelo;

    public Veiculo () {}

    public Veiculo ( String tipo, String placa, String cor, String marca, String modelo) {

        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {

        this.tipo = tipo;
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


    public String getTipo() {

        return tipo;
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
