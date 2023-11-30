package estoque;

//Herança:
public class Eletronico extends Produto {

	public Eletronico(String nome, double preco, int quantidade) {
		super(nome, preco, quantidade);
	}

	//Polimorfismo (modificação de comportamento no SYSOUT):
	void Ligar () {
		if (isStatus() == false) {
			setStatus(true);
			System.out.println("Sou um produto eletronico, por isso estou ligando...");
		}
		else {
			System.out.println("Sou um produto eletronico que ja esta ligado!");
		}
	}
	
	//Polimorfismo (Sobrecarga: modificação da assinatura do método):
	void Ligar (boolean bateria) {
		if (bateria == true) {
			System.out.println("Ainda tem bateria, ligando..");
		}
		else {
			System.out.println("Acabou a bateria");
		}
	}
	
	
	void Desligar () {
		if (isStatus() == true) {
			setStatus(false);
			System.out.println("Sou um produto eletronico, por isso estou desligando...");
		}
		else {
			System.out.println("Sou um produto eletronico que ja esta desligado!");
		}
	}
	
	void conectarWifi() {
		System.out.println("Nao sou capaz de me conectar ao Wifi, nao sou um produto Smart!");
	}
	
	void vestir () {
		System.out.println("Nao sou uma roupa!");
	}
}
