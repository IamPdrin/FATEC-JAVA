public class Main {
    public static void main(String[] args) throws Exception {
        
        Carro car1 = new Carro("Porsche", "Panamera", "V8 biturbo 620cv", 2023, 80.00);  

        System.out.println("Função de girar chave: \n");
        //Ligando carro:
        car1.girarChave();
        //Desligando carro:
        car1.girarChave();
        //Ligando novamente:
        car1.girarChave();

        System.out.println("Função de acelerar: \n");
        //Acelerando carro:
        car1.acelerar();

        System.out.println("Função de calcular o valor para encher o tanque: \n");
        //Calculando o valor para encher o tanque
        car1.abastecer(5.75);
        
    }
}
