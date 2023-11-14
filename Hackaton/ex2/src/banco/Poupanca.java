package banco;

public class Poupanca extends Conta{
	
	
	
	Poupanca(int conta, String titular, double saldo){
		super(conta,titular,saldo);
	}
	
	void saque(double valor) {
		
		System.out.println("Você não tem permissão de saque");
	}
	
	
	void transferencia(Conta conta, double valor) {
		if(this.saldo >= valor) {
				
		this.saldo -= valor;
		conta.deposito(valor);
		}
	}
	}

