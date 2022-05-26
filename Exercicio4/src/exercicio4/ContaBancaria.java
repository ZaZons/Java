package exercicio4;

import java.time.LocalDate;

public class ContaBancaria {
	int numConta;
	int idAgencia;
	double saldoConta;
	double taxaJuro;
	LocalDate dataAberturaConta;
	String tipoConta;
	Cliente cliente;

	public ContaBancaria(Cliente cliente) {
		this.cliente = cliente;
		dataAberturaConta = LocalDate.now();
	}

	public ContaBancaria(int numConta, double saldoConta, Cliente cliente) {
		this.numConta = numConta;
		this.saldoConta = saldoConta;
		this.dataAberturaConta = LocalDate.now();
		this.cliente = cliente;
	}

	public void depositarValor(double valorDeposito) {
		saldoConta += valorDeposito;
	}

	public boolean levantarValor(double valorLevantar) {
		if(saldoConta >= valorLevantar) {
			saldoConta -= valorLevantar;
			return true;
		} else {
			return false;
		}
	}

	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getIdAgencia() {
		return this.idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public double getSaldoConta() {
		return this.saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public double getTaxaJuro() {
		return this.taxaJuro;
	}

	public void setTaxaJuro(double taxaJuro) {
		this.taxaJuro = taxaJuro;
	}

	public LocalDate getDataAberturaConta() {
		return this.dataAberturaConta;
	}

	public void setDataAberturaConta(LocalDate dataAberturaConta) {
		this.dataAberturaConta = dataAberturaConta;
	}

	public String getTipoConta() {
		return this.tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}		
}
