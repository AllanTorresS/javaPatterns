package strategy.implementacaostrategy;

import strategy.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcularImposto(Orcamento orcamento);
}
