package gerenciamentoContato;

public class Profissional extends Contato {

	public Profissional(String nome, int telefone, String email) {
		super(nome, telefone, email);
	}
	
	public void ligar (int telefone) {
		if (telefone != getTelefone()) {
			System.out.println("\tLigando para " + telefone);
		}
		else {
			System.out.println("\tNao e possivel ligar para si mesmo");
		}
	}
	
	public void desligar (int telefone) {
		if (telefone != getTelefone()) {
			System.out.println("\tDesculpe mas " + getNome() + " precisa desligar!");
		}
		else {
			System.out.println("\tNao e possivel desligar chamadas com voce proprio(a)");
		}
	}
	
	
	public void enviarMensagem(String email) {
		if (email != getEmail()) {
			System.out.println("\tEnviando email para " + email);
		}
		else {
			System.out.println("\tNao e possivel enviar emails para si mesmo!");
		}
	}

}
