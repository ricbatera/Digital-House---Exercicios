package principal;

import java.util.Scanner;

//import circulo.Circulo;
import cotaccao.CurrencyConverter;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dolar = sc.nextDouble();	
		
		System.out.println("How many dollars will be bought? ");
		double quantidade = sc.nextDouble();
			
		System.out.printf("Amount to be paid in reais R$ %.2f", CurrencyConverter.converter(dolar, quantidade));
				
		sc.close();
//		Scanner sc = new Scanner(System.in);
//		Circulo bolinha = new Circulo();
//		
//		System.out.print("Digite um valor para o raio:");
//		double raio = sc.nextDouble();
//		double circunferencia = 2 * Math.PI * raio;
//		double volume = 4 * Math.PI * Math.pow(raio, 3)/3;
//		System.out.println(volume);
//		System.out.println(circunferencia);
//		
		
//		bolinha.calculaCircunferencia(raio);
//		bolinha.calculaVolume(raio);
//		System.out.printf("PI: %.2f", Math.PI);
		
//		System.out.println("Digite o valor da cotação do dólar:");
//		double dolar = sc.nextDouble();
//		System.out.println("Quantos dólares deseja comprar?");
//		double qtdeDolar = sc.nextDouble();
//		
//		System.out.printf("Você vai gastar R$ %.2f para comprar esses dólares", CurrencyConverter.conversao(dolar, qtdeDolar));
//		sc.close();

	}

}
