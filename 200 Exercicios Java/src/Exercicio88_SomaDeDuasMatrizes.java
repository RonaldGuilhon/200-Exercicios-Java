import java.util.Scanner;

public class Exercicio88_SomaDeDuasMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] soma = new int[3][3];

        // preenchendo a matriz A
        System.out.println("Preenchendo a Matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "] da Matriz A: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // preenchendo a matriz B
        System.out.println("Preenchendo a Matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "] da Matriz B: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // somando as matrizes
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // exibindo o resultado
        System.out.println("Resultado da Soma das Matrizes A e B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
