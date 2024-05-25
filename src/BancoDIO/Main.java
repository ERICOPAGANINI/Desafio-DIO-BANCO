package BancoDIO;

public class Main {

	public static void main(String[] args) {
		Cliente erico = new Cliente();
		erico.setNome("ERICO");

		Conta cc = new ContaCorrente(erico);
		Conta poupanca = new ContaPoupanca(erico);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
