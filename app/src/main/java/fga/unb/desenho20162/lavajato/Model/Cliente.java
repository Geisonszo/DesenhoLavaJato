package fga.unb.desenho20162.lavajato.Model;

public class Cliente {

    private String nome;
    private String telefone;

    public Cliente () {}

    public Cliente ( String nome, String telefone) {

        this.setNome(nome);
        this.setTelefone(telefone);
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
