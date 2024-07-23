public class Main {

    public static int soma(int... valores) {
        int total = 0;
        for (int valor : valores) {
            total += valor;
        }
        return total;
    }

    public static void main(String[] args) {

        int resultado1 = soma(1, 2, 3, 4, 5);
        int resultado2 = soma(10, 20, 30);

        System.out.println("Resultado da soma 1: " + resultado1);
        System.out.println("Resultado da soma 2: " + resultado2);
    }
}
