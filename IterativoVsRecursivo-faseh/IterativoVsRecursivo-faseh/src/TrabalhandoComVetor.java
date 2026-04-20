public class TrabalhandoComVetor {
    private final int[] idades; // declaração de um vetor de inteiros

    public TrabalhandoComVetor(int tamanhoVetor) {
       // Inicializando o vetor
        this.idades = new int[tamanhoVetor];
    }

    public void inicializarVetorSequencial() {
        for (int i = 0; i < idades.length; i++) {
            idades[i] = (i + 1);
        }
    }

    public int[] retornarVetor() {
        return  this.idades;
    }
}
