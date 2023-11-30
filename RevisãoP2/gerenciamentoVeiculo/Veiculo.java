package gerenciamentoVeiculo;

public class Veiculo {
	private String marca;
	private Double preco;
	private int ano;
	private boolean status = false;
	private boolean motor = false;
	
	//Método Construtor:
	public Veiculo(String marca, Double preco, int ano) {
		this.marca = marca;
		this.preco = preco;
		this.ano = ano;
	}

	void ligar () {
		if (status == false) {
			status = true;
			System.out.println("Ligando..");
		}
		else {
			System.out.println("O automovel ja esta ligado!");
		}
	}
	
	void desligar () {
		if (status == false) {
			System.out.println("O automovel ja esta desligado!");
		}
		else {
			status = false;
			System.out.println("Desligando automovel...");
		}
	}
	
	
	//Getters e Setters:
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
}
