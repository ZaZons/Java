package teste01;

import java.time.LocalDate;

public class Pessoa {
	String nome;
	String apelido;
	long numCC;
	LocalDate dataNascimento;

	public Pessoa(String nome, String apelido, long numCC, LocalDate dataNascimento) {
		this.nome = nome;
		this.apelido = apelido;
		this.numCC = numCC;
		this.dataNascimento = dataNascimento;
	}

	public String toString() {
		String res = "";
		res += "Nome: " + nome + " " + apelido;
		res += "\nData de nascimento: " + dataNascimento.getDayOfMonth() + "-" + 
				dataNascimento.getMonthValue() + "-" + dataNascimento.getYear();
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

	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
