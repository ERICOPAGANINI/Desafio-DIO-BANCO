package BancoDIO;

public class Main {

	public static void main(String[] args) {
		Cliente erico = new Cliente();
		erico.setNome("ERICO");
		Cliente dapheely = new Cliente();
		dapheely.setNome("DAPHEELY");

		Conta cc = new ContaCorrente(erico);
		Conta poupanca = new ContaPoupanca(erico);
		
		Conta cc2 = new ContaCorrente(dapheely);
		Conta poupança2 = new ContaPoupanca(dapheely);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc2.imprimirExtrato();
		poupança2.imprimirExtrato();
	}
	

}
