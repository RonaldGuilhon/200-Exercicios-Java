import java.util.Scanner;

public class Exercicio60_ContagemDeNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contagemPositivos = 0;
        int numero;
        System.out.println("Digite um número positivo: ");
        numero = scanner.nextInt();
        while (numero > 0) {
            contagemPositivos++;
            System.out.println("Digite um número positivo: ");
            numero = scanner.nextInt();
        }
        System.out.println("Você digitou " + contagemPositivos + " número(s) positivo(s)");
        scanner.close();
    }
}
