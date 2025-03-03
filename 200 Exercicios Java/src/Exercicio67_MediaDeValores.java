import java.util.Scanner;

public class Exercicio67_MediaDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o " + (i + 1) + "º valor: ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        double media = soma / 10.0;
        System.out.printf("A média dos valores é: " + media);

        scanner.close();
    }

}
