import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        
        Carro car1 = new Carro("Porsche", "Panamera", "V8 biturbo 620cv", 2023, 80.00);
        Console cons = new Console();
        
        Scanner ler = new Scanner(System.in);        
        int escolha = 0;

        do {
            System.out.println("--------------------------------");
            System.out.println("      POO: Encapsulamento       ");
            System.out.println("         Class: Carro           ");
            System.out.println("--------------------------------");

            System.out.println("--------------------------------");
            System.out.print("Status: ");
            if(car1.status == true){
                System.out.println("O carro esta ligado");
                System.out.println("Gasolina: " + car1.getTanqueAtual());
                System.out.println("Velocidade: " + car1.getVelocidade());
            }
            else{
                System.out.println("O carro esta desligado");
            }
            System.out.println("--------------------------------");

            System.out.println("\nEscolha uma das opções abaixo: ");
            System.out.println("  1-Verficar Motor\n  2-Ligar/Desligar Carro\n  3-Acelerar Carro\n  4-Frear Carro\n  5-Encher o tanque\n  6-Sair do carro\n");
            escolha = ler.nextInt();

            switch(escolha){
                case 1:
                    //Verificando se o atributo motor foi preenchido:
                    car1.verificarMotor();
                    break;

                case 2:
                    //Ligando/Desligando carro:
                    car1.girarChave();
                    break;

                case 3:
                    //Acelerando carro:
                    car1.acelerar();
                    break;

                case 4:
                    //Freando carro:
                    car1.frear();
                    break;

                case 5:
                    //Calculando o valor para encher o tanque
                    car1.abastecer(5.75);
                    break;

                case 6:
                    System.out.println("Saindo do carro..\n");
                    break;

                default:
                    System.out.println("Opcao invalida.\n");
            }

            System.out.print("\nContinue(Enter)..");
            ler.nextLine();
            ler.nextLine();
            cons.limparConsole();

        } while (escolha != 6);

        ler.close();

    }
}
