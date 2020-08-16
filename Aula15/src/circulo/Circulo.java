package circulo;

public class Circulo {	
	public double volume =0;
	public double circunferencia = 0;
	
	
	public void calculaCircunferencia(double raio) {		
		this.circunferencia = 2 * Math.PI * raio;
		System.out.printf("Circunferencia: %.2f \n", this.circunferencia);
	}
	
	public void calculaVolume(double raio) {
		this.volume = 4 * Math.PI * Math.pow(raio, 3)/3;
		System.out.printf("Volume: %.2f \n", this.volume);
	}
}
