package principal;

import java.util.Scanner;

import lanches.Bolo;
import lanches.Sanduiche;
import massas.Lasanha;
import massas.Macarrao;
import massas.Pizza;
import menu.Menus;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;

		Menus.menu();
		op = sc.nextInt();
		switch (op) {
		case 1:
			Sanduiche sand = new Sanduiche(18.95);
			sand.selecionaIngredientes(sc);
			System.out.println("Qual a distancia para entrega (em km)?");
			int km = sc.nextInt();
			System.out.println("Seu lanche com molho est� sendo preparado");
			System.out.printf("O valor � R$ %.2f\n", sand.getPreco());
			System.out.println("O tempo de entrega � " + sand.distancia(km) + " minutos");
			break;
		case 2:
			Menus.menuMassa();
			int op2 = sc.nextInt();
			switch (op2) {
			case 1:
				Macarrao mac = new Macarrao(22.90);
				Menus.menuMassaMacarrao();
				mac.setTipoMacarrao(sc.nextInt());
				Menus.menuMassaMolho();				
				mac.setMolho(sc.nextInt());
				
				System.out.println("Qual a distancia para entrega (em km)?");
				km = sc.nextInt();
				System.out.println("Seu macarr�o do tipo "+ mac.getTipoMacarrao() + " com molho "+ mac.getMolho() + " est� sendo preparado!");
				System.out.printf("O valor � R$ %.2f\n", mac.getPreco());
				System.out.println("O tempo de entrega � " + mac.distancia(km) + " minutos");
				break;
			case 2:
				Pizza pizza = new Pizza(45.65);
				Menus.menuMassaPizza();
				pizza.setSabor(sc.nextInt());
				
				Menus.menuMassaMolho();				
				pizza.setMolho(sc.nextInt());
				
				System.out.println("Qual a distancia para entrega (em km)?");
				km = sc.nextInt();
				System.out.println("Sua pizza de "+ pizza.getSabor() + " com molho "+ pizza.getMolho() + " est� sendo preparada!");
				System.out.printf("O valor � R$ %.2f\n", pizza.getPreco());
				System.out.println("O tempo de entrega � " + pizza.distancia(km) + " minutos");
				break;
			case 3:
				Lasanha lasanha = new Lasanha(34.50);
				Menus.menuMassaLasanha();
				lasanha.setRecheio(sc.nextInt());
				Menus.menuMassaMolho();				
				lasanha.setMolho(sc.nextInt());
				
				System.out.println("Qual a distancia para entrega (em km)?");
				km = sc.nextInt();
				System.out.println("Sua lasanha de "+ lasanha.getRecheio() + " com molho "+ lasanha.getMolho() + " est� sendo preparada!");
				System.out.printf("O valor � R$ %.2f\n", lasanha.getPreco());
				System.out.println("O tempo de entrega � " + lasanha.distancia(km) + " minutos");
				break;
			}break;
		case 3:
			Bolo bolo = new Bolo(20.50);
			Menus.menuBoloMassa();
			bolo.setMassa(sc.nextInt());
			
			Menus.menuBoloRecheio();
			bolo.setRecheio(sc.nextInt());
			
			Menus.menuBoloCobertura();
			bolo.setCobertura(sc.nextInt());
			
			System.out.println("Qual a distancia para entrega (em km)?");
			km = sc.nextInt();
			System.out.println("Seu bolo de " + bolo.getMassa() + " com recheio de "
					+ bolo.getRecheio() + " coberto com " + bolo.getCobertura()
					+ " est� sendo prepardo");
			System.out.printf("O valor � R$ %.2f\n", bolo.getPreco());
			System.out.println("O tempo de entrega � " + bolo.distancia(km) + " minutos");
			break;
			default:
				System.out.println("Op��o inv�lida!");
				System.out.println("Inicie o programa novamente");
				return;
		}

		sc.close();
		System.out.println("Obrigado e volte sempre");
	}

}
