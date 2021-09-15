package strategy.implementacaochainofresponsability;

import strategy.Orcamento;
import sun.security.krb5.internal.crypto.Des;

import java.math.BigDecimal;

public abstract class Desconto {

    protected  Desconto proximo;

    public Desconto (Desconto proximo){
        this.proximo = proximo;
    }

    /**
     * calcularPatternTemplateMethod faz uso do padrão template method
     *
     * Define o esqueleto de um algoritmo na superclasse mas
     * deixa as subclasses sobrescreverem etapas específicas do algoritmo sem modificar sua estrutura.
     * @param orcamento
     * @return
     */
    public  BigDecimal calcularPatternTemplateMethod (Orcamento orcamento){
        if(deveAplicar(orcamento)){
           return  calcularComChainOfResposability(orcamento);
        }

        return proximo.calcularPatternTemplateMethod(orcamento);
    }
    public abstract BigDecimal calcularComChainOfResposability (Orcamento orcamento);
    public abstract Boolean deveAplicar (Orcamento orcamento);


}
