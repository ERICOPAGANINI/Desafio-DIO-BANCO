package BancoDIO;

public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
	}
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("\nExtrato Conta Poupança");
		super.imprimirInformacoesComuns();
	}


}
