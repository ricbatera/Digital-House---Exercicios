package entities;

public class Documento extends Impressora implements Imprimivel{

	private String nome;
	private String tipo = "Documento";
	
	public Documento(String nome) {		
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
		System.out.println("Sou um documento do Word" + this.nome +", "+ this.tipo);
		
	}
}
