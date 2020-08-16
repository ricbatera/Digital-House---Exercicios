package retangulo;

public class Retangulo {
	public double altura =0;
	public double base = 0;
	double perimetro =0;
	double area =0;
	double diagonal =0;
	
	public void calcPerimetro() {
		this.perimetro = 2*(altura + base);
	}
	
	public void calcArea() {
		this.area = base * altura;
	}

	public void calcDiagonal() {
		
	}
}
