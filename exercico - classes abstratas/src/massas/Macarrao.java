package massas;

import lanches.Massa;

public class Macarrao extends Massa {
	
	private String tipoMacarrao;

	public Macarrao(double preco) {
		super(preco);
	}
	
	public String getTipoMacarrao() {
		return this.tipoMacarrao;
	}
	public void setTipoMacarrao(int tipo) {
		switch (tipo) {
		case 1:
			this.tipoMacarrao = "Penne";
			break;
		case 2:
			this.tipoMacarrao = "Parafuso";
			break;
		case 3:
			this.tipoMacarrao = "Ninho";
			break;

		}
	}
	
}
