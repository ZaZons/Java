package projeto;

public class Pessoa {
	String nome;
	String apelido;
	long numCC;

	public Pessoa(String nome, String apelido, long numCC) {
		this.nome = nome;
		this.apelido = apelido;
		this.numCC = numCC;
	}

	public String toString() {
		String res = "";
		res += "Nome: " + nome + " " + apelido;
		res += "\nNumero de cartao de cidadao: " + numCC;

		return res;
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

	public long getNumCC() {
		return this.numCC;
	}

	public void setNumCC(long numCC) {
		this.numCC = numCC;
	}
}
