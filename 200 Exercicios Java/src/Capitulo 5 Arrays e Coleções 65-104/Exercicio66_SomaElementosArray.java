import java.util.Scanner;

public class Exercicio66_SomaElementosArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Entre com o valor do elemento " + (i + 1) +
                    " do array: ");
            array[i] = scanner.nextInt();
            soma += array[i];
        }
        System.out.println("A soma dos elementos do array é: " + soma);
        scanner.close();
    }

}
