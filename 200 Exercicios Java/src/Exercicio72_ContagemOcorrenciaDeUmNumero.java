import java.util.Scanner;

public class Exercicio72_ContagemOcorrenciaDeUmNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int ocorrencias = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Digite um numero para contar as ocorrências: ");
        int numeroProcurado = scanner.nextInt();
        for (int numero : numeros) {
            if (numero == numeroProcurado) {
                ocorrencias++;
            }
        }
        System.out.println("O número " + numeroProcurado + " apareceu " + ocorrencias + " vezes.");
        scanner.close();
    }
}
