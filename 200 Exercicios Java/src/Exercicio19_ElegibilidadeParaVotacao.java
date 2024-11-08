import java.util.Scanner;

public class Exercicio19_ElegibilidadeParaVotacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você está apto a votar");
        } else {
            System.out.println("Você não está apto a votar");
        }
        scanner.close();
    }
}
