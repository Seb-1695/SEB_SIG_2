import java.util.Scanner;

public class CombinacionPermutacion {

    public static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static long combinacion(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static long permutacion(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de Combinación y Permutación");
        System.out.print("Ingresa el primer número (n): ");
        int n = sc.nextInt();
        System.out.print("Ingresa el segundo número (r): ");
        int r = sc.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Error: ingresa números positivos y r ≤ n.");
        } else {
            System.out.println("C(" + n + "," + r + ") = " + combinacion(n, r));
            System.out.println("P(" + n + "," + r + ") = " + permutacion(n, r));
        }
    }
}