package notas;

public class Notas {
	public String nome;
	public double nota1 = 0;
	public double nota2 =0;
	public double nota3 = 0;
	
	public double calculaNota() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public void status() {
		double nota = calculaNota();
		if(nota >= 60) {
			System.out.println("Sua nota: " + nota);
			System.out.println("Passou!");
		}else {
			System.out.println("Reprovado");
			System.out.println("Faltou " + (60 - nota) + " pontos");
		}
	}
}
