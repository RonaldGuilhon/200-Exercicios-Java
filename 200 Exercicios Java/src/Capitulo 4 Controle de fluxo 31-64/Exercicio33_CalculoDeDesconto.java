import java.util.Scanner;

public class Exercicio33_CalculoDeDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Valor da compra: ");
        double valorCompra = scanner.nextDouble();

        double percentualDesconto = 10;

        double Desconto = (valorCompra * percentualDesconto) / 100;

        if (valorCompra >= 100) {
            valorCompra -= Desconto;
            System.out.println("O total com " + percentualDesconto + "% de desconto é: " + valorCompra + " Reais");

        } else {
            System.out.println("Valor abaixo de 100 reais sem desconto é: " + valorCompra + " Reais");
        }

        scanner.close();
    }

}
