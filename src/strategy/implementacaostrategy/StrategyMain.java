package strategy.implementacaostrategy;

import strategy.Orcamento;
import strategy.TipoImposto;

import java.math.BigDecimal;

public class StrategyMain {

    public static void main(String[] args) {
        //calculando sem o padrão strategy
        CalcularImpostoStrategy calcularImposto = new CalcularImpostoStrategy();
        BigDecimal imposto = calcularImposto.calcularSemStrategy(new Orcamento(new BigDecimal(100), 1L), TipoImposto.ICMS);
        System.out.println(imposto);

        //calcula imposto com strategy
        BigDecimal impostoStrategyIcms = calcularImposto.calcularComStrategy(new Orcamento(new BigDecimal(100), 1L), new Icms());
        BigDecimal impostoStrategyIss = calcularImposto.calcularComStrategy(new Orcamento(new BigDecimal(100), 1L), new Iss());
        System.out.println(impostoStrategyIcms);
        System.out.println(impostoStrategyIss);

    }
}
