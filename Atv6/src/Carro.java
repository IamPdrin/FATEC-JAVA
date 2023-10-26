public class Carro {
    //Atributos:
    public String marca;
    public String modelo;
    public String motor = null;
    public int ano;
    public double tanque;
    public double tanqueAtual = 0;
    public double velocidade = 0;
    public boolean status = false;


    //Construtor:
    public Carro(String marca, String modelo, String motor, int ano, double tanque){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.ano = ano;
        this.tanque = tanque;
    }


    //Funções:
    public void verificarMotor(){
        if(this.motor != null){
            System.out.println("O carro possui motor!\n");
            System.out.println("Motor: " + this.motor);
        }
        else {
            System.out.println("O carro nao possui motor!\n");
        }
    }

    public void girarChave () {
        if(status == false && this.motor != null){
            status = true;
            System.out.println("Ligou");
        }
        else if (this.motor == null){
            System.out.println("O carro nao possui motor, nao e possivel ligar!");
        }
        else{
            status = false;
            System.out.println("Desligou");
        }
    }

    public void abastecer (double gasolina){
        double litros = this.tanque;
        double res = litros * gasolina;
        
        System.out.println("A capacidade maxima do tanque do " + this.marca + " " + this.modelo + " é de " + this.tanque + " litros.");        
        System.out.println("O valor para encher o tanque e de R$" + res + "\n");
        System.out.println("Abastecendo..");

        if (this.tanqueAtual <= 80 && this.velocidade == 0){
            this.tanqueAtual = 80;
        }
        else if (this.velocidade > 0){
            System.out.println("Pare o carro para abastecer!");
        }
        else {
            System.out.println("O tanque ja esta cheio.");
        }
    }
        
    public double acelerar(){
        if(this.status == true && this.tanqueAtual > 0 && this.velocidade >= 0 && this.velocidade < 180){
            System.out.println("Acelerando..");
            this.velocidade+=20;
            this.tanqueAtual-=5;
        }
        else if (this.status == false){
            System.out.println("Para acelerar, ligue o carro primeiro!");
        }
        else if (this.velocidade >= 180.0){
            System.out.println("O carro atingiu sua velocidade maxima");
            this.status = false;
        }
        else {
            System.out.println("O carro esta sem gasolina");
        }
        return this.velocidade;
    }
        
    public double frear(){
        if(this.velocidade > 0){
            this.velocidade-=30;
        }
        if (this.velocidade < 0){
            this.velocidade = 0;
        }
        else{
            System.out.println("Nao e possivel frear se o carro estiver parado!");
        } 
        return this.velocidade;
    }
        
    public double getVelocidade(){
        return this.velocidade;
    }

    public double getTanqueAtual(){
        return this.tanqueAtual;
    }
}