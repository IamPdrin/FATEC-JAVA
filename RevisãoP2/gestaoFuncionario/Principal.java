package gestaoFuncionario;

//Importação da classe ArrayList:
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//Criação de ArrayList, de Objetos de cada uma das classes e armazenamento:
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Funcionario("Zeca", 23, "Faxineiro"));
		funcionarios.add(new Gerente("Ricardo", 25, "Gerente"));
		funcionarios.add(new Desenvolvedor("Denis", 18, "Desenvolvedor"));
		
		//Foreach para mostrar todos os Funcionarios criados:
		for (Funcionario funcionario : funcionarios) {
			funcionario.Trabalhar();
		}
	}	
}
