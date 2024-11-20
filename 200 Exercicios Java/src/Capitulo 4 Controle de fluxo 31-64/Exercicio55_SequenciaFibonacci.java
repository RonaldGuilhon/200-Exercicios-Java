public class Exercicio55_SequenciaFibonacci {
    public static void main(String[] args) {
        int numro1 = 0;
        int numro2 = 1;

        System.out.print(numro1 + " " + numro2 + " ");

        for (int i = 3; i <= 10; i++) {
            int numro3 = numro1 + numro2;
            System.out.print(numro3 + " ");
            numro1 = numro2;
            numro2 = numro3;

        }
    }

}
