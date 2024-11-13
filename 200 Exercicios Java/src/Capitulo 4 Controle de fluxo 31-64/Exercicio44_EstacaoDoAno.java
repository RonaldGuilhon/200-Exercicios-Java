import java.util.Scanner;

public class Exercicio44_EstacaoDoAno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 4 para estação do ano: ");
        int estacao = scanner.nextInt();

        switch (estacao) {
            case 1:
                System.out.println("Verão");
                break;
            case 2:
                System.out.println("Outono");
                break;
            case 3:
                System.out.println("Inverno");
                break;
            case 4:
                System.out.println("Primavera");
                break;
            default:
                System.out.println("Digite um número de 1 a 4!");
                break;
        }
        scanner.close();
    }
}
