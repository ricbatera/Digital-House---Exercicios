package lanches;

import java.util.Scanner;

import menu.Menus;

public class Sanduiche extends Lanche {
	private String[] ingredientes = new String[10];
	private final int tempoDePreparo = 15;
	private int qtde = 0;

	public Sanduiche() {
	}

	public Sanduiche(double preco) {
		super(preco);
	}
	@Override
	public int distancia(int km) {
		return km * super.getTempoEntregaPorKm() + tempoDePreparo;
	}

	public void selecionaIngredientes(Scanner sc) {
		int menu = 0;
		do {
			Menus.menuSanduiche();
			menu = sc.nextInt();
			if (qtde < 10) {
				switch (menu) {
				case 1:
					ingredientes[qtde] = "Pão";
					qtde++;
					break;
				case 2:
					ingredientes[qtde] = "Maionese";
					qtde++;
					break;
				case 3:
					ingredientes[qtde] = "Hamburger";
					qtde++;
					break;
				case 4:
					ingredientes[qtde] = "Katchup";
					qtde++;
					break;
				case 5:
					ingredientes[qtde] = "Mostarda";
					qtde++;
					break;
				case 6:
					ingredientes[qtde] = "Barbecue";
					qtde++;
					break;
				case 7:
					ingredientes[qtde] = "Queijo";
					qtde++;
					break;
				case 8:
					ingredientes[qtde] = "Presunto";
					qtde++;
					break;
				case 9:
					ingredientes[qtde] = "Ovo";
					qtde++;
					break;
				case 10:
					ingredientes[qtde] = "Batata Palha";
					qtde++;
					break;
				case 0:
					break;

				default:
					System.out.println("Opção inválida!");
				}
				System.out.println("\n\nIngredientes escolhidos:");
				int seq = 1;
				for (int i = 0; i < ingredientes.length; i++) {
					if (ingredientes[i] != null) {
						System.out.println(seq + " ) " + ingredientes[i]);
						seq++;
					}
				}

			} else {
				System.out.println(
						"\n\n\n Seu lanche já tem 10 opções, agora vamos calcular o valor e o tempo de entrega\n\n");
				menu = 0;
			}

		} while (menu != 0);
	}

}
