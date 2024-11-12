import java.util.Scanner;

public class Exercicio37_AvaliacaodeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a temoperatura atual: ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 15) {
            System.out.println("Frio");
        } else if (temperatura >= 15 && temperatura <= 30) {
            System.out.println("Agradável");
        } else if (temperatura > 30) {
            System.out.println("Quente");
        }
        scanner.close();
    }
}
