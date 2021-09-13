package strategy.implementacaochainofresponsability;

import strategy.Orcamento;
import sun.security.krb5.internal.crypto.Des;

import java.math.BigDecimal;

public abstract class Desconto {

    protected  Desconto proximo;

    public Desconto (Desconto proximo){
        this.proximo = proximo;
    }
    public abstract BigDecimal calcularComChainOfResposability (Orcamento orcamento);


}
