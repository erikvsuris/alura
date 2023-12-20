package desafios;
import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroPensado = random.nextInt(100);
        boolean correct = false;
        int palpite;

        for (int i = 5; i > 0;) {
            System.out.print("\nInforme um número inteiro: ");
            palpite = scanner.nextInt();
            
            if (palpite == numeroPensado) {
                correct = true;
                break;
            } else if (palpite < numeroPensado) {
                System.out.println("\nO número pensado é maior que o número informado!");
            } else {
                System.out.println("\nO número pensado é menor que o número informado!");
            }

            i--;
            System.out.println("\nTentativas restantes: " + i);
        }

        if (correct)
            System.out.println("\nParabéns, seu palpite está correto!");
        else
            System.out.println("\nSuas tentativas acabaram!");

        scanner.close();
    }
}