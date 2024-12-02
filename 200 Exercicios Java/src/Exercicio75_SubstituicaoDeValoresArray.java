import java.util.Scanner;

public class Exercicio75_SubstituicaoDeValoresArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Entrada de valores no array
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o número %d: ", (i + 1));
            numeros[i] = scanner.nextInt();
        }

        // Receber os valores para substituição
        System.out.printf("Digite o número que deseja substituir: ");
        int numeroSubstituir = scanner.nextInt();
        System.out.printf("Digite o novo valor: ");
        int novoValor = scanner.nextInt();

        // Substituir o valor, se encontrado
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroSubstituir) {
                numeros[i] = novoValor;
                encontrado = true;
            }
        }

        // Exibir o resultado
        if (encontrado) {
            System.out.println("O valor foi substituído com sucesso!");
            for (int numero : numeros) {
                System.out.println(numero);
            }
        } else {
            System.out.println("O valor não foi encontrado!");
        }

        scanner.close();
    }
}
