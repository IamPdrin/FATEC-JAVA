package banco;

public class Corrente extends Conta{
double cheque;
	
	
	Corrente(int conta, String titular, double saldo, double cheque){
		super(conta,titular,saldo);
	}
	
	
	void saque(double valor) {
		
		if( saldo + cheque >= valor) {
			saldo = saldo - valor;
			System.out.println("Você realizou o saque de :" + valor);
		}else {
			System.out.println("Você é pobre, não sacou");
		}
	}
}
