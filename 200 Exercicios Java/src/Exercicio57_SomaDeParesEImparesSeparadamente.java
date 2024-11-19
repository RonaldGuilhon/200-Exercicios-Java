public class Exercicio57_SomaDeParesEImparesSeparadamente {
    public static void main(String[] args) {
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            } else
                somaImpares += i;
        }
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos impares: " + somaImpares);

    }

}
