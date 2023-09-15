import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) throws Exception {
        String senha_p="python123", senha="";
        Scanner ler = new Scanner(System.in);
        
        while(senha_p != senha){
            System.out.println("Digite a senha: ");
            senha = ler.nextLine();

            if(senha_p.equals(senha)){
                System.out.println("Logado! ");
                break;
            }
            else{
                System.out.println("Senha incorreta, tente novamente! ");
            }
        }
        ler.close();
    }
}
