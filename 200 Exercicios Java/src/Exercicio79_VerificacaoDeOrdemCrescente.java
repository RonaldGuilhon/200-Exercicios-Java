import java.util.Scanner;

public class Exercicio79_VerificacaoDeOrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] emOrdem = new int[8];
        for (int i = 0; i < emOrdem.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            emOrdem[i] = scanner.nextInt();
        }

    }
}
