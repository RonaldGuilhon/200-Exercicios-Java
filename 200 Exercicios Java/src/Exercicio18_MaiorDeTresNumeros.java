import java.util.Scanner;

public class Exercicio18_MaiorDeTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior numero eh: " + numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior numero eh: " + numero2);
        } else {
            System.out.println("O maior numero eh: " + numero3);
        }

        scanner.close();
    }

}
