import java.util.Scanner;;

public class Exercicio42_ClassificacaoDeNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite a nota do aluno: ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 0:
                System.out.println("Insuficiente");
                break;
            case 1:
                System.out.println("Insuficiente");
                break;
            case 2:
                System.out.println("Insuficiente");
                break;
            case 3:
                System.out.println("Insuficiente");
                break;
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Regular");
                break;
            case 6:
                System.out.println("Bom");
                break;
            case 7:
                System.out.println("Bom");
                break;
            case 8:
                System.out.println("Muito bom");
                break;
            case 9:
                System.out.println("Muito bom");
                break;
            case 10:
                System.out.println("Exelente");
                break;
            default:
                System.out.println("Digite uma note entre 0 e 10!");
                break;
        }
        scanner.close();
    }

}