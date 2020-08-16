package exercicios;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println("Olá Mundo");
//		int idade = 17;
//		String  nome = "Ricardo";
//		double nota = 10.5;
//		char letra = 'r';
//		System.out.println(nome+" tem "+idade+" de idade");
//		
//		if(idade >= 18) {
//			System.out.println("pode entrar");
//		}else {
//			System.out.println("entregue os documentos por favor");
//		}
//		
//		for (int i = 1; i<11; i++) {
//			System.out.println("8 x "+ i + " = " + 8*i);
//		}
//		
//		int contador = 0;
//		while(contador <11) {
//			System.out.println("8 x "+ contador + " = " + 8*contador);
//			contador ++;
//		}
		int op;
		double num1 =0 , num2 = 0;	
		Scanner sc = new Scanner(System.in);
		
		do {			
			menu();
			op = sc.nextInt();
			if((op >0) && (op <5)) {
			System.out.println("digite um numero");
			num1 = sc.nextInt();
			System.out.println("digite um numero");
			num2 = sc.nextInt();
			}
			
			
			switch(op) {
			case 1:
				somar(num1, num2);
				break;
			case 2:
				subtrair(num1, num2);
				break;
			case 3:
				multiplicar(num1, num2);
				break;
			case 4: 
				dividir(num1, num2);
				break;
			case 5:
				System.out.println("Obrigado e volte sempre!");
				sc.close();
				break;
			default: System.out.println("Opção inválida!");
			}
		}while(op != 5);
		
	}
	
	public static void somar(double num1, double num2) {
		
		System.out.println("A soma do números é " + (num1 +  num2));
		
	}
	public static void subtrair(double num1, double num2) {		
		System.out.println("A subtração do números é " + (num1 -  num2));
		
	}
	public static void multiplicar(double num1, double num2) {		
		System.out.println("A multiplicação do números é " + (num1 *  num2));
		
	}
	public static void dividir(double num1, double num2) {		
		System.out.println("A divisão do números é " + (num1 /  num2));
		
	}
	
	public static void menu(){		
		System.out.println("Escolha uma opção:");
		System.out.println("1 - SOMAR");
		System.out.println("2 - SUBTRAIR");
		System.out.println("3 - MULTIPLICAR");
		System.out.println("4 - DIVIDIR");
		System.out.println("5 - SAIR");
		
	}

}