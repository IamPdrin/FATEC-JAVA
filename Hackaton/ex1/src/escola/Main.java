package escola;

public class Main {

	public static void main(String[] args) {
		Disciplina disciplina1 = new Disciplina("Programacao");
		Alunos aluno1 = new Alunos(932, "Luna", disciplina1); //aluno n pode setar nota 
		Professores professor1 = new Professores(01, "Alessandro");
		professor1.atribuirNota(aluno1, 7);
		aluno1.gerarHistorico();
		
	}

}
