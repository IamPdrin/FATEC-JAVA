import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) throws Exception {
        int idade;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = ler.nextInt();
        ler.close();
        
        if (idade < 18){
            System.out.println("Menor de idade!");
        }
        else if (idade >= 18 && idade < 60){
             System.out.println("Adulto!");
        }
        else {
             System.out.println("Idoso! ");
        }
    }
}
