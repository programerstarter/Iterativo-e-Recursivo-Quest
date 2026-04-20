public class IterativoVsRecursivoExemploSimples {
    private int valorFinal;

    public IterativoVsRecursivoExemploSimples(int valorFinal) {
        this.valorFinal = valorFinal;
    }

    public void imprimirIterativo(int valorInicial) {
        // 1, 2, 3, 4, ..., 99, 100
        for (int i = valorInicial; i <= valorFinal; i++) {
            if (i > valorInicial) {
                System.out.print(", " + i);
            } else {
                System.out.print(i);
            }
        }
    }

    // i++ vs ++i
    public void imprimirRecursivo(int i) {
        if (i <= valorFinal) {
            System.out.print(i + ", ");
            imprimirRecursivo(++i);
        }
    }

    public void imprimirRecursivoFabricio(int valorInicial,
                                          int valorFinal) {
        if (valorInicial < valorFinal) {
            imprimirRecursivoFabricio(valorInicial, --valorFinal);
            System.out.print(", " + (valorFinal + 1));
        } else {
            System.out.print(valorFinal);
        }
    }
}
