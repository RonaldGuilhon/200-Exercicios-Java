import java.util.Scanner;
public class Exercicio84_BuscaEmUmaMatriz {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        //preenchendo a matriz
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("Digite o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        //buscando um numero na matriz
        System.out.print("Digite um número para buscar na matriz: ");
        int numeroBusca = scanner.nextInt();
        boolean encontrado = false;

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(matriz[i][j] == numeroBusca){
                    System.out.println("Número " + numeroBusca + " encontrado na posição [" + i + "][" + j + "].");
                    encontrado = true;
                }
            }
        }
        if(!encontrado){
            System.out.println("Número " + numeroBusca + " não encontrado na matriz.");
        }
    }
}
