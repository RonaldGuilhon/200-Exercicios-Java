import java.util.Scanner;

public class Exercicio22_OperadoreslogicosANDeOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número interio: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        if (numero1 > 10 || numero2 > 10 || numero3 > 10) {
            System.out.println("Um ou mais números são maiores que 10");
        } else {
            System.out.println("Nenhum número é maior que 10");
        }
        if (numero1 > 10 && numero2 > 10 && numero3 > 10) {
            System.out.println("Todos os números são maiores que 10");
        } else {
            System.out.println("Nem todos os números são maiores que 10");
        }
        scanner.close();

    }
}
