import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) throws Exception {
        String[] nomes = new String[5];
        String nome;
        Scanner ler = new Scanner(System.in);
        boolean flag = false;
        
        for(int i=0; i < nomes.length; i++){
            System.out.print("Digite " + (i+1) + " nome: \n");
            nomes[i] = ler.nextLine();
        }
    
        System.out.println("Digite mais um nome:");
        nome = ler.nextLine();
        ler.close();

        for(int i=0; i < nomes.length; i++){
            
                if(nomes[i].equals(nome)){
                    flag = true;
                    break;
                }         
        }

        if (flag == true){
                    System.out.println("O nome " + nome + " foi encontrado!");
        }
        else if (flag == false){
            System.out.println("O nome " + nome + " nao foi encontrado!");
        }
    }
}
