import java.util.Scanner;

public class FactoresPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        long n = sc.nextLong();

        System.out.print("Factores primos: ");

                while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.print(n);
        }
    }
}