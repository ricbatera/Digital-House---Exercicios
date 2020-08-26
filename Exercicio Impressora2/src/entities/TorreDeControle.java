package entities;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {
	List<Voador> voadores = new ArrayList<>();
	
	public void voemTodos() {
		for (Voador v : voadores) {
			v.voar();
		}
	}
	
	public void adicionarVoador(Voador umVoador) {
		voadores.add(umVoador);
	}
}
