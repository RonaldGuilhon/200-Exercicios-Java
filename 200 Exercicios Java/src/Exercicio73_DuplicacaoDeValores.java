import java.util.Scanner;

public class Exercicio73_DuplicacaoDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Valores duplicados: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] * 2);
        }
        scanner.close();
    }

}
