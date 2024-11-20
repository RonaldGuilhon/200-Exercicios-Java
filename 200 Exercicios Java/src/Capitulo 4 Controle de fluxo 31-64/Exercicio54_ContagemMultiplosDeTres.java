public class Exercicio54_ContagemMultiplosDeTres {
    public static void main(String[] args) {
        int contagem = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                contagem++;
            }

        }
        System.out.println("A Quantidade de multiplos de 3 é: " + contagem);
    }
}
