package entities;

public class Aviao implements Voador {
	private int horasDeVoo;
	
	public Aviao() {
		
	}

	public int getHorasDeVoo() {
		return horasDeVoo;
	}

	@Override
	public void voar() {
		this.horasDeVoo += 13;
		System.out.println("Estou voando como um avião");
	}

}
