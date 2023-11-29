package gestaoFuncionario;

public class Funcionario {
	private String nome;
	private int idade;
	private String funcao;
	private boolean status = false;
	
	Funcionario (String nome, int idade, String funcao){
		this.nome = nome;
		this.idade = idade;
		this.funcao = funcao;
	}
	
	void Trabalhar() {
		if (status == false) {
			status = true;
			System.out.println("Trabalhando...");
		}
		else {
			System.out.println("Parei de trabalhar..");
			status = false;
		}
	}
}
