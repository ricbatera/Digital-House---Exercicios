package cotaccao;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double conversao(double valorDolar, double qtdeDolar) {
		
		return ((valorDolar * qtdeDolar)* (1 + IOF));
	}
	
public static double converter(double valorDolar, double qtdeDolar) {
		
		return ((valorDolar * qtdeDolar)* (1 + IOF));
	}
}
