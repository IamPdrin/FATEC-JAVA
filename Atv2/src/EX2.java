import java.util.Random;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();
        
        int aleatorio, num;
        
        aleatorio = rand.nextInt(100);
        System.out.println("Advinhe o numero");
        
        for(int i = 0; i < 100; i++){
            System.out.println("Digite um numero: ");
            num = ler.nextInt();
            
            if(num < aleatorio){
                System.out.println("Baixo\n");
            }
            else if (num > aleatorio){
                 System.out.println("Alto\n");
            }
            else if (num == aleatorio){
                System.out.println("\nResposta correta! O numero gerado era: " + aleatorio);
                break;
            }
        }
        ler.close();
    }
}

