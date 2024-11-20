import java.util.Scanner;
public class Exercicio61_RaizQuadradaAproximada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numeroInteiro = scanner.nextInt();

        // Validação da entrada
        if (numeroInteiro < 0) {
            System.out.println("Por favor, insira um número inteiro positivo.");
        } else {
            int raizAprox = 0;

            // Encontrar a raiz quadrada aproximada
            while (raizAprox * raizAprox < numeroInteiro) {
                raizAprox++;
            }

            // Verificar se é exata ou aproximada
            if (raizAprox * raizAprox == numeroInteiro) {
                System.out.println("A raiz quadrada exata de " + numeroInteiro + " é " + raizAprox + ".");
            } else {
                System.out.println("A raiz quadrada aproximada de " + numeroInteiro + " é " + (raizAprox - 1) + ".");
            }
        }

        scanner.close();
    }
}
