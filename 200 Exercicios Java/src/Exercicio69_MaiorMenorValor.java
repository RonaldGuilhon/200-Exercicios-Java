import java.util.Scanner;

public class Exercicio69_MaiorMenorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior, menor;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Entre com o " + (i + 1) + "º valor");
            numeros[i] = scanner.nextInt();
            if (i == 0) {
                maior = numeros[i];
                menor = numeros[i];
            } else if (numeros[i] > maior) {
                maior = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("O maior valor digitado foi: " + maior);
        System.out.println("O menor valor digitado foi: " + menor);
        scanner.close();
    }
}
