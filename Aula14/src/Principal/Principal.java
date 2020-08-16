package Principal;

import java.util.Scanner;

import Funcionaario.Funcionario;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		Funcionario func = new Funcionario();
//		func.nome = "Ricardo Alves Roberto";
		System.out.println("Digite seu nome:");
		func.nome = sc.nextLine();
//		func.salarioBruto = 6000.00;
		System.out.println("Digite seu salário bruto:");
		func.salarioBruto = sc.nextDouble();
//		func.imposto = 1000.00;
		System.out.println("Digite o valor dos impostos:");
		func.imposto = sc.nextDouble();
		System.out.println("Nome: "+ func.nome + " / Salário bruto: " + func.salarioLiquid() + " impostos: " + func.imposto );
		
		func.aumento(0.1);
		System.out.println();
		System.out.println("Agora com aumento:");
		System.out.println("Nome: "+ func.nome + " / Salário bruto: " + func.salarioLiquid() + " impostos: " + func.imposto );
		sc.close();
	}
	
	

}
