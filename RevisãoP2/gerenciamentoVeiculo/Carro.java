package gerenciamentoVeiculo;

public class Carro extends Veiculo{

	public Carro(String marca, Double preco, int ano) {
		super(marca, preco, ano);
	}
	

	void ligar (boolean motor, boolean gasolina) {
		if (isStatus() == false && motor == true && gasolina == true) {
			setStatus(true);
			System.out.println("Ligando carro!");
		}
		else if (isStatus() == true) {
			System.out.println("O  carro ja esta ligado!");
		}
		else {
			System.out.println("O carro esta sem gasolina");
		}
	}
	
	@Override
	void desligar () {
		if (isStatus() == false) {
			System.out.println("O carro ja esta desligado!");
		}
		else {
			setStatus(false);
			System.out.println("Desligando carro...");
		}
	}
	
}
