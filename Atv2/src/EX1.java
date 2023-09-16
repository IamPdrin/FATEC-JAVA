import java.util.Random;

public class EX1 {
    public static void main(String[] args) throws Exception {
	Random rand = new Random();
	int[] aleatorios = new int[10];
	
	for(int c=0; c<=9; c++){
		aleatorios[c] = rand.nextInt(100);
	}
	
	for(int c=0; c<=9; c++){
		if(aleatorios[c]%2 == 0) {
		    System.out.println(aleatorios[c]);
	    }
    	}

    }
}
