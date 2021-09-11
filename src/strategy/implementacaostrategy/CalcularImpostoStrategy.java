package strategy.implementacaostrategy;

import strategy.Orcamento;
import strategy.TipoImposto;
import strategy.implementacaostrategy.Imposto;

import java.math.BigDecimal;

public class CalcularImpostoStrategy {


    public BigDecimal calcularSemStrategy (Orcamento orcamento, TipoImposto tipoImposto){

        /**
         * problema: sempre que aparecer um novo imposto tenho que criar um if ou case novo
         */
        switch (tipoImposto){
            case ICMS:
                return orcamento.getValor().multiply(BigDecimal.valueOf(TipoImposto.ICMS.getJuros()));
            case ISS:
                return orcamento.getValor().multiply(BigDecimal.valueOf(TipoImposto.ISS.getJuros()));
            default:
                return BigDecimal.ZERO;
        }

    }

    /**
     * Para resolver esse problema de varios ifs é usado o padrão strategy, ele consiste em pegar cada if
     * e converter-los classes separadas e generalizar a acao dos ifs por meio de polimorfismo
     *
     *
     *
     * @param orcamento orcamento a ser calculado
     * @param imposto imposto a ser aplicado
     * @return
     */
    public BigDecimal calcularComStrategy (Orcamento orcamento, Imposto imposto){

        return imposto.calcularImposto(orcamento);

    }
}
