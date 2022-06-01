package exercicio4;

public class ContaOrdem extends ContaBancaria {
	String tipoConta;
	double limiteSaldo;
	double taxa = .5;

	public ContaOrdem(Cliente cliente, String tipoConta) {
		super(cliente);
		this.tipoConta = tipoConta;
	}

	double obterValorDisponivel() {
		return super.getSaldoConta() + limiteSaldo;
	}

	@Override
	public boolean levantarValor(double valorLevantar) {
		valorLevantar += taxa;
		super.levantarValor(valorLevantar);
	};

	public String getTipoConta() {
		return this.tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public double getLimiteSaldo() {
		return this.limiteSaldo;
	}

	public void setLimiteSaldo(double limiteSaldo) {
		this.limiteSaldo = limiteSaldo;
	}
}
