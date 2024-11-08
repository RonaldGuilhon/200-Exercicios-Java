import java.util.Scanner;

public class Exercicio20_VerificacaodeIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 10 && numero <= 20) {
            System.out.println("O númer está entre 10 e 20");
        } else {
            System.out.println("O número NÂO está entre 10 e 20");
        }

        scanner.close();
    }
}
