public class Exercicio4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;

        System.out.print("Sequência: " + a + ", " + b);

        for (int i = 0; i < 5; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
    }
}
