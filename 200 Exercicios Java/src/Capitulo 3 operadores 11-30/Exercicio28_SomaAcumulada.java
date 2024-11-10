import java.util.Scanner;

public class Exercicio28_SomaAcumulada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaAcumulada = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o " + i + "º número inteiro: ");
            int valorDigitado = scanner.nextInt();
            somaAcumulada += valorDigitado;
        }

        System.out.println("A soma acumulada é: " + somaAcumulada);

        scanner.close();
    }
}
