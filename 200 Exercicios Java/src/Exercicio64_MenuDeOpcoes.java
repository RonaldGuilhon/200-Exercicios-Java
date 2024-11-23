import java.util.Scanner;

public class Exercicio64_MenuDeOpcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Menu de Opções");
            System.out.println("1 - Somar dois números");
            System.out.println("2 - Subtrair dois números");
            System.out.println("3 - Multiplicar dois números");
            System.out.println("4 - Dividir dois números");
            System.out.println("5 - Sair");
            System.out.printf("Escolha uma opção:");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Insira o primeiro número:");
                    int num1 = scanner.nextInt();
                    System.out.println("Insira o segundo número:");
                    int num2 = scanner.nextInt();
                    System.out.println("A soma é: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Insira o primeiro número:");
                    num1 = scanner.nextInt();
                    System.out.println("Insira o segundo número:");
                    num2 = scanner.nextInt();
                    System.out.println("A subtração é: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Insira o primeiro número:");
                    num1 = scanner.nextInt();
                    System.out.println("Insira o segundo número:");
                    num2 = scanner.nextInt();
                    System.out.println("A multiplicação é: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Insira o primeiro número:");
                    num1 = scanner.nextInt();
                    System.out.println("Insira o segundo número:");
                    num2 = scanner.nextInt();
                    if (num2 != 0) {
                        System.out.println("A divisão é: " + (num1 / num2));
                    } else
                        System.out.println("Não é possível dividir por zero!");
                    break;
                case 5:
                    System.out.println("Obrigado por usar o nosso menu!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 5);
        System.out.println("Programa encerrado");
        scanner.close();
    }

}
