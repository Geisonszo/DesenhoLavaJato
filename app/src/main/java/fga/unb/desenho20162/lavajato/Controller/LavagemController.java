package fga.unb.desenho20162.lavajato.Controller;

import fga.unb.desenho20162.lavajato.ConcretStartegy.LavagemStrategyAmericana;
import fga.unb.desenho20162.lavajato.ConcretStartegy.LavagemStrategyMoto;
import fga.unb.desenho20162.lavajato.ConcretStartegy.LavagemStrategyMotor;
import fga.unb.desenho20162.lavajato.ConcretStartegy.LavagemStrategyPintura;
import fga.unb.desenho20162.lavajato.DAO.LavagemDAO;
import fga.unb.desenho20162.lavajato.Estrategy.LavagemStrategy;
import fga.unb.desenho20162.lavajato.Model.Cliente;
import fga.unb.desenho20162.lavajato.Model.TipoLavagem;
import fga.unb.desenho20162.lavajato.Model.Veiculo;


public class LavagemController {

    private Cliente setCliente(String nome, String telefone) {

        return new Cliente(nome, telefone);
    }

    private TipoLavagem setTipoLavagem(String descricao, String tamanho) {

        double valor;
        valor = valorLavagem(tamanho);

        return new TipoLavagem(valor, descricao);
    }

    private Veiculo setVeiculo(String tamanho, String placa, String cor, String marca, String modelo) {

        return new Veiculo(tamanho, placa, cor, marca, modelo);
    }
    
    public void setLavagem(String nome, String telefone, String tamanho, String placa, String cor, 
                           String marca, String modelo, String descricao) {

        Cliente cliente = setCliente(nome, telefone);
        Veiculo veiculo = setVeiculo(tamanho, placa, cor, marca, modelo);
        TipoLavagem tipoLavagem = setTipoLavagem(descricao, tamanho);

        salvarLavagem(cliente, veiculo, tipoLavagem);
    }

    private void salvarLavagem(Cliente cliente, Veiculo veiculo, TipoLavagem tipoLavagem) {

        LavagemDAO novaLavagem = new LavagemDAO();

        novaLavagem.createLavagem(cliente, veiculo, tipoLavagem);
    }

    private double valorLavagem(String tipoLavagem) {

        LavagemStrategy lavagemStrategy;

        double valor = 0;

        switch (tipoLavagem) {

            case "AMERICANA" :

                lavagemStrategy = new LavagemStrategyAmericana(tipoLavagem);
                valor = lavagemStrategy.calculaValor();
                return valor;

            case "PINTURA" :

                lavagemStrategy = new LavagemStrategyPintura(tipoLavagem);
                valor = lavagemStrategy.calculaValor();
                return valor;

            case "MOTO" :

                lavagemStrategy = new LavagemStrategyMoto(tipoLavagem);
                valor = lavagemStrategy.calculaValor();
                return valor;

            case "MOTOR" :

                lavagemStrategy = new LavagemStrategyMotor(tipoLavagem);
                valor = lavagemStrategy.calculaValor();
                return valor;
        }

        return valor;
    }
}
