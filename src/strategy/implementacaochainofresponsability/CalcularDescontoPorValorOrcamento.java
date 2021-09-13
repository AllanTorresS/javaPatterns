package strategy.implementacaochainofresponsability;

import strategy.Orcamento;

import java.math.BigDecimal;

public class CalcularDescontoPorValorOrcamento extends Desconto {

    public CalcularDescontoPorValorOrcamento(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcularComChainOfResposability(Orcamento orcamento) {
        if(orcamento.getValor().compareTo( new BigDecimal("500")) > 0 ){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcularComChainOfResposability(orcamento);
    }
}
