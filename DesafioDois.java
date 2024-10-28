import java.util.Scanner;

public class DesafioDois {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }

        }

        if(contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na palavra.");
        }else {
            System.out.println("A letra 'a' não aparece nesta palavra.");
        }
    }
    
}
