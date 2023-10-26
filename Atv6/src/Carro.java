public class Carro {
    //Atributos:
    public String marca;
    public String modelo;
    public String motor;
    public int ano;
    public double tanque;
    public double velocidade = 0;
    public boolean status = false;
    public boolean statusMotor = false;

    //Construtor:
    public Carro(String marca, String modelo, String motor, int ano, double tanque){
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.ano = ano;
        this.tanque = tanque;
    }


    //Funções:
    public void girarChave () {
            if(status == false){
                status = true;
                System.out.println("Ligou\n");
            }
            else {
                status = false;
                System.out.println("Desligou\n");
            }
    }

    public int abastecer (double gasolina){
        double litros = 0;
        litros = this.tanque;
        double res = litros * gasolina;
        
        System.out.println("A capacidade maxima do tanque do " + this.marca + " " + this.modelo + " é de " + this.tanque + " litros.");        
        System.out.println("O valor para encher o tanque é de R$" + res + "\n");
        
        return 0;
    }
        
    public double acelerar(){
        if(statusMotor == true){
            this.velocidade+=20;
        }
        return this.velocidade;
    }
        
    public double frear(){
        this.velocidade-=20;
        return this.velocidade;
    }
        
    public double getVelocidade(){
        return this.velocidade;
    }
        
    public void setVelocidade(double vel){
        this.velocidade += vel;
    }
    
}