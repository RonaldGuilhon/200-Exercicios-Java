import java.util.Scanner;

public class Exercicio76_VerificacaoDeElementosRepetidos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean repetido = false;
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repetido = true;
                    break;
                }
            }
        }
        if (repetido) {
            System.out.println("Há números repetidos.");
        } else {
            System.out.println("Não há números repetidos.");
        }
        scanner.close();
    }
}
