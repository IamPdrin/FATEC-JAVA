package estoque;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	private boolean status = false;
	
	//Método Construtor:
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	void ligar () {
		if (status == false) {
			status = true;
			System.out.println("Ligando...");
		}
		else {
			System.out.println("Já estou ligado!");
		}
	}
	
	void desligar () {
		if (status == true) {
			status = false;
			System.out.println("Desligando...");
		}
		else {
			System.out.println("Já estou desligado!");
		}
	}
	
	void conectarWifi () {
		System.out.println("Buscando Endereço de IP...Conectado!");
	}
	
	void vestir () {
		System.out.println("Parece que essa calça ficou boa em você!");
	}

	
	
	//Getters e Setters:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
