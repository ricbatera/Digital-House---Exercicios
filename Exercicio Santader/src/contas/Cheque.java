package contas;

import java.util.Date;

public class Cheque {
	private double valorCheque;
	private String bancoEmissor;
	private Date dataDePagamento;
	private String dataPagto;
	
	public Cheque() {
		
	}

	public Cheque(double valorCheque, String bancoEmissor, String dataPagto) {
		this.valorCheque = valorCheque;
		this.bancoEmissor = bancoEmissor;
		this.dataPagto = dataPagto;
	}

	public double getValorCheque() {
		return valorCheque;
	}

	public void setValorCheque(double valorCheque) {
		this.valorCheque = valorCheque;
	}

	public String getBancoEmissor() {
		return bancoEmissor;
	}

	public void setBancoEmissor(String bancoEmissor) {
		this.bancoEmissor = bancoEmissor;
	}

	public Date getDataDePagamento() {
		return dataDePagamento;
	}

	public void setDataDePagamento(Date dataDePagamento) {
		this.dataDePagamento = dataDePagamento;
	}

	@Override
	public String toString() {
		return "Cheque [valorCheque=" + valorCheque + ", bancoEmissor=" + bancoEmissor + ", dataDePagamento="
				+ dataDePagamento + "]";
	}	

}
