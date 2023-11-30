package gestaoFuncionario;

//Herança:
public class Desenvolvedor extends Funcionario {

	Desenvolvedor(String nome, int idade, String funcao) {
		super(nome, idade, funcao);
	}
	
	//Polimorfismo(Sobrescrita):
	@Override
	void Trabalhar () {
		System.out.println("O desenvolvedor " + getNome() + " esta programando!");
	}
}
