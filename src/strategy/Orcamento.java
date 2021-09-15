package strategy;

import strategy.implementacaostate.EmAnalise;
import strategy.implementacaostate.State;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private Long quantidade;
    private String situacao;
    private State estado;

    public Orcamento(BigDecimal valor, Long quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
        this.estado = new EmAnalise();
    }

    /**
     * problema: dependendo do estado do orcamento eu posso da um desconto,
     * mas tb preciso controlar para qual estado ele deve ir apos aplica ou não
     * o desconto, solução usar o pattern state
     */
    public void aplicarDescontoExtra(){
        BigDecimal  valorDescontoExtra = BigDecimal.ZERO;
        if(situacao.equals("EM ANALISE")){
            valorDescontoExtra = new BigDecimal("0.5");
        }else if(situacao.equals("APROVADO")){
            valorDescontoExtra = new BigDecimal("0.02");
        }
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aplicarDescontoExtraUsandoState(){
        BigDecimal  valorDescontoExtra = this.estado.aplicarDesconto(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar(){
        this.estado.aprovar(this);
    }
    public void reprovar(){
        this.estado.reprovar(this);
    }
    public void analisar(){
        this.estado.analisar(this);
    }
    public void finalizar(){
        this.estado.finalizar(this);
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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


    public State getEstado() {
        return estado;
    }

    public void setEstado(State estado) {
        this.estado = estado;
    }
}
