import java.util.Scanner;

public class Exercicio14_ConversaoDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a temperatura em grau celsios °C: ");
        double celsius = scanner.nextDouble();

        double fahenheit = (celsius * 9) + 32;

        System.out.printf("A temperaturta em Fahrenheit é: " + fahenheit + " °F");

        scanner.close();
    }
}
