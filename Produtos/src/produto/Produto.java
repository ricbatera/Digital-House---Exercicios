package produto;

public class Produto {
	public double preco = 0;
	public String descricao;
	public int estoque = 0;
	public double valorTot= 0;
	
	public void adcionaEstoque(int qtde) {
		this.estoque += qtde;
	}
	
	public void removeEstoque (int qtde) {
		this.estoque -= qtde;
	}
	
	public void valorTotal() {
		this.valorTot = this.preco * this.estoque;
	}
}
