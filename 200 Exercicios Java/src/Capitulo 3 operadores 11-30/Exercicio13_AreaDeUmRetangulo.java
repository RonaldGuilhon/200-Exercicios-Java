import java.util.Scanner;

public class Exercicio13_AreaDeUmRetangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a base do retângulo: ");
        double base = sc.nextDouble();

        System.out.printf("Digite a altura bdo retângulo: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("A area do retangulo é:  " + area);

        sc.close();

    }
}