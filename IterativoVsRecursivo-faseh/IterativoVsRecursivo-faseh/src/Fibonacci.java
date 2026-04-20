public class Fibonacci {
    private int nesimoElemento;
    private long[] sequenciaFibonacci;


    public Fibonacci(int nesimoElemento) {
        this.nesimoElemento = nesimoElemento + 1;
    }

    /**
     * Use this if you will call the #fibonacciIterativo without parameters.
     */
    public Fibonacci() {
        this.nesimoElemento = 0;
    }

    /** Returns an array with size n that contains a fibonacci series
     *  calculated in an iterative way
     * @param nesimoElemento n-ésimo elemento da sequência de Fibonacci
     * @return [] with the finonacci elements
     */
    public long[] fibonacciIterativo(Integer nesimoElemento) {
        if (nesimoElemento != null) {
            this.nesimoElemento = nesimoElemento + 1;
        }
        return fibonacciIterativo();
    }

    /**
     * @return [] with the finonacci elements
     */
    public long[] fibonacciIterativo() {
        long[] sequenciaFibonacci = new long[this.nesimoElemento];
        long um = 1;
        long dois = 2;
        if (this.nesimoElemento > 2) {
            iniciarPrimeiraESegundaPosicoes(sequenciaFibonacci);
            for (int i = 2; i < this.nesimoElemento; i++) {
                sequenciaFibonacci[i] = sequenciaFibonacci[i - 2] + sequenciaFibonacci[i - 1];
            }
        } else if (this.nesimoElemento == (um)) {
            iniciarPrimeiraPosicao(sequenciaFibonacci);
        } else if (this.nesimoElemento == (dois)) {
            iniciarPrimeiraESegundaPosicoes(sequenciaFibonacci);
        }

        return sequenciaFibonacci;
    }

    public long[] fibonacciRecursivo(Integer nesimoElemento) {
        if (nesimoElemento != null)
            this.nesimoElemento = nesimoElemento + 1;

        return fibonacciRecursivo();

    }

    /**
     *
     * @return an [] with the fibonacci elements with size nesimo
     */
    public long[] fibonacciRecursivo() {

        if (sequenciaFibonacci == null)
            sequenciaFibonacci = new long[this.nesimoElemento];

        return fibonacciRecursivoInterno(nesimoElemento);
    }

    private long[] fibonacciRecursivoInterno(int i) {
//        System.out.println("Chamada fatorial " + i);
        if (i > 1) {
            fibonacciRecursivoInterno(i - 1);
            if (i < nesimoElemento) {
                sequenciaFibonacci[i] = sequenciaFibonacci[i - 2] + sequenciaFibonacci[i - 1];
            }
        } else if (i == 1) {
            sequenciaFibonacci[i] = i;
            fibonacciRecursivoInterno(0);
        } else  {
            sequenciaFibonacci[i] = i;
        }
//        System.out.println("Chamada fatorial " + i);
        return sequenciaFibonacci;
    }

    private void iniciarPrimeiraPosicao(long[] sequenciaFibonacci) {
        sequenciaFibonacci[0] = 0;
    }

    private void iniciarPrimeiraESegundaPosicoes(long[] sequenciaFibonacci) {
        sequenciaFibonacci[0] = 0;
        sequenciaFibonacci[1] = 1;
    }
}
