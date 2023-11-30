package gerenciamentoVeiculo;

public class Moto extends Veiculo {

	public Moto(String marca, Double preco, int ano) {
		super(marca, preco, ano);
	}
	
	void ligar (boolean motor) {
		if (isStatus() == false && motor == true) {
			setStatus(true);
			System.out.println("A moto " + getMarca() + " possui motor. Ligando moto!");
		}
		else if (motor == false){
			System.out.println("A moto " + getMarca() + " nao possui motor, nao e possivel ligar!");
		}
		else {
			System.out.println("A moto ja esta ligada!");
		}
	}
	
	@Override
	void desligar () {
		if (isStatus() == false) {
			System.out.println("A moto " + getMarca()  + " ja esta desligada!");
		}
		else {
			setStatus(false);
			System.out.println("Desligando moto...");
		}
	}
}
