package fga.unb.desenho20162.lavajato.model;

public class FuncionarioModel {

    private String nome;
    private String cpf;
    private char sexo;
    private float diaria;
    private String telefone;
    private String endereco;

    public FuncionarioModel () {

    }

    public FuncionarioModel ( String nome, String cpf, char sexo, float diaria, String telefone, String endereco ) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.diaria = diaria;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void setNome( String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setDiaria(float diaria) {
        this.diaria = diaria;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public float getDiaria() {
        return diaria;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
}
