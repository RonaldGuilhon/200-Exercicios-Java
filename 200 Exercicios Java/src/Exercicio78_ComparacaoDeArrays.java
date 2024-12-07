import java.util.Scanner;

public class Exercicio78_ComparacaoDeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        System.out.println("Preencha o primeiro array: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Elemento [" + i + "] = " + array1[i]);
            array1[i] = scanner.nextInt();

        }
        System.out.println("Preencha o segundo array: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Elemento [" + i + "] = " + array2[i]);
            array2[i] = scanner.nextInt();

        }
        scanner.close();
    }

}
