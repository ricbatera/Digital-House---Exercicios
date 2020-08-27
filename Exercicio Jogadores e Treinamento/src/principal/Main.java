package principal;

import java.util.Scanner;

import jogadores.JogadorDeFutebol;
import jogadores.SessaoDeTreinamento;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do Jogador:");
		String nome = sc.nextLine();
		
		JogadorDeFutebol jogador = new JogadorDeFutebol(nome);
		System.out.println(jogador.toString());
		
		SessaoDeTreinamento treinamento = new SessaoDeTreinamento();
		
		jogador.setExperiencia(treinamento.treinarA(jogador));
		System.out.println();
		System.out.println(jogador.toString());
		System.out.println();
		
		jogador.setExperiencia(treinamento.treinarA(jogador));
		System.out.println();
		System.out.println(jogador.toString());
		System.out.println();
		sc.close();
	}

}
