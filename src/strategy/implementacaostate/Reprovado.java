package strategy.implementacaostate;

import strategy.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends State {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setEstado(new Finalizado());
    }
}
