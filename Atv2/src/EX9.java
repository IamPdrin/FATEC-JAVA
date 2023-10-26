import java.util.Random;
import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
	    Random rand = new Random();
	    
	    int[] aleatorios = new int[25];
	    int numero;
	    boolean flag = false;
	    
	    for(int c = 0; c < aleatorios.length; c++){
	        aleatorios[c] = rand.nextInt(100);
	    }
	   
		System.out.println("Insira um numero: ");
		numero = ler.nextInt();
        ler.close();
		
		for(int c = 0; c < aleatorios.length; c++){
		    
		    if(aleatorios[c] == numero){
		        System.out.println("O numero " + numero + " foi encontrado! ");
		        flag = true;
		        break;
		    }
		}
		
		if(flag == false || numero >= 100){
		    System.out.println("O numero " + numero + " nao foi encontrado! ");
	    }

    }
	
}
