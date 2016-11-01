package fga.unb.desenho20162.lavajato.Model;

public class Funcionario {

    private String nome;
    private String cpf;
    private String sexo;
    private double diaria;
    private String telefone;
    private String tipoTelefone;
    private String endereco;

    public Funcionario () {

    }

    public Funcionario ( String nome, String cpf, String sexo, double diaria, String telefone, String tipoTelefone, String endereco ) {

        this.setNome(nome);
        this.setCpf(cpf);
        this.setSexo(sexo);
        this.setDiaria(diaria);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
    }

    public void setNome( String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTipoTelefone ( String tipoTelefone ) {
        this.tipoTelefone = tipoTelefone;
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

    public String getSexo() {
        return sexo;
    }

    public double getDiaria() {
        return diaria;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTipoTelefone () {
        return tipoTelefone;
    }
}
