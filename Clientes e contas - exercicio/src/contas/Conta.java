package contas;

import clientes.Cliente;

public class Conta {
	private int nunConta;
	private double saldo;
	private Cliente titular;
	
	public Conta(int nunConta, double saldo, Cliente titular) {		
		this.nunConta = nunConta;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	

	@Override
	public String toString() {
		return "-----  Nova Conta ------"
				 + "\nTitular: " + titular
				+ "\nConta: " + nunConta
				+ "\nSaldo atual: " + saldo +"\n\n";
		
	}



	public int getNunConta() {
		return nunConta;
	}

	public void setNunConta(int nunConta) {
		this.nunConta = nunConta;
	}

	public double getSaldo() {
		return saldo;
	}	

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	
	public void saque(double saque) {
		if(this.saldo >= saque) {
			this.saldo -= saque;
			System.out.println("Saque efetuado!");
			System.out.printf("Saldo atualizado: R$ %.2f\n\n", this.saldo);
		}else {
			System.out.println("Saldo insuficiente!\n\n");
		}
		
	}
	
	public void deposito(double deposito) {
		this.saldo += deposito;
		System.out.println("Depósito efetuado!");
		System.out.printf("Saldo atualizado: R$ %.2f\n\n", this.saldo);
	}
	

}
