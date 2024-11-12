import java.util.Scanner;
public class Exercicio39_ComparacaodeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a idade da primeira pessoa: ");
        int idadePessoa1 = scanner.nextInt();

        System.out.printf("Digite a idade da segunda pessoa: ");
        int idadePessoa2 = scanner.nextInt();

        if (idadePessoa1 > idadePessoa2){
            System.out.printf("A primeira pessoa é mais velha que a segunda pessoa.\n");
        } else if (idadePessoa1 < idadePessoa2){
            System.out.printf("A segunda pessoa é mais velha que a primeira pessoa.\n");
        } else if (idadePessoa1 == idadePessoa2){
            System.out.printf("As duas pessoas têm a mesma idade.\n");
        }


    }
}
