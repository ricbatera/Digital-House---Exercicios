package massas;

import lanches.Massa;

public class Lasanha extends Massa{
	private String recheio;

	public Lasanha(double preco) {
		super(preco);		
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(int recheio) {
		switch(recheio) {
		case 1:
			this.recheio = "2 queijos";
			break;
			
		case 2:
			this.recheio = "4 queijos";
			break;
			
		case 3:
			this.recheio = "Tradicional";
			break;
		}
	}
	
	
}
