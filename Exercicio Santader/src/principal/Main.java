package principal;

import java.util.Scanner;

import clientes.Cliente;
import contas.Cheque;
import contas.ContaCorrente;
import contas.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("***** Cadastro de novos clientes *****");
		System.out.println();
		
		System.out.print("Código do cliente:");
		Integer cod = sc.nextInt();
		
		System.out.print("Primeiro nome:");
		String nome = sc.next();
		
		System.out.print("Sobrenome:");
		String sobrenome = sc.next();
		
		System.out.print("RG:");
		Integer rg = sc.nextInt();
		
		System.out.print("CPF:");
		Integer cpf = sc.nextInt();
		
		System.out.println("***** Dados da conta ******");
		System.out.println("Poupança ou Corrente? (digite P ou C):");
		String op = sc.next().toUpperCase();
		
		if(op.charAt(0) == 'P') {
			System.out.print("Numero da conta:");
			int numConta = sc.nextInt();
			
			System.out.print("Saldo inicial:");
			sc.nextLine();
			double saldo = sc.nextDouble();
			
			System.out.print("insira a taxa juros mensal para essa conta:");
			double taxaJuros = sc.nextDouble();
			
			//criando a conta.....
			ContaPoupanca poupanca = new ContaPoupanca(saldo, numConta, taxaJuros);
			Cliente clientePoupanca = new Cliente(cod, nome, sobrenome, rg, cpf, poupanca);
			
			//testando a conta deposito.....
			System.out.println();
			System.out.print("Digite o valor do depósito: ");
			double valor = sc.nextDouble();
			System.out.println("Saldo antes do deposito: R$:" + clientePoupanca.getConta().getSaldo());
			poupanca.depositar(valor);
			System.out.println("Saldo depois do deposito: R$:" + clientePoupanca.getConta().getSaldo());
			
			//testando a conta saque.....
			System.out.println();
			System.out.print("Digite o valor do saque: ");
			valor = sc.nextDouble();
			System.out.println("Saldo antes do saque: R$:" + clientePoupanca.getConta().getSaldo());
			poupanca.sacar(valor);
			System.out.println("Saldo depois do saque: R$:" + clientePoupanca.getConta().getSaldo());
			
			//testando a taxa de juros ....
			System.out.println();
			System.out.println("Crédito de juros da conta poupança: ");
			System.out.println("Saldo antes da atualização: R$:" + clientePoupanca.getConta().getSaldo());
			poupanca.recolherJuros();
			System.out.println("Saldo depois da atualização: R$:" + clientePoupanca.getConta().getSaldo());
			
		}else {
			System.out.print("Numero da conta:");
			int numConta = sc.nextInt();
			
			System.out.print("Saldo inicial:");
			sc.nextLine();
			double saldo = sc.nextDouble();
			
			System.out.print("insira o limite de cheque especial para essa conta:");
			double limiteChequeEspecial = sc.nextDouble();
			
			//criando a conta.....
			ContaCorrente corrente = new ContaCorrente(limiteChequeEspecial, saldo, numConta);
			Cliente clienteCorrente = new Cliente(cod, nome, sobrenome, rg, cpf, corrente);
			
			//testando a conta.....
			
			//testando a conta deposito.....
			System.out.println();
			System.out.print("Digite o valor do depósito: ");
			double valor = sc.nextDouble();
			System.out.println("Saldo antes do deposito: R$:" + clienteCorrente.getConta().getSaldo());
			corrente.depositar(valor);
			System.out.println("Saldo depois do deposito: R$:" + clienteCorrente.getConta().getSaldo());
			
			//testando a conta saque.....
			System.out.println();
			System.out.print("Digite o valor do saque: ");
			valor = sc.nextDouble();
			System.out.println("Saldo antes do saque: R$:" + clienteCorrente.getConta().getSaldo());
			corrente.sacar(valor);
			System.out.println("Saldo depois do saque: R$:" + clienteCorrente.getConta().getSaldo());
			
			// testando deposito em cheque
			System.out.println();
			System.out.print("Digite o valor do deposito em cheque: ");
			valor = sc.nextDouble();
			System.out.print("Digite o banco emissor: ");
			String bancoEmissor = sc.next();
			System.out.print("Digite a data de compensação (dd/MM/aaaa): ");
			String dataCompensacao = sc.next();
			Cheque cheque = new Cheque(valor, bancoEmissor, dataCompensacao);
			System.out.println("Saldo antes do deposito: R$:" + clienteCorrente.getConta().getSaldo());
			corrente.depositarCheque(cheque);
			System.out.println("Saldo depois do deposito: R$:" + clienteCorrente.getConta().getSaldo());
		}
		
		sc.close();
	}
}
