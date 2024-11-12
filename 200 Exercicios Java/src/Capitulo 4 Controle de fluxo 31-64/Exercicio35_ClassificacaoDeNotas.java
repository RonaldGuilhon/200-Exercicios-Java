import java.util.Scanner;

public class Exercicio35_ClassificacaoDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a nota de 0 a 100: ");
        int nota = scanner.nextInt();

        if (nota >= 60) {
            System.out.println("Aprovação!");
        } else {
            System.out.println("Reprovação!");
        }

        scanner.close();
    }
}
