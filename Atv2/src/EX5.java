import java.util.Random;

public class EX5 {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();

        int[] aleatorios = new int[30];
        int[] impares = new int[30];
        int contador = 0;

        for (int c = 0; c < aleatorios.length; c++) {
           aleatorios[c] = rand.nextInt(100);

            if (aleatorios[c] % 2 != 0) {
                impares[contador] = aleatorios[c];
                contador++;
            }
        }

        System.out.println("Numeros aleatorios:");

        for (int c = 0; c < aleatorios.length; c++) {
            System.out.println(aleatorios[c]);
        }

        System.out.println("Dos 30 numeros, " + contador + " sao impares.");

    }
    
}
