package Biblioteca;
public class Aluno extends Usuario {
	
	public Aluno (int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public int emprestimo () {
		numEmp += 1;
		prazoDev += 20;
		if (numEmp > 2) {
			System.out.println("Nao e possivel realizar mais emprestimos!");
			return numEmp = 2;
		}
		else {
			System.out.println("Emprestimo realizado com sucesso!");
			return numEmp;
		}
	}
	
	public int devolucao () {
			if (numEmp > 0 && prazoDev <= 19) {
				System.out.println("Devolucao realizada com sucesso!");
				numEmp -= 1;
			}
			else if (numEmp > 0 && prazoDev > 19) {
				System.out.println("Voce recebeu uma multa!");
				numEmp -= 1;
				prazoDev = 10;
			}
			else {
				System.out.println("Voce nao possui livros para devolver! ");
				prazoDev = 0;
			}
			return numEmp;
	}
}


