package strategy.implementacaostrategy;

import strategy.Orcamento;

import java.math.BigDecimal;

public class Iss implements Imposto {

    @Override
    public BigDecimal calcularImposto(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

}
