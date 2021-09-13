package strategy;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private Long quantidade;

    public Orcamento(BigDecimal valor, Long quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }
}
