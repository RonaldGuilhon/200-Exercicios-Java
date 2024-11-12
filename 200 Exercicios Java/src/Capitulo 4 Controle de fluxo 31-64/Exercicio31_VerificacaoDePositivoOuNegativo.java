import java.util.Scanner;
public class Exercicio31_VerificacaoDePositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("O numero é positivo");
        } else if (numero == 0) {
            System.out.println("O numero é Zero");
        } else {
            System.out.println("O número é negativo");
        }
        scanner.close();
    }
}
