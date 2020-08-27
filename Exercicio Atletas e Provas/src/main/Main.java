package main;

import entities.Atleta;
import entities.Prova;

public class Main {
	public static void main(String[] args) {
		Atleta corredor = new Atleta("Ricardo", 3, 100);
		Atleta maratonista = new Atleta("Silvana", 8, 60);
		
		//provas para corredor:
		Prova maratona = new Prova(7, 90);
		Prova natacao = new Prova(9, 70);
		Prova tiroAoAlvo = new Prova(2, 30);
		
		//provas para maratonista:
		Prova ciclismo = new Prova(5, 60);
		Prova futebol = new Prova(9, 98);
		Prova volei = new Prova(2, 100);
		
		System.out.print("Status das provas para o atleta: ");
		System.out.println(corredor.getNome());
		System.out.println();
		if(maratona.podeRealizar(corredor)) {
			System.out.println("Maratorna: pode realizar!");
		}else {
			System.out.println("Maratorna: não pode realizar!");
		}
		
		if(natacao.podeRealizar(corredor)) {
			System.out.println("natacao: pode realizar!");
		}else {
			System.out.println("natacao: não pode realizar!");
		}
		
		if(tiroAoAlvo.podeRealizar(corredor)) {
			System.out.println("Tiro ao alvo: pode realizar!");
		}else {
			System.out.println("Tiro ao alvo: não pode realizar!");
		}
		
		System.out.println();
		System.out.println("******** ------- *************");
		System.out.println();
		
		System.out.print("Status das provas para o atleta: ");
		System.out.println(maratonista.getNome());
		System.out.println();
		if(ciclismo.podeRealizar(maratonista)) {
			System.out.println("ciclismo: pode realizar!");
		}else {
			System.out.println("ciclismo: não pode realizar!");
		}
		if(futebol.podeRealizar(maratonista)) {
			System.out.println("futebol: pode realizar!");
		}else {
			System.out.println("futebol: não pode realizar!");
		}
		if(volei.podeRealizar(maratonista)) {
			System.out.println("volei: pode realizar!");
		}else {
			System.out.println("volei: não pode realizar!");
		}
		
	}
}
