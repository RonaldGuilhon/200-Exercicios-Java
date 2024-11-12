import java.util.Scanner;

public class Exercicio40_AvaliacaoDeVelocidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a velocidade do veiculo (Km/h): ");
        double velocidade = scanner.nextDouble();

        if (velocidade <= 60) {
            System.out.printf("Dentro do limite de velocidade.");
        } else if (velocidade >= 61 && velocidade <= 80) {
            System.out.printf("Acima do limite de velocidade.");
        } else if (velocidade >= 81) {
            System.out.printf("Muito acima do limite de velocidade.");
        }

        scanner.close();
    }
}
