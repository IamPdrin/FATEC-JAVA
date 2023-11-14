package escola;

public class Alunos extends Membros {
	private Disciplina disciplina;


	Alunos(int id, String nome,  Disciplina disciplina){
		super(id, nome);
		this.disciplina = disciplina;
	
	}
	
	public double getNotaAtual() {
		return notaAtual;
	}

	public void setNotaAtual(double notaAtual) {
		this.notaAtual = notaAtual;
	}

	public String historico;
	private double notaAtual;
	

	 void gerarHistorico() { 
		System.out.println( disciplina.nomeDisciplina + notaAtual);
		 }
		 	
	}
		 

