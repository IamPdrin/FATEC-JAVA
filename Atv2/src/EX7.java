import java.util.Arrays;
import java.util.Random;

public class EX7 {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        
        int[] aleatorios = new int[50];
        int[] contagem = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] soma = new int[10];
        
        for(int c = 0; c < aleatorios.length; c++){
            aleatorios[c] = rand.nextInt(10) + 1;
        }
        Arrays.sort(aleatorios);
        
        for(int c = 0; c < aleatorios.length; c++){
        System.out.print(aleatorios[c] +  " ");
        }
        System.out.println("\n");
        
        for(int i = 0; i < aleatorios.length; i++){
              
            for(int c = 0; c < contagem.length; c++){  
                    if(aleatorios[i] == contagem[c]){
                        soma[c] += 1;
                    }
            }  
        }
        
        for(int c = 0; c < contagem.length; c++){
            System.out.println("\nQuantidade de numeros " + (c+1) + ": " + soma[c]);
        }
        
        System.out.println("\n");
    }
}
