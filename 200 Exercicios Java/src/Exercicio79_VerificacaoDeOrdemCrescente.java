import java.util.Scanner;

public class Exercicio79_VerificacaoDeOrdemCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        boolean emOrdem = false;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º valor: ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                emOrdem = true;
                break;
                
            }
        }
        if (emOrdem) {
            System.out.println("Os números não estão em ordem crescente.");
        } else {
            System.out.println("Os números estão em ordem crescente.");
        }
        scanner.close();
    }
}
