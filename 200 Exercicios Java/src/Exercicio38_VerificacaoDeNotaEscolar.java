import java.util.Scanner;

public class Exercicio38_VerificacaoDeNotaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println("Suficiente");
        } else if (nota > 7) {
            System.out.println("Bom");
        }
        scanner.close();
    }
}
