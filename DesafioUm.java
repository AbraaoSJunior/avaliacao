import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        int a = 0;
        int b = 1;
        boolean pertence = false;

        if (numero == 0 || numero == 1) {
            pertence = true;
        } else {
            int fibonacci = a + b;
            while (fibonacci <= numero) {
                if (fibonacci == numero) {
                    pertence = true;
                    break;
                }
                a = b;
                b = fibonacci;
                fibonacci = a + b;
            }
        }

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
