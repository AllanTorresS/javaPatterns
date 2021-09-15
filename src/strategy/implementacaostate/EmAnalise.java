package strategy.implementacaostate;

import strategy.Orcamento;

import java.math.BigDecimal;

public class EmAnalise  extends State{


    public BigDecimal aplicarDesconto(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.5"));
    }

    @Override
    public void aprovar(Orcamento orcamento) {
         orcamento.setEstado(new Aprovado());

    }

    @Override
    public void reprovar(Orcamento orcamento) {
        orcamento.setEstado(new Reprovado());

    }

    @Override
    public void analisar(Orcamento orcamento) {

    }

    @Override
    public void finalizar(Orcamento orcamento) {

    }
}
