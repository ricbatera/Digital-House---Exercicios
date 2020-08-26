package entities;

public class Pato implements Voador{
	private int energia;
	
	

	public Pato(int energia) {		
		this.energia = energia;
	}
	
	public int getEnergia() {
		return energia;
	}


	public void setEnergia(int energia) {
		this.energia = energia;
	}


	@Override
	public void voar() {
		this.energia -= 5;
		System.out.println("Estou voando como um pato");
	}
	
	
}
