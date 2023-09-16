import java.util.Random;

public class EX10 {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
	    
	    int[] d1 = new int[100];
	    int[] d2 = new int[100];
	    int[] soma = new int[100];
	    
	    int contador = 0;
	    
	    for(int c = 0; c < d1.length; c++){
	        d1[c] = rand.nextInt(6)+1;
	        System.out.print(d1[c] + " + ");
	        
	        d2[c] = rand.nextInt(6)+1;
	        System.out.print(d1[c]);
	        
	        soma[c] = d1[c] + d2[c];
	        System.out.print(" = " + soma[c] + "\n");
	        
	        if(soma[c] == 7){
	            contador++;
	        }
	    }
	    
	    System.out.println("A soma dos dados foi igual a 7, " + contador + " vezes.");

    }
}
