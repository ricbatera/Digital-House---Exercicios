package lanches;

public class Bolo extends Lanche{
	private String massa;
	private String recheio;
	private String cobertura;
	private final int tempoDePreparo = 10;
	
	
	public Bolo(double preco) {
		super(preco);
	}

	



	public String getMassa() {
		return massa;
	}





	public void setMassa(int massa) {
		switch (massa) {
		case 1:
			this.massa = "Chocolate";
			break;
		case 2:
			this.massa = "Baunilha";
			break;
		case 3:
			this.massa = "Tradicional";
			break;
		}
	}





	public String getRecheio() {
		return recheio;
	}





	public void setRecheio(int recheio) {
		switch (recheio) {
		case 1:
			this.recheio = "Chocolate";
			break;
		case 2:
			this.recheio = "Morango";
			break;
		case 3:
			this.recheio = "Coco";
			break;
		}
	}





	public String getCobertura() {
		return cobertura;
	}
	
	public void setCobertura(int cobertura) {
		switch (cobertura) {
		case 1:
			this.cobertura = "Chocolate Preto";
			break;
		case 2:
			this.cobertura = "Chocolate Branco";
			break;
		case 3:
			this.cobertura = "Calda de Morango";
			break;
		}
	}

	@Override
	public int distancia(int km) {
		return km * super.getTempoEntregaPorKm() + tempoDePreparo;
		
	}
}
