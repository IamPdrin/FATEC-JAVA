package gerenciamentoContato;

public class Pessoal extends Contato {

	public Pessoal(String nome, int telefone, String email) {
		super(nome, telefone, email);
		
	}
	
	@Override
	public void ligar () {
		System.out.println("Ligando para fofocar com " + getNome());
	}
	
	@Override
	public void desligar() {
		System.out.println("Desligando na cara de " + getNome());
	}
	
	public void mandarMensagem () {
		System.out.println("Mandando mensagens para " + getNome());
	}
	
}
