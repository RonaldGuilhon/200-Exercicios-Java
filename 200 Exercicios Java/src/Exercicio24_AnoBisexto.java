import java.util.Scanner;

public class Exercicio24_AnoBisexto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano é bisexto!");
        } else {
            System.out.println("O ano não é bisexto!");
        }
        scanner.close();
    }

}
