package banco;

public class Conta {
int conta;
double saldo;
String titular;


Conta(int conta, String titular, double saldo){
	this.conta = conta;
	this.titular = titular;
	this.saldo = saldo;
	
}

void saque(double valor) {
	
	if( saldo >= valor) {
		saldo = saldo - valor;
		System.out.println("Voc� realizou o saque de :" + valor);
	}else {
		System.out.println("Voc� � pobre, n�o sacou");
	}
}

void deposito(double deposito) {
	
	saldo = saldo + deposito;
	System.out.println("voce tirou dinheiro do cara");
}

void transferencia(Conta conta, double valor) {
	if(this.saldo >= valor) {
			
	this.saque(valor);
	conta.deposito(valor);
	}
}
}
