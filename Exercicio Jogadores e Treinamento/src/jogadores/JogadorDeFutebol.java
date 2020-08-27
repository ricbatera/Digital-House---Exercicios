package jogadores;

public class JogadorDeFutebol {
	
	private String nome;
	private int energia = 100;
	private int alegria;
	private int gols;
	private int experiencia;
	
	

	public JogadorDeFutebol(String nome) {
		this.nome = nome;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public int getExperiencia() {
		return this.experiencia;
	}

	public void fazerGol() {
		energia -= 5;
		alegria += 10;
		gols++;
		System.out.println("GOOOOLL");
	}
	
	public void correr() {
		energia -= 10;
		System.out.println("Cansei");
	}

	@Override
	public String toString() {
		return "Novo Jogador:\nNome: " + nome +"\n"
				+ "Energia: " + energia +"\n"
				+ "Alegria: " + alegria +"\n"
				+ "Gols: " + gols +"\n"
				+ "Experiencia: " + experiencia +"\n";
	}
	
	
}
