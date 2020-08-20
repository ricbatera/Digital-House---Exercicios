package cadastros;

import java.util.Scanner;

import clientes.Cliente;
import contas.Conta;

public class Cadastro {	
	
	public Conta cadastro(Scanner sc) {
			
		System.out.println("Digite o primeiro nome: ");
		String nome = sc.next();
		sc.nextLine();
		
		System.out.println("Digite o sobrenome: ");
		String sobrenome = sc.nextLine();
		Cliente cliente = new Cliente(nome, sobrenome);
		
		System.out.println("Digite o numero da conta: ");		
		int conta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o valor do deposito inicial: ");
		double saldo = sc.nextDouble();
		
		Conta novaConta = new Conta(conta, saldo, cliente);
		System.out.println(novaConta);
		//sc.close();
		return novaConta;
	}
}
