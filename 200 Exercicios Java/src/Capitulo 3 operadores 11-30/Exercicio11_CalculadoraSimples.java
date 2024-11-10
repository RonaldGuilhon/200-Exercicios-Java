import java.util.Scanner;

public class Exercicio11_CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.printf("Digite outro número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A subtração dos valores é: " + subtracao);
        System.out.println("A multilicação dos valores é: " + multiplicacao);
        System.out.println("A divisão dos valores é: " + divisao);
        System.out.println("O modulo dos valores é: " + modulo);

        scanner.close();

    }
}
