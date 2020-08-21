package lanches;

public abstract class Lanche {
	private double preco;
	private final int tempoEntregaPorKm = 10;
	
	
	public Lanche() {		
	}
	public Lanche(double preco) {		
		this.preco = preco;
	}
	
	public int getTempoEntregaPorKm() {
		return tempoEntregaPorKm;
	}
	
	public abstract int distancia(int km);
	
	public double getPreco() {
		return this.preco;
	}
}
