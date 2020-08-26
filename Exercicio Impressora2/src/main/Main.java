package main;

import entities.Aviao;
import entities.Pato;
import entities.SuperHomem;
import entities.TorreDeControle;

public class Main {

	public static void main(String[] args) {
		Pato pato = new Pato(50);
		Aviao aviao = new Aviao();
		SuperHomem superHomem = new SuperHomem();
		TorreDeControle torre = new TorreDeControle();
		
		torre.adicionarVoador(pato);
		torre.adicionarVoador(aviao);
		torre.adicionarVoador(superHomem);
		
		torre.voemTodos();
	}

}
