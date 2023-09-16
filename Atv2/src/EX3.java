import java.util.Random;

public class EX3 {
    public static void main(String[] args) throws Exception {
        Random rand = new Random(); 
        int soma = 0;
        int[] aleatorios = new int[20];
 
        for(int c=0; c<aleatorios.length; c++){
            aleatorios[c] = rand.nextInt(100); 
 	    }

 	    for(int c=0; c<aleatorios.length; c++){
     	    System.out.println(aleatorios[c] + "\t");
     	    soma += aleatorios[c];
	    }

        System.out.println("Media final: " + (soma / 20));
    }
}
