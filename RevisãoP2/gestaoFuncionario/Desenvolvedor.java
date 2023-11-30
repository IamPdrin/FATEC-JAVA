package gestaoFuncionario;

//Herança:
public class Desenvolvedor extends Funcionario {

	Desenvolvedor(String nome, int idade, String funcao) {
		super(nome, idade, funcao);
	}
	
	//Polimorfismo(Sobrescrita):
	@Override
	void Trabalhar () {
		//Encapsulamento (Atributo privado criado na classe pai necessita de getters e setters para ser acessado):
		System.out.println("O desenvolvedor " + getNome() + " esta programando!");
	}
}
