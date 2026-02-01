import java.util.Scanner;

public class Exercicio87_MultiplicacaoDeMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] resultado = new int[2][2];

        // preenchendo a matriz A
        System.out.println("Preenchendo a Matriz A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "] da Matriz A: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // preenchendo a matriz B
        System.out.println("Preenchendo a Matriz B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "] da Matriz B: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // multiplicando as matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = matrizA[i][0] * matrizB[0][j] + matrizA[i][1] * matrizB[1][j];
            }
        }

        // exibindo o resultado
        System.out.println("Resultado da Multiplicação das Matrizes A e B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}