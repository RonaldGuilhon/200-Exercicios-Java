import java.util.Scanner;

public class Exercicio30_OperadoresCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        num1 += num2;
        System.out.println("Resultado de num1 += num2: " + num1);

        num1 -= num2;
        System.out.println("Resultado de num1 -= num2: " + num1);

        num1 *= num2;
        System.out.println("Resultado de num1 *= num2: " + num1);

        num1 /= num2;
        System.out.println("Resultado de num1 /= num2: " + num1);

        num1 %= num2;
        System.out.println("Resultado de num1 %= num2: " + num1);

        scanner.close();
    }
}
