public class Exercicio04_ConversaoDeTipos {
    public static void main(String[] args) {
        // conversão explicita de double para int
        double numDouble = 10.5;
        int numInt = (int) numDouble;

        // conversão implicita de int para double
        int numInteiro = 10;
        double numDouble2 = numInteiro;

        System.out.println("Numero double: " + numDouble);
        System.out.println("Numero double convertido para int: " + numInt);
        System.out.println("Numero inteiro: " + numInteiro);
        System.out.println("Numero inteiro convertido para double: " + numDouble2);

    }
}
