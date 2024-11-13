import java.util.Scanner;

public class Exercicio45_ClassificacaodeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a idade: ");
        int idade = scanner.nextInt();

        // A partir do Java 12, o switch pode usar a sintaxe de múltiplos rótulos (case
        // labels) com vírgulas
        // switch (idade) {
        // case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
        // System.out.println("Criança");
        // break;
        // case 13, 14, 15, 16, 17:
        // System.out.println("Adolescente");
        // break;
        // case 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
        // 36, 37, 38, 39, 40,
        // 41, 41, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59:
        // System.out.println("Adulto");
        // break;
        // default:
        // System.out.println("Idoso");
        // break;
        // }

        // resolução para versões inefiores ao java 12
        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        scanner.close();
    }
}
