package lanches;

public class Massa extends Lanche{
	private String molho;	
	private final int tempoDePreparo = 30;
	
	public Massa() {
		super();
		
	}
	public Massa(double preco) {
		super(preco);
		
	}
	
	public Massa(String molho) {
		super();
		this.molho = molho;
	}
	
	public String getMolho() {
		return this.molho;
	}
	
	public void setMolho(int molho) {
		switch (molho) {
		case 1:
			this.molho = "Tomate Fresco";
			break;
		case 2:
			this.molho = "Tomate com Manjericão";
			break;
		case 3:
			this.molho = "A moda do chef";
			break;
		}
	}
	@Override
	public int distancia(int km) {
		return km * super.getTempoEntregaPorKm() + tempoDePreparo;
		
	}
}
