import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        boolean contemA = verificarLetraA(texto);
        int quantidadeA = contarLetraA(texto);

        if (contemA) {
            System.out.println("A string contém a letra 'a'.");
            System.out.println("Quantidade de 'a's: " + quantidadeA);
        } else {
            System.out.println("A string não contém a letra 'a'.");
        }
    }

    public static boolean verificarLetraA(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
                return true;
            }
        }
        return false;
    }

    public static int contarLetraA(String texto) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
                contador++;
            }
        }
        return contador;
    }
}
