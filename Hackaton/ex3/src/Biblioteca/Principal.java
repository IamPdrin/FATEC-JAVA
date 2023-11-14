package Biblioteca;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Aluno al1 = new Aluno (123, "Dutra");
		Professor p1 = new Professor (124, "Alessandro");
		Scanner ler = new Scanner(System.in);
		int escolha1 = 0;
		int escolha2 = 0;
		int escolha = 0;
		
		System.out.println("Voce e um..\n1- Aluno\n2- Professor\n");
		escolha = ler.nextInt();
		
		switch(escolha) {
		case 1:
			do {
			System.out.println("Seja bem vindo, aluno " + al1.getNome() + "!");
			System.out.println("ID: " + al1.getId());
			System.out.println("Numero de livros: " + al1.getNumEmp());
			System.out.println("Prazo: daqui a " + al1.getPrazoDev());
			
			System.out.println("\nSelecione a opcao que deseja realizar!\n1-Emprestimo\n2-Devolucao\n3-Renovaocao\n4-Sair\n");
			escolha1 = ler.nextInt();
			switch(escolha1) {
				case 1:
					al1.emprestimo();
					System.out.println("\n");
					break;
				case 2: 
					al1.devolucao();
					System.out.println("\n");
					break;
				case 3:
					al1.renovacao();
					System.out.println("\n");
					break;
			}
			} while (escolha1 != 4);
			break;
		case 2:
			do {
			System.out.println("Seja bem vindo, Professor " + p1.getNome() + "!\n");
			System.out.println("ID: " + p1.getId());
			System.out.println("Numero de livros: " + p1.getNumEmp());
			System.out.println("Prazo: daqui a " + p1.getPrazoDev());
			System.out.println("\nSelecione a opcao que deseja realizar!\n1-Emprestimo\n2-Devolucao\n3-Renovaocao\n4-Sair\n");
			escolha2 = ler.nextInt();
			switch(escolha2) {
				case 1:
					p1.emprestimo();
					System.out.println("\n");
					break;
				case 2:
					p1.devolucao();
					System.out.println("\n");
					break;
				case 3:
					p1.renovacao();
					System.out.println("\n");
					break;
				}
			} while (escolha2 != 4);
			break;
		}
		ler.close();
	}
}
