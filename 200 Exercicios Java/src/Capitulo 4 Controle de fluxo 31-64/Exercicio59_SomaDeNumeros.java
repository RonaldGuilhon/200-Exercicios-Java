import java.util.Scanner;

public class Exercicio59_SomaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro diferente de zero: ");
        int numero = scanner.nextInt();

        int somaAcumulada = 0;

        while (numero != 0) {
            somaAcumulada += numero;
            System.out.println("Digite o próximo número inteiro diferente de zero: ");
            numero = scanner.nextInt();

        }
        System.out.println("A soma total é: " + somaAcumulada);
        scanner.close();
    }
}
