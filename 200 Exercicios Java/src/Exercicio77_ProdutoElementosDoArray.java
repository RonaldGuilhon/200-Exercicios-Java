import java.util.Scanner;

public class Exercicio77_ProdutoElementosDoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int produto = 1;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
            produto *= numeros[i];
        }
        System.out.println("O produto dos números é: " + produto);
        scanner.close();
    }

}
