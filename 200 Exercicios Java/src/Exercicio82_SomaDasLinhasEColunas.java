import java.util.Scanner;
public class Exercicio82_SomaDasLinhasEColunas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        int[] somaLinhas = new int[3];
        int[] somaColunas = new int[4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor para a posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                somaLinhas[i] += matriz[i][j];
                somaColunas[j] += matriz[i][j];
            }
        }
        System.out.println("Soma das linhas:");
        for (int i = 0; i < somaLinhas.length; i++) {
            System.out.println("Linha " + i + ": " + somaLinhas[i]);
        }
        System.out.println("Soma das colunas:");
        for (int j = 0; j < somaColunas.length; j++) {
            System.out.println("Coluna " + j + ": " + somaColunas[j]);
        }
        scanner.close();
    }
}