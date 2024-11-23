import java.util.Scanner;

public class Exercicio63_SenhaCorreta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = "1234";
        boolean senhaCorreta = false;

        do {
            System.out.print("Digite a senha: ");
            String senhaDigitada = scanner.nextLine();

            if (senhaDigitada.equals(senha)) {
                System.out.println("Senha correta!");
                senhaCorreta = true;
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senhaCorreta);

        scanner.close();
    }
}
