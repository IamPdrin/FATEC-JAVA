package Biblioteca;
public class Professor extends Usuario {
	
	public Professor (int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	
	
	public int emprestimo () {
		numEmp += 1;
		if (numEmp > 10) {
			System.out.println("O professor esta autorizado a pegar apenas 10 livros");
			prazoDev = 10; 
			return numEmp = 10;
		}
		else {
			System.out.println("Emprestimo realizado com sucesso!");
			prazoDev = 10; 
			return numEmp;
		}
	}
		
		public int devolucao () {
			if (numEmp == 0) {
				System.out.println("Voce nao possui livros para devolver! ");
				prazoDev = 0;
			}
			else {
				numEmp -= 1;
				prazoDev = 10;
				System.out.println("Devolucao realizada com sucesso!");
			}
			return numEmp;
	}
}
