package estoque;

public class Roupa extends Produto {

	public Roupa(String nome, double preco, int quantidade) {
		super(nome, preco, quantidade);
	}
	
	
	void Vestir () {
		System.out.println("Isso ficou bem demais em voce!");
	}
	
	void Ligar () {
		System.out.println("Nao sou um produto eletronico!");
	}
	
	void Ligar (boolean bateria) {
		System.out.println("Nao sou um produto eletronico!");
	}
	
	void Desligar () {
		System.out.println("Nao sou um produto eletronico!");
	}
	
	void conectarWifi () {
		System.out.println("Nao sou um produto eletronico!");
	}
	
	void conectarWift (String rede, String senha) {
		System.out.println("Nao sou um produto eletronico!");
	}
}
