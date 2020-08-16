package Funcionaario;

public class Funcionario {
	public String nome;
	public double salarioBruto;
	public double imposto;
	private double salarioLiquido;
	
	public void aumento(double aumento) {
		salarioBruto = salarioBruto + (salarioBruto * aumento);
	}
	
	public double salarioLiquid() {
		this.salarioLiquido = salarioBruto - imposto;
		return this.salarioLiquido;
	}

}
