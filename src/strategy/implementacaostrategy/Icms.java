package strategy.implementacaostrategy;

import strategy.Orcamento;

import java.math.BigDecimal;

public class Icms implements Imposto {

    @Override
    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
