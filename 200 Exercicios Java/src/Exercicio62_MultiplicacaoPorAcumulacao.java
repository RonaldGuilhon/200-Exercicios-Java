import java.util.Scanner;

public class Exercicio62_MultiplicacaoPorAcumulacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Digite um número: ");
        int numero = scanner.nextInt();
        while (numero <= 1000) {
            numero *= 2;
            System.out.println("Valor apos a multiplicação: " + numero);

        }
        System.out.println("Valor final após a multiplicação acumulada: " + numero);
        scanner.close();
    }

}
