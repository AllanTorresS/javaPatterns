package strategy.implementacaochainofresponsability;

import strategy.Orcamento;
import strategy.TipoImposto;
import strategy.implementacaostrategy.CalcularImpostoStrategy;
import strategy.implementacaostrategy.Icms;
import strategy.implementacaostrategy.Iss;

import java.math.BigDecimal;

public class chainOfResponsabilityMain {

    public static void main(String[] args) {
        //calculando sem o padrão chain of responsability
        CalcularDescontoChainOfResponsability calcularDesconto = new CalcularDescontoChainOfResponsability();
        BigDecimal desconto = calcularDesconto.calcularDescontoSemChainResponsability(new Orcamento(new BigDecimal(600), 1L));
        System.out.println(desconto);

        //calcula imposto com chain of responsability
        CalcularDescontoChainOfResponsability calcularDescontoComPattern = new CalcularDescontoChainOfResponsability();
        BigDecimal descontoPattern = calcularDescontoComPattern.calcularComChaimOfResponsability(new Orcamento(new BigDecimal(400), 1L));
        System.out.println(descontoPattern);
    }
}
