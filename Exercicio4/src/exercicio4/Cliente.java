package exercicio4;

public class Cliente {
	int numCliente;
	String nomeCliente;
	String apelidoCliente;
	int numCC;
	String morada1;
	String morada2;
	String codigoPostal;
	String localidadePostal;

	public Cliente(int numCliente) {
		this.numCliente = numCliente;
	}

	public Cliente(int numCliente, String nomeCliente, String apelidoCliente) {
		this.numCliente = numCliente;
		this.nomeCliente = nomeCliente;
		this.apelidoCliente = apelidoCliente;
	}

	public int getNumCliente() {
		return this.numCliente;
	}

	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	public String getNomeCliente() {
		return this.nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getApelidoCliente() {
		return this.apelidoCliente;
	}

	public void setApelidoCliente(String apelidoCliente) {
		this.apelidoCliente = apelidoCliente;
	}

	public int getNumCC() {
		return this.numCC;
	}

	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}

	public String getMorada1() {
		return this.morada1;
	}

	public void setMorada1(String morada1) {
		this.morada1 = morada1;
	}

	public String getMorada2() {
		return this.morada2;
	}

	public void setMorada2(String morada2) {
		this.morada2 = morada2;
	}

	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidadePostal() {
		return this.localidadePostal;
	}

	public void setLocalidadePostal(String localidadePostal) {
		this.localidadePostal = localidadePostal;
	}
}
