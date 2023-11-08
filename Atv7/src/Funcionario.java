import java.util.Date;
import java.util.Random;

public class Funcionario {
    //Atributos:
    protected int id;
    public String nome;
    public Random rand = new Random();
    public Date dataHoraAtual = new Date();

    //Métodos:
    public void baterPonto(){
        System.out.println("Expediente encerrado: " + dataHoraAtual);
    }

    public void fecharCaixa(){
        System.out.println("Caixa fechado\nEntradas e Saídas do dia: R$" + rand.nextInt(1000));
    }

    public void realizarVenda(){
        System.out.println("Venda realizada!\nValor total: R$" + rand.nextInt(1000));
    }

    public void solicitarMaterial(){
        System.out.println("Solicitando material..");
    }

    //Getters:
    public String getNome(){
        return this.nome;
    }

    public int getId(){
        return this.id;
    }
}
