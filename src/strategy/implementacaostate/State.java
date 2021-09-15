package strategy.implementacaostate;

import strategy.Orcamento;

import java.math.BigDecimal;

public abstract class State {


    public BigDecimal aplicarDesconto(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        //nada a fazer
    }

    public void reprovar(Orcamento orcamento) {
        //nada a fazer
    }

    public void analisar(Orcamento orcamento) {
        //nada a fazer
    }

    public void finalizar(Orcamento orcamento) {
        //nada a fazer
    }
}
