public class Aplicativo {
    String linguagemProgApp;
	String nomeApp;
	String interfaceApp;
	String tamanhoApp; 
	double versaoApp;
	boolean aberto = false;

	void abrir() {
		System.out.print("Abrindo..");
		aberto = true;
		System.out.print("Aberto");
	}
	
	void fechar(){
		System.out.print("Fechando...");
		aberto = false;
		System.out.print("Fechado");
	}

	void armazenarDados() {
		System.out.println("Armazenando dados..");
	}
	
	void atualizar() {
		System.out.println("Atualizando...");
	}
}
