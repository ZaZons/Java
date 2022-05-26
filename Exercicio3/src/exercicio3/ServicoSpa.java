package exercicio3;

public class ServicoSpa {
	private String descricaoServico;
	private double preco;

	public ServicoSpa() {
		descricaoServico = "Padrao";
		preco = 0;
	}

	public ServicoSpa(String descricaoServico, double preco) {
		this.descricaoServico = descricaoServico;
		this.preco = preco;
	}

	public void setDescricaoServico(String servico) {
		descricaoServico = servico;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setPreco(double p) {
		preco = p;
	}

	public double getPreco() {
		return preco;
	}
}
