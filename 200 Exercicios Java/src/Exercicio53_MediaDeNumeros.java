import java.util.Scanner;

public class Exercicio53_MediaDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º valor: ");
            int valor = scanner.nextInt();
            soma += valor;
        }
        double media = soma / 5.0;
        System.out.println("A média dos valores é: " + media);
        scanner.close();
    }

}