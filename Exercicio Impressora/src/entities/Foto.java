package entities;

public class Foto extends Impressora implements Imprimivel{
	private String nome;
	private String tipo = "Foto";
	
	public Foto(String nome) {		
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
		System.out.println("Sou uma selfie" + this.nome +", "+ this.tipo);
		
	}
}
