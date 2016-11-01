package fga.unb.desenho20162.lavajato.Controller;

import fga.unb.desenho20162.lavajato.ConcretStartegy.LavagemAmericana;
import fga.unb.desenho20162.lavajato.ConcretStartegy.LavagemMoto;
import fga.unb.desenho20162.lavajato.ConcretStartegy.LavagemMotor;
import fga.unb.desenho20162.lavajato.ConcretStartegy.LavagemPintura;
import fga.unb.desenho20162.lavajato.DAO.LavagemDAO;
import fga.unb.desenho20162.lavajato.Estrategy.Lavagem;
import fga.unb.desenho20162.lavajato.Model.Cliente;
import fga.unb.desenho20162.lavajato.Model.TipoLavagem;
import fga.unb.desenho20162.lavajato.Model.Veiculo;


public class LavagemController {

    private Cliente cliente;
    private Veiculo veiculo;
    private TipoLavagem tipoLavagem;

    /*public void setCliente(String nome, String telefone) {

        cliente = new Cliente(nome, telefone);
    }

    public void setVeiculo( String tipo, String placa, String cor, String marca, String modelo) {

        veiculo = new Veiculo(tipo, placa, cor, marca, modelo);
    }

    public void setTipoLavagem (String descricao) {

        double valor;
        valor = valorLavagem(descricao);

        tipoLavagem = new TipoLavagem(descricao, valor);
    }*/

    public void setLavagem(String nome, String telefone , String tipo, String placa, String cor,
                    String marca, String modelo, String descricao) {

        cliente = new Cliente(nome, telefone);
        veiculo = new Veiculo(tipo, placa, cor, marca, modelo);
        tipoLavagem = new TipoLavagem(descricao, valorLavagem(descricao));

        salvarLavagem(cliente, veiculo, tipoLavagem);
    }

    private void salvarLavagem( Cliente cliente, Veiculo veiculo,
                                TipoLavagem tipoLavagem) {

        LavagemDAO novaLavagem = new LavagemDAO();

        novaLavagem.createLavagem(cliente, veiculo, tipoLavagem);
    }

    private double valorLavagem (String tipoLavagem) {

        Lavagem lavagem;

        double valor = 0.0;

        switch (tipoLavagem) {

            case "AMERICANA" :

                lavagem = new LavagemAmericana(veiculo.getTipo());
                valor = lavagem.valorLavegem();
                return valor;

            case "PINTURA" :

                lavagem = new LavagemPintura(veiculo.getTipo());
                valor = lavagem.valorLavegem();
                return valor;

            case "MOTO" :

                lavagem = new LavagemMoto(veiculo.getTipo());
                valor = lavagem.valorLavegem();
                return valor;

            case "MOTOR" :

                lavagem = new LavagemMotor(veiculo.getTipo());
                valor = lavagem.valorLavegem();
                return valor;
        }

        return valor;
    }
}
