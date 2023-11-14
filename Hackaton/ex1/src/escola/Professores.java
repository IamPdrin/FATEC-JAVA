package escola;

public class Professores extends Membros {
protected String disciplina;
protected double notaAtual;
 Professores(int id, String nome){
	super( id, nome);
	}
 
 void atribuirNota(Alunos aluno, double notaAtual){
	  aluno.setNotaAtual(notaAtual); //chamar atraves do set nota 
 }
 
}
