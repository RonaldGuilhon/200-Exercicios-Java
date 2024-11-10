public class Exercicio29_PreIncrementoePosIncremento {

    public static void main(String[] args) {
        int x = 10;

        System.out.println("Valor inicial da variavel x: " + x);

        int preIncremento = ++x;
        System.out.println("O valor da variavle x com pré-incremento (++x) é: " + preIncremento);

        int posIncremento = x++;
        System.out.println("O valor da variavle x com pós-incremento (x++) é: " + posIncremento);

        System.out.println("Valor final após o pós-incremento e pré-incremento é: " + x);
    }

}