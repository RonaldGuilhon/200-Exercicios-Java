import java.util.Scanner;

public class Exercicio07_EntradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numeroInt = scanner.nextInt();

        System.out.println("Digite um numero decimal: ");
        double numeroDouble = scanner.nextDouble(); //digite usando a virgula

        double soma = numeroInt + numeroDouble;

        System.out.println("A soma dos numeros é: " + soma); 

        scanner.close();
    }

}
