package strategy.implementacaochainofresponsability;

import strategy.Orcamento;
import strategy.TipoImposto;
import strategy.implementacaostrategy.Imposto;

import java.math.BigDecimal;

public class CalcularDescontoChainOfResponsability {


    public BigDecimal calcularDescontoSemChainResponsability(Orcamento orcamento) {

        /**
         * temos um problema parecido com o do strategy, mas aki existem regras de negocio mais complexas
         * no strategy eu sei quem executar exatamente já aki não.
         */
        if (orcamento.getQuantidade() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;

    }

    /**
     * Para resolver esse problema de várias logicas complexas, é usada o chaim of responsability
     * a ideia é encadear sequencialmente a chamada das logicas e sempre é necesario dizer quando para
     * tipo um case default aki nesse caso a {@link SemDesconto} é que representa o fim do encademamento
     * caso nenhuma outra condição seja sastisfeita
     *
     * @param orcamento orcamento a ser calculado
     * @return o vaor do desconto
     */
    public BigDecimal calcularComChaimOfResponsability(Orcamento orcamento) {

        return new CalcularDescontoPorQuantidade(
                new CalcularDescontoPorValorOrcamento(new SemDesconto())).
                calcularPatternTemplateMethod(orcamento);

    }
}
