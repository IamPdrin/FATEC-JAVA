package Biblioteca;

public class Usuario {
	protected int id;
	protected String nome;
	protected int numEmp = 0;
	public int diaEmp;
	public int prazoDev;
	

	public int emprestimo () {
		diaEmp = 9;
		numEmp += 1;
		return numEmp;
	}
	
	protected int devolucao () {
		numEmp -= 1;
		return numEmp;
	}
	
	protected int renovacao () {
		System.out.println("Prazo renovado!");
		return prazoDev += 10;
	}

	
	
	//Getters & Setters:
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(int numEmp) {
		this.numEmp = numEmp;
	}

	public int getPrazoDev() {
		return prazoDev;
	}

	public void setPrazoDev(int prazoDev) {
		this.prazoDev = prazoDev;
	}
	
	
	
}
