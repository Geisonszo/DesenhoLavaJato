package fga.unb.desenho20162.lavajato.Model;

public class Ponto {

    private String data;
    private String ponto;

    public Ponto() {
    }

    public Ponto(String data, String ponto) {
        this.setData(data);
        this.setPonto(ponto);
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPonto(String ponto) {
        this.ponto = ponto;
    }

    public String getData() {
        return data;
    }

    public String getPonto() {
        return ponto;
    }
}
