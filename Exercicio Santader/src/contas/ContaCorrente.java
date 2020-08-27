package contas;

public class ContaCorrente extends Conta{
	private Double limiteChequeEspecial;
	
	public ContaCorrente() {
	}

	public ContaCorrente(Double limiteChequeEspecial, Double saldo, int numConta) {
		super(saldo, numConta);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public Double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	@Override
	public String toString() {
		return "ContaCorrente [limiteChequeEspecial=" + limiteChequeEspecial + "]";
	}
	
	@Override
	public void sacar(double valor) {
		double saldo = getSaldo();
		if(saldo >= valor) {
			super.sacar(valor);
		}else if((saldo + limiteChequeEspecial) >= valor) {
			super.sacar(valor);			
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositarCheque(Cheque cheque) {
		depositar(cheque.getValorCheque());
	}
	
	
}
