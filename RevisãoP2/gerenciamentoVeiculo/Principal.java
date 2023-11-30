package gerenciamentoVeiculo;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Carro jetta = new Carro("VolksWagen Jetta", 200000.00, 2020);
		Moto hornet = new Moto("Honda Hornet", 44000.00, 2022);
		Veiculo veiculo = new Veiculo("Veiculo Qualquer", 1000.00, 2023);
		
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		veiculos.add(jetta);
		veiculos.add(hornet);
		veiculos.add(veiculo);
		
		for (Veiculo v : veiculos) {
			System.out.println("\nAutomovel " + v.getMarca() + ": ");
			v.ligar();
			v.desligar();
		}
		
		System.out.println("\nTeste de Métodos Sobrecarregados: ");
		jetta.ligar(true, true);
		hornet.ligar(true);
	}

}
