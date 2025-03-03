import java.util.Scanner;

public class Exercicio74_ElementosPosicoesimpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Os números digitados em posições impares do array foram: ");
        for (int i = 1; i < numeros.length; i += 2) {
            System.out.println(numeros[i]);
        }
        scanner.close();
    }

}
