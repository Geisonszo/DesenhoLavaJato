package fga.unb.desenho20162.lavajato.model;

import fga.unb.desenho20162.lavajato.R;

public class Lavagem {

    private String descricao;
    private String data;
    private String horaEntrada;
    private String horaSaida;
    private String hora;
    private double valor;

    public Lavagem () {
    }

    public Lavagem ( String descricao, String data, String horaEntrada, String horaSaida, String hora, float valor ) {
        this.descricao = descricao;
        this.data = data;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.hora = hora;
        this.valor = valor;
    }

    public String getDescricao () {
        return descricao;
    }

    public void setDescricao ( String descricao ) {
        this.descricao = descricao;
    }

    public String getData () {
        return data;
    }

    public void setData ( String data ) {
        this.data = data;
    }

    public String getHoraEntrada () {
        return horaEntrada;
    }

    public void setHoraEntrada ( String horaEntrada ) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSaida () {
        return horaSaida;
    }

    public void setHoraSaida ( String horaSaida ) {
        this.horaSaida = horaSaida;
    }

    public String getHora () {
        return hora;
    }

    public void setHora ( String hora ) {
        this.hora = hora;
    }

    public double getValor () {
        return valor;
    }

    public void setValor ( float valor ) {
        this.valor = valor;
    }

    public double calculaValor ( String tipoVeiculo ) {
        return 0;
    }

}