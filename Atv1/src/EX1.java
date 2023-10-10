import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) throws Exception {
        int idadee;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = leer.nextInt();
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
