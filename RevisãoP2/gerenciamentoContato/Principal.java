package gerenciamentoContato;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Contato c1 = new Contato("Qualquer", 000000000, "qualquer@email.com");
		Pessoal p1 = new Pessoal("Fernando", 991688270, "fer@gmail.com");
		Profissional pro1 = new Profissional("Matheus", 991663735, "matheusLima@out.com");
		
		
		ArrayList<Contato> contatos = new ArrayList<Contato>();
		contatos.add(c1);
		contatos.add(p1);
		contatos.add(pro1);
		
		System.out.println("Mostrando todos contatos: \n");
		for (Contato x : contatos) {
			System.out.println(x.getNome());
		}
		
		System.out.println("\nTeste de metodos: \n");
		for (Contato contato : contatos) {
			contato.desligar();
			contato.ligar();
			contato.enviarMensagem();
		}
		
		System.out.println("\nTestando metodos sobrecarregados: \n");
		System.out.println("Caso o numero/email seja igual ao objeto da classe: ");
		pro1.ligar(991663735);
		pro1.desligar(991663735);
		pro1.enviarMensagem("matheusLima@out.com");
		
		System.out.println("\nCaso o numero/email seja diferente: ");
		pro1.ligar(994321011);
		pro1.desligar(994321011);
		pro1.enviarMensagem("pedrinhoGameplays@out.com");
		
	}

}
