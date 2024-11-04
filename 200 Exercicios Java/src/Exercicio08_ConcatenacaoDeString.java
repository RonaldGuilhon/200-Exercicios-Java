import java.util.Scanner;

public class Exercicio08_ConcatenacaoDeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite su primeiro nome:");
        String primeiroNome = scanner.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Bem vindo, " + primeiroNome + " " + sobrenome + "!");

        scanner.close();
    }
}
