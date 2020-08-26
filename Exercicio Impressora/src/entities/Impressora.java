package entities;

import java.util.ArrayList;
import java.util.List;

public class Impressora {
	List<Imprimivel> list = new ArrayList<>();	
	
	public void imprimirTudo() {
		for	(Imprimivel p : list) {
			p.imprimir();
		}
	}
	
	public void adicionarImprimivel(Imprimivel umImprimivel) {
		list.add(umImprimivel);
	}
}
