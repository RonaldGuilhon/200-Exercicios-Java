import java.util.Scanner;

public class Exercicio58_ValidacaoDeEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro entre 1 e 10: ");
        int numero = scanner.nextInt();

        while (numero < 1 || numero > 10) {
            System.out.println("Número inválido. Tente novamente");
            System.out.println("Digite um número inteiro entre 1 e 10: ");
            numero = scanner.nextInt();

        }
        System.out.println("Você digitou o número: " + numero);

        scanner.close();
    }
}
