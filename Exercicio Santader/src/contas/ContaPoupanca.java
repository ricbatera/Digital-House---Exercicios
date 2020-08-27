package contas;

public class ContaPoupanca extends Conta{
	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}
	
	
	public ContaPoupanca(double saldo, int numConta, Double taxaJuros) {
		super(saldo, numConta);
		this.taxaJuros = taxaJuros;
	}


	@Override
	public void sacar(double valor) {
		double saldo = getSaldo();
		if(saldo >= valor) {
			super.sacar(valor);
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void recolherJuros() {
		depositar(getSaldo() * taxaJuros);
		
	}
}
