package exercicio3;

public class Cliente {
	int numCliente;
	String nome;
	String apelido;
	int numCC;
	String morada1;
	String morada2;
	String codigoPostal;
	String localidadePostal;

	public Cliente(int numCliente) {
		this.numCliente = numCliente;
	}

	public Cliente(int numCliente, String nome, String apelido) {
		this.numCliente = numCliente;
		this.nome = nome;
		this.apelido = apelido;
	}

	public int getNumCliente() {
		return this.numCliente;
	}

	public void setNumCliente(int numCliente) {
		this.numCliente = numCliente;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return this.apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
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
