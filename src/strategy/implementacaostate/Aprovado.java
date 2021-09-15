package strategy.implementacaostate;

import strategy.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends State {


    public BigDecimal aplicarDesconto(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstado(new Finalizado());
    }
}
