package banco;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Digite um valor para sacar");
		//valor = ler.nextDouble();
		Poupanca poupanca1 = new Poupanca(1324,"ok",21);
		Conta conta1 = new Conta(1234, "Luna", 12354.32);
		Corrente corrent1 = new Corrente(1234,"ok",12324,838);
		
		
		poupanca1.transferencia(conta1 , 10);
		corrent1.transferencia(conta1, 15);
		poupanca1.saque(12);
		poupanca1.deposito(21);
		
		corrent1.transferencia(conta1, 12);
		corrent1.saque(14);
		corrent1.deposito(42);
		
		
		
		
	}

}
