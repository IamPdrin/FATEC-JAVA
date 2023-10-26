import java.util.Arrays;
import java.util.Random;

public class EX4 {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        
        int[] aleatorios = new int [15];
        
        for(int c=0; c < aleatorios.length; c++){
            aleatorios[c] = rand.nextInt(100);
        }
        
        for(int c=0; c < aleatorios.length; c++){
            System.out.println(aleatorios[c] + "\t");
        }

        Arrays.sort(aleatorios);
        System.out.println("Maior numero: " + aleatorios[0] + "\nMenor numero: " + aleatorios[14]);
    }
    
}

