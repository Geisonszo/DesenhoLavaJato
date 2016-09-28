package fga.unb.desenho20162.lavajato.model;

public class ClienteModel {

    private String nome;
    private String telefone;

    public ClienteModel() {}

    public ClienteModel(String nome, String telefone) {

        setNome(nome);
        setTelefone(telefone);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
