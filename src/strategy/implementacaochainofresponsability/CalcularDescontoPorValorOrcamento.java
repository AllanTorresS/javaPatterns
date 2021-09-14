package strategy.implementacaochainofresponsability;

import strategy.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontoPorValorOrcamento extends Desconto {

    public CalcularDescontoPorValorOrcamento(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcularComChainOfResposability(Orcamento orcamento) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo( new BigDecimal("500")) > 0;
    }
}
