package BancoDIO;

public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	private int agencia;
	private int numeroConta;
	private Cliente cliente;
	private double saldo;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public Conta() {
	}

	public Conta(int agencia, int numeroConta, Cliente cliente) {

		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInformacoesComuns() {
		System.out.printf("Titular %s\n", this.cliente.getNome());
		System.out.printf("Agencia %d\n", this.agencia);
		System.out.printf("Conta %d\n", this.numeroConta);
		System.out.printf("Saldo %.2f\n", this.saldo);
	}


}
