import java.util.Random;

public class EX6 {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        
        int[] aleatorios = new int [10];
        
        for(int c = 0; c < aleatorios.length; c++){
            aleatorios[c] = rand.nextInt(100);
        }
        
        System.out.println("Vetor original:");
        for(int c = 0; c < aleatorios.length; c++){
            System.out.print(aleatorios[c] + "\t");
        }
        
        System.out.println("\n" + "\nVetor em ordem Reversa: ");
        for(int c = 9; c >= 0; c--){
            System.out.print(aleatorios[c] + "\t");
        }
        System.out.println("\n");
    }
}
