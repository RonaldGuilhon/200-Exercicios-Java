import java.util.Scanner;;

public class Exercicio43_OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.printf("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.printf("Digite a operação (Adição +), (Subtração -), (Multiplicação *) ou (Divisão /): ");
        char operação = scanner.next().charAt(0);

        switch (operação) {
            case '+':
                System.out.println("Soma: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Soma: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Soma: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Soma: " + (num1 / num2));
                break;

            default:
                System.out.println("Operador inválido!");
                break;
        }

        scanner.close();
    }
}
