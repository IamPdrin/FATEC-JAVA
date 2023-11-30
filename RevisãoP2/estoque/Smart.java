package estoque;

public class Smart extends Produto{

	public Smart(String nome, double preco, int quantidade) {
		super(nome, preco, quantidade);
	}
	
	void Ligar () {
		if (isStatus() == false) {
			setStatus(true);
			System.out.println("Produto Smart Ligando");
		}
		else {
			System.out.println("Produto Smart ja esta ligado!");
		}
	}
	
	void desligar () {
		if (isStatus() == true) {
			setStatus(false);
			System.out.println("Sou um produto eletronico, por isso estou desligando...");
		}
		else {
			System.out.println("Sou um produto eletronico que ja esta desligado!");
		}
	}
	
	void conectarWifi (String rede, String senha) {
		if (rede == "123" && senha == "123") {
			System.out.println("Conectado!");
		}
		else {
			System.out.println("Senha ou nome da rede incorreto(s)!");
		}
	}
	
	void vestir () {
		System.out.println("Nao sou uma roupa!");
	}
}
