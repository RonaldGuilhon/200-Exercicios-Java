import java.util.Scanner;

public class Exercicio12_MediaAritimetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro  valor: ");
        int valor1 = scanner.nextInt();

        System.out.printf("Digite o primeiro  valor: ");
        int valor2 = scanner.nextInt();

        System.out.printf("Digite o primeiro  valor: ");
        int valor3 = scanner.nextInt();

        double media = (valor1 + valor2 + valor3) / 3;

        System.out.println("A média aritimetica é: " + media);

        scanner.close();
    }
}
