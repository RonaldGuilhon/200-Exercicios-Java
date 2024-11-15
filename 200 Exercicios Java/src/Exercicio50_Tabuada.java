import java.util.Scanner;

public class Exercicio50_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Digite a operação (Adição +), (Subtração -), (Multiplicação *) ou (Divisão /): ");
        char operacao = scanner.next().charAt(0);

        switch (operacao) {
            case '+':
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " + " + i + " = " + (numero + i));
                }
                break;
            case '-':
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " - " + i + " = " + (numero - i));
                }
                break;
            case '*':
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " * " + i + " = " + (numero * i));
                }
                break;
            case '/':
                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero + " * " + i + " = " + (numero / i));
                }
                break;
            default:
                System.out.println("Digite uma operação válida!");
                break;
        }
        scanner.close();
    }
}
