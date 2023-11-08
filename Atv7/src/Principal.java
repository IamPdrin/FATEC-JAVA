import java.util.Scanner;
import java.util.Random;

public class Principal {
    public static void main(String[] args) throws Exception {
        int escolha = 0;
        Scanner ler = new Scanner(System.in);
        Random rand = new Random();
        Console cons = new Console();
        
        
        System.out.println("-------------------------");
        System.out.println(" SELETOR DE FUNCIONARIOS ");
        System.out.println("-------------------------");
        System.out.println(" [1] Gerente\n [2] Vendedor\n [3] Faxineiro\n");
        escolha = ler.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("AREA DE CADASTRAMENTO DE GERENTES");
                System.out.println("---------------------------------");

            
                System.out.print("Digite seu nome: ");
                String nm_g1 = ler.nextLine();  
                nm_g1 = ler.nextLine();
                int id_g1 = rand.nextInt(100);
                Gerente g1 = new Gerente(id_g1, nm_g1);
                cons.limparConsole();

                int escolha1 = 0;
                do {
                    System.out.println("Ola, gerente " + g1.getNome() + "!\n");
                    System.out.println("Selecione a funcao que deseja executar: \n\n [1] Visualizar Id \n\n [2] Bater Ponto \n\n [3] Solicitar Material \n\n [4] Sair\n");
                    escolha1 = ler.nextInt();

                        switch (escolha1) {
                            case 1:
                                cons.limparConsole();
                                System.out.println(g1.getId()); 
                                ler.nextLine();
                                ler.nextLine();
                                cons.limparConsole();
                                break;
                            case 2:
                                cons.limparConsole();
                                g1.baterPonto();
                                ler.nextLine();
                                ler.nextLine();
                                cons.limparConsole();
                                break;
                            case 3: 
                                cons.limparConsole();
                                g1.solicitarMaterial();
                                ler.nextLine();
                                ler.nextLine();
                                cons.limparConsole();
                                break;
                            case 4: 
                                break;
                            default:
                                System.out.println("Digite uma opcao valida!");
                                break;
                            }
                } while(escolha1 != 4);
                break;
            case 2:
                System.out.println("AREA DE CADASTRAMENTO DE VENDEDORES");
                System.out.println("-----------------------------------");

                System.out.print("Digite seu nome: ");
                String nm_v1 = ler.nextLine();
                nm_v1 = ler.nextLine();
                int id_v1 = rand.nextInt(100);
                Vendedor v1 = new Vendedor(id_v1, nm_v1);
                        
                cons.limparConsole();
                        
                int escolha2 = 0;
                do {
                    System.out.println("Ola, vendedor(a) " + v1.getNome() + "!\n");
                    System.out.println("Selecione a funcao que deseja executar: \n\n [1] Visualizar Id \n\n [2] Bater Ponto \n\n [3] Relizar Venda \n\n [4] Fechar Caixa \n\n [5] Sair \n");
                    escolha2 = ler.nextInt();

                    switch (escolha2) {
                        case 1:
                            cons.limparConsole();
                            System.out.println(v1.getId());
                            ler.nextLine();
                            ler.nextLine();
                            cons.limparConsole();
                            break;
                        case 2:
                            cons.limparConsole();
                            v1.baterPonto();
                            ler.nextLine();
                            ler.nextLine();
                            cons.limparConsole();
                            break;
                        case 3: 
                            cons.limparConsole();
                            v1.realizarVenda();
                            ler.nextLine();
                            ler.nextLine();
                            cons.limparConsole();
                            break;
                        case 4:
                            cons.limparConsole();
                            v1.fecharCaixa();
                            ler.nextLine();
                            ler.nextLine();
                            cons.limparConsole();
                            break;
                        case 5: 
                            break;
                        default:
                            System.out.println("Digite uma opcao valida!");
                            break;
                    }
                } while(escolha2 != 5);
                break;
            case 3:
                System.out.println("AREA DE CADASTRAMENTO DE FAXINEIROS");
                System.out.println("-----------------------------------");

                System.out.print("Digite seu nome: ");
                String nm_f1 = ler.nextLine();
                nm_f1 = ler.nextLine();
                int id_f1 = rand.nextInt(100);
                        
                cons.limparConsole();

                Faxineiro f1 = new Faxineiro(id_f1, nm_f1);
                        
                int escolha3 = 0;
                do {
                    System.out.println("Ola, faxineiro(a) " + f1.getNome() + "!\n");
                    System.out.println("Selecione a funcao que deseja executar: \n\n [1] Visualizar Id \n\n [2] Bater Ponto \n\n [3] Sair\n");
                    escolha3 = ler.nextInt();

                    switch (escolha3) {
                        case 1:
                            cons.limparConsole();
                            System.out.println(f1.getId());
                            ler.nextLine();
                            ler.nextLine();
                            cons.limparConsole();
                            break;
                        case 2:
                            cons.limparConsole();
                            f1.baterPonto();
                            ler.nextLine();
                            ler.nextLine();
                            cons.limparConsole();
                            break;
                        case 3:
                            break;
                        default:
                            cons.limparConsole();
                            System.out.println("Digite uma opcao valida!");
                            break;
                    }
                } while(escolha3 != 3);
                break;
            default:
                System.out.println("Digite uma opcao valida!");
                break;
            }
            ler.close();
    }
}
