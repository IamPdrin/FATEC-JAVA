package gestaoFuncionario;
//Classe pai (contém os atributos e métodos em sua forma primitiva):
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
	
	//Método a sofrer polimorfismo:
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

	//Getters e Setters:
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
