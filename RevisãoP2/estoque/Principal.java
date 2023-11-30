package estoque;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Eletronico caixaDeSom = new Eletronico("JBL PartyBox", 350.0, 100);
		Smart telefone = new Smart("Iphone 15", 7500.0, 500);
		Roupa camiseta = new Roupa("Polo", 100.0, 100);
		
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(caixaDeSom);
		produtos.add(telefone);
		produtos.add(camiseta);
		
		for (Produto produto : produtos) {
			System.out.println("\nProduto " + produto.getNome() + ":");
			produto.ligar();
			produto.desligar();
			produto.conectarWifi();
			produto.vestir();
			
		}
		System.out.println("\nTeste de Metodos Sobrecarregados: ");
		caixaDeSom.Ligar(false);
		telefone.conectarWifi("123", "123");
	}

}
