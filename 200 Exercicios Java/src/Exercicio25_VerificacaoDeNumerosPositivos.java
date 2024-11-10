import java.util.Scanner;

public class Exercicio25_VerificacaoDeNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o primeiro número interiro: ");
        int numero1 = scanner.nextInt();

        System.out.printf("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.printf("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        int positivos = 0;

        if (numero1 > 0)
            positivos++;
        if (numero2 > 0)
            positivos++;
        if (numero3 > 0)
            positivos++;

        if (positivos == 1) {
            System.out.println("Um número é positivo!");
        } else if (positivos == 2){
            System.out.println("Dois números são positivos!");
        }else if (positivos == 3){
            System.out.println("Três números são positivos");
         }else{
            System.out.println("Nenhum número é positivo");
         }
        scanner.close();

    }
}
