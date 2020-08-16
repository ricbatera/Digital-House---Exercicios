import java.util.Scanner;

import produto.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto tv = new Produto();
		
		System.out.println("Digite os dados do novo produto: ");
		System.out.print("Nome do produto:");
		tv.descricao = sc.nextLine();
		
		System.out.print("Preço:");
		tv.preco = sc.nextDouble();
		
		System.out.print("Quantidade:");
		tv.estoque = sc.nextInt();
		tv.valorTotal();
		
		System.out.println();
		System.out.println("Dados do novo produto: Decrição: "+ tv.descricao + " Preço: R$" + tv.preco + " Quantidade: "+ tv.estoque + " Valor total dos produtos: R$"  + tv.valorTot);
		
		System.out.println();
		
		System.out.print("Adicione ao estoque: ");
		tv.adcionaEstoque(sc.nextInt());
		tv.valorTotal();		
		System.out.println("Dados ATUALIZADOS: Decrição: "+ tv.descricao + " Preço: R$" + tv.preco + " Quantidade: "+ tv.estoque + " Valor total dos produtos: R$"  + tv.valorTot);
		
		System.out.print("Retire do estoque: ");
		tv.removeEstoque(sc.nextInt());
		tv.valorTotal();
		System.out.println("Dados ATUALIZADOS: Decrição: "+ tv.descricao + " Preço: R$" + tv.preco + " Quantidade: "+ tv.estoque + " Valor total dos produtos: R$"  + tv.valorTot);
		
		sc.close();
	}

}
