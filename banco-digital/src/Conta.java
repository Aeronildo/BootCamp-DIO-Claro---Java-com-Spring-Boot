public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		if (valor <= 0) {
			throw new ValorInvalidoException("O valor de saque deve ser positivo.");
		}
		if (valor > saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
		}
		saldo -= valor;
		System.out.println("Saque realizado com sucesso.");
	}

	@Override
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new ValorInvalidoException("O valor de depósito deve ser positivo.");
		}
		saldo += valor;
		System.out.println("Depósito realizado com sucesso.");
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		if (valor <= 0) {
			throw new ValorInvalidoException("O valor de transferência deve ser positivo.");
		}
		if (valor > saldo) {
			throw new SaldoInsuficienteException("Saldo insuficiente para realizar a transferência.");
		}
		this.sacar(valor); // O método sacar já realiza as validações necessárias
		contaDestino.depositar(valor);
		System.out.println("Transferência realizada com sucesso.");
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
