package strategy.implementacaochainofresponsability;

import strategy.Orcamento;
import strategy.implementacaostrategy.Imposto;

import java.math.BigDecimal;

public class CalcularDescontoPorQuantidade extends  Desconto{


    public CalcularDescontoPorQuantidade(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal calcularComChainOfResposability(Orcamento orcamento) {
        if(orcamento.getQuantidade() > 5 ){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcularComChainOfResposability(orcamento);

    }
}
