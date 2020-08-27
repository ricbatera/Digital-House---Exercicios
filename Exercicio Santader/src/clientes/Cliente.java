package clientes;

import contas.Conta;

public class Cliente {
	private Integer numCliente;
	private String nome;
	private String sobrenome;
	private Integer rg;
	private Integer cpf;
	private Conta conta;
	
	public Cliente() {
		
	}

	public Cliente(Integer numCliente, String nome, String sobrenome, Integer rg, Integer cpf, Conta conta) {
		this.numCliente = numCliente;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
		this.conta = conta;
	}
	
	

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Integer getNumCliente() {
		return numCliente;
	}

	public void setNumCliente(Integer numCliente) {
		this.numCliente = numCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [numCliente=" + numCliente + ", nome=" + nome + ", sobrenome=" + sobrenome + ", rg=" + rg
				+ ", cpf=" + cpf + "]";
	}
	
	
	
	
	
}
