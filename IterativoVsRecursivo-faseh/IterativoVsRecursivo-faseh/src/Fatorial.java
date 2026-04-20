public class Fatorial {
    public static void main(String[] args) {
        System.out.println("--- Iterativo (1 a 5) ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "! = " + fatorialIterativo(i));
        }

        System.out.println("\n--- Recursivo (5 a 1) ---");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i + "! = " + fatorialRecursivo(i));
        }
    }

    public static long fatorialIterativo(int n) {
        long fat = 1;
        for (int j = 2; j <= n; j++) {
            fat *= j;
        }
        return fat;
    }

    public static long fatorialRecursivo(int n) {
        if (n <= 1) return 1;
        return n * fatorialRecursivo(n - 1);
    }
}




