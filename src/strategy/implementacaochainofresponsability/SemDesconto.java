package strategy.implementacaochainofresponsability;

import strategy.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal calcularComChainOfResposability(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
