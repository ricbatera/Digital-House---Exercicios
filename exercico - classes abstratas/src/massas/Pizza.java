package massas;

import lanches.Massa;

public class Pizza extends Massa {
	private String sabor;

	public Pizza(double preco) {
		super(preco);		
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(int sabor) {
		switch (sabor) {
		case 1 :
			this.sabor = "Mussarela";
			break;
		case 2 :
			this.sabor = "Calabresa";
			break;
		case 3 :
			this.sabor = "Portuguesa";
			break;
		}
	}	
	
}
