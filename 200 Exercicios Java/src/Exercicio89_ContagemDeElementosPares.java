import java.util.Scanner;
public class Exercicio89_ContagemDeElementosPares {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5]; 
        int contador = 0;
        
        // Preenchendo a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] % 2 == 0) {
                    contador++;
                }
            }
        }
        
        System.out.println("Quantidade de elementos pares: " + contador);
    }
}
