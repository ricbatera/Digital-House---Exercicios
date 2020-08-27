package contas;

public abstract class Conta {
	private int numConta;
	private double saldo;
	
	public Conta() {
	}

	public Conta(double saldo, int numConta) {
		this.saldo = saldo;
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	
	
}
