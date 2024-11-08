import java.util.Scanner;

public class Exercicio15_Potenciacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero base: ");
        int base = scanner.nextInt();

        System.out.println("Digite o expoente: ");
        int expoente = scanner.nextInt();

        double resultado = Math.pow(base, expoente);
        
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);

        scanner.close();
    }
}
