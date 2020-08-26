package entities;

public class Contrato extends Impressora implements Imprimivel{
	private String nome;
	private String tipo = "Contrato";
	
	
	public Contrato(String nome) {		
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Contrato [nome=" + nome + ", tipo=" + tipo + "]";
	}

	@Override
	public void imprimir() {
		System.out.println("Sou um contrato muito legal" + this.nome +", "+ this.tipo);
		
	}
	
}
