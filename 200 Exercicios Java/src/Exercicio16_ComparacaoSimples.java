import java.util.Scanner;

public class Exercicio16_ComparacaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.printf("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os numeros sao iguais!");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior!");
        } else if (numero1 < numero2) {
            System.out.println("O segundo número é maior!");
        }
        scanner.close();

    }
}
