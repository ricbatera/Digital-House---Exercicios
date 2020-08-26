package main;

import entities.Contrato;
import entities.Documento;
import entities.Foto;
import entities.Impressora;

public class Main {

	public static void main(String[] args) {
		Contrato contrato = new Contrato("Contrato de compra e venda");
		Foto foto = new Foto("Praia");
		Documento documento = new Documento("Curriculo doc");
		
		Impressora impressora = new Impressora();
		
		impressora.adicionarImprimivel(contrato);
		impressora.adicionarImprimivel(foto);
		impressora.adicionarImprimivel(documento);
		
		impressora.imprimirTudo();
		
		

	}

}
