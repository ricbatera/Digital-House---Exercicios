package jogadores;

public class SessaoDeTreinamento {
	private int experiencia;
	
	public int treinarA(JogadorDeFutebol jogador) {
		jogador.correr();
		jogador.fazerGol();
		jogador.correr();
		experiencia = jogador.getExperiencia();
		System.out.println("Experiencia atual: " + jogador.getExperiencia() + " pontos");
		jogador.setExperiencia(experiencia++);
		System.out.println("Expereriencia aprimorada: " + (jogador.getExperiencia()+1) + " pontos");
		return experiencia++;
	}
}
