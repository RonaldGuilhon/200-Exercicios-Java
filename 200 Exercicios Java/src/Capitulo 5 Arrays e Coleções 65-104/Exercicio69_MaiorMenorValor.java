import java.util.Scanner;

public class Exercicio69_MaiorMenorValor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior, menor;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Entre com o " + (i + 1) + "º valor");
            numeros[i] = scanner.nextInt();
        }
        maior = menor = numeros[0];
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        scanner.close();

    }
}
