public class Exercicio5 {
    public static void main(String[] args) {

        int interruptor1 = 0;
        int interruptor2 = 0;
        int interruptor3 = 0;

        interruptor1 = 1;

        interruptor1 = 0;
        interruptor2 = 1;

        if (isLampadaLigada(1)) {
            System.out.println("Interruptor 2 controla a lâmpada 1");
        } else if (isLampadaAcesa(1)) {
            System.out.println("Interruptor 1 controla a lâmpada 1");
        } else {
            System.out.println("Interruptor 3 controla a lâmpada 1");
        }
    }

    private static boolean isLampadaLigada(int numeroLampada) {

        return false;
    }

    private static boolean isLampadaAcesa(int numeroLampada) {
        return false;
    }
}
