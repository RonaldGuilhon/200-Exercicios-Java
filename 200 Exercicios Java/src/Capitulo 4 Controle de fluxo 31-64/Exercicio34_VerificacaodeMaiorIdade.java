import java.util.Scanner;

public class Exercicio34_VerificacaodeMaiorIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 18) {
            System.out.println("Você é menor de idade");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é idoso(a)");
        }
        scanner.close();
    }

}
