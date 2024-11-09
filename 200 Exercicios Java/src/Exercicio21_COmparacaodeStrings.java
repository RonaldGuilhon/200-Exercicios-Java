import java.util.Scanner;

public class Exercicio21_COmparacaodeStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira String: ");
        String string1 = scanner.nextLine();

        System.out.println("Digite a segunda String: ");
        String string2 = scanner.nextLine();

        if (string1.equals(string2)) {
            System.out.println("As Strings são iguais!");
        } else {
            System.out.println("As Strings são diferentes!");
        }
        scanner.close();
    }
}
