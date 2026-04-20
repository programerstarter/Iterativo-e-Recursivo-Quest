import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int valorFinal = 10;
        int valorInicial = 1;
        int opt;

        Scanner entrada = new Scanner(System.in);

        IterativoVsRecursivoExemploSimples iterativoVsRecursivo;
        TrabalhandoComVetor trabalhandoComVetor;
        Fibonacci fibonacci;


        do {
            System.out.println("Escolha a opção desejada");
            System.out.println("1: \t Impressão iterativa");
            System.out.println("2: \t Impressão recursiva (estudante)");
            System.out.println("3: \t Impressão recursiva (professor)");
            System.out.println("4: \t Fibonacci iterativo");
            System.out.println("5: \t Fibonacci recursivo");
            System.out.println("6: \t Trabalhando com vetor");
            System.out.println("0: \t SAIR");
            System.out.print(":> ");
            try {
                opt = entrada.nextInt();
                switch (opt) {
                    case 1 -> {
                        iterativoVsRecursivo = new IterativoVsRecursivoExemploSimples(valorFinal);
                        System.out.println("Iterativo");
                        iterativoVsRecursivo.imprimirIterativo(valorInicial);
                    }
                    case 2 -> {
                        iterativoVsRecursivo = new IterativoVsRecursivoExemploSimples(valorFinal);
                        System.out.println("Recursivo (estudante)");
                        iterativoVsRecursivo.imprimirRecursivo(valorInicial);
                    }
                    case 3 -> {
                        iterativoVsRecursivo = new IterativoVsRecursivoExemploSimples(valorFinal);
                        System.out.println("Recursivo (professor)");
                        iterativoVsRecursivo.imprimirRecursivoFabricio(valorInicial, valorFinal);
                    }

                    case 4 -> {
                        System.out.println();
                        System.out.println("Fibonacci iterativo");
                        System.out.print("Informe a quantidade de elementos da série de FIBONACCI que deseja exibir:\\> ");
                        int nesimaPosicao = entrada.nextInt();
                        fibonacci = new Fibonacci(nesimaPosicao);

                        if(nesimaPosicao > 0){
                            long[] fibonacciResponse = fibonacci.fibonacciIterativo();

                            for (int i = 0; i < fibonacciResponse.length; i++) {
                                if (i > 0)
                                    System.out.print(", ");

                                System.out.print(fibonacciResponse[i]);
                            }
                        } else {
                            System.out.println("FIBONACCI: VOCÊ PRECISA INFORMAR UM VALOR MAIOR DO QUE ZERO!!!");
                        }
                    }
                    case 5 -> {
                        System.out.println();
                        System.out.println("Fibonacci recursivo");
                        System.out.print("Informe a quantidade de elementos da série de FIBONACCI que deseja exibir:\\> ");
                        int nesimaPosicao = entrada.nextInt();
                        fibonacci = new Fibonacci(nesimaPosicao);

                        if(nesimaPosicao > 0){
                            long[] fibonacciResponse = fibonacci.fibonacciRecursivo();

                            for (int i = 0; i < fibonacciResponse.length; i++) {
                                if (i > 0)
                                    System.out.print(", ");

                                System.out.print(fibonacciResponse[i]);
                            }
                        } else {
                            System.out.println("FIBONACCI: VOCÊ PRECISA INFORMAR UM VALOR MAIOR DO QUE ZERO!!!");
                        }
                    }
                    case 6 -> {
                        trabalhandoComVetor = new TrabalhandoComVetor(valorFinal);
                        trabalhandoComVetor.inicializarVetorSequencial();

                        int[] retorno = trabalhandoComVetor.retornarVetor();

                        System.out.println("Elementos do vetor: ");

                        for (int i = 0; i < valorFinal; i++) {
                            System.out.println(retorno[i]);
                        }
                    }
                    default -> {
                        if(opt != 0){
                            System.out.println("Opção inválida, tente novamente...");
                            opt = 0;
                        }
                    }
                }
                System.out.println();
                System.out.println("---");
            } catch (InputMismatchException e) {
                System.out.println("################################");
                System.out.println("VOCÊ INSERIU UM VALOR NÃO NUMÉRICO!!");
                System.out.println("PRESSIONE QUALQUER TECLA PARA TENTAR NOVAMENTE, OU, 0 (ZERO) PARA SAIR: ");
                if (entrada.hasNext()) {
                    String trash = entrada.next();
                    System.out.println("Esta linha pode ser removida, usada apenas para teste!!\n valor lixo:" + trash);
                    System.out.println();
                }
                System.out.print("Opção:\\> ");
                String novaTentativa = entrada.next();

                if (novaTentativa.matches("[0-9]+"))
                    opt = Integer.parseInt(novaTentativa);
                else
                    opt = 0;

            }
        } while (opt != 0);

        System.out.println("Programa finalizado!!!");
    }
}