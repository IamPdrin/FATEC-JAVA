package gerenciamentoContato;

public class Contato {
	private String nome;
	private int telefone;
	private String email;
	
	
	//Construtor:
	public Contato(String nome, int telefone, String email) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public void ligar () {
		System.out.println("Ligando...");
	}
	
	public void desligar () {
		System.out.println("Desligando chamada...");
	}
	
	public void enviarMensagem() {
		System.out.println("Enviando mensagem...");
	}
	

	//Getters e Setters:
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getTelefone() {
		return telefone;
	}



	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
