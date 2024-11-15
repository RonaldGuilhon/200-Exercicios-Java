import java.util.Scanner;

public class Exercicio51_Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para o fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}
