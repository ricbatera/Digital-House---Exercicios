import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cadastros.Cadastro;
import contas.Conta;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Conta> conta = new ArrayList<>();
		int opcao = 0;
		do {
			menu();
			opcao = sc.nextInt();		
			
			switch (opcao) {
			case 1:
				Cadastro cad = new Cadastro();
				conta.add(cad.cadastro(sc));
				break;
			case 0:
				break;
			default:
				break;
			}

		} while (opcao != 0);

		for(Conta c : conta) {
			System.out.println("Valor do depoisito para "+ c.getTitular().getNome() + ":");
			c.deposito(sc.nextDouble());
		}
		
		for(Conta c : conta) {
			System.out.println("Valor para saque para o cliente "+ c.getTitular().getNome() + ":");
			c.saque(sc.nextDouble());
		}

		sc.close();

	}

	public static void menu() {
		System.out.println("-----  Menu de opções  -----");
		System.out.println("digite o numero da opção desejada:");
		System.out.println("1 - Adicionar novo cliente");
		System.out.println("0 - Sair");

	}

}
