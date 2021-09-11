package strategy;

import java.util.Arrays;

public enum TipoImposto {
    ICMS(1, 0.1),
    ISS(2, 0.06);

    private int tipo;
    private double juros;


    TipoImposto(int tipo, double juros) {
        this.tipo = tipo;
        this.juros = juros;
    }

    public TipoImposto obterPorValor(int tipo) {
        return Arrays.stream(TipoImposto.values())
                .filter(ti -> ti.tipo == tipo).findFirst().orElse(null);
    }

    public int getTipo() {
        return tipo;
    }

    public double getJuros() {
        return juros;
    }

}
