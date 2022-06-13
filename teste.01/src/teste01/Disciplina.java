package teste01;

public class Disciplina {
	String nomeDisciplina;
	int ano;
	char turma;
	Professor professor;

	public Disciplina(String nomeDisciplina, int ano, char turma) {
		this.nomeDisciplina = nomeDisciplina;
		this.ano = ano;
		this.turma = turma;
	}

	public String toString() {
		String res = "";

		res += "Disciplina: " + nomeDisciplina;
		res += "\n\tAno: " + ano;
		res += "\n\tTurma: " + turma;
		if(professor == null) {
			res += "\n\t(a disciplina nao tem professor atribuido)";
		} else {
			res += "\n\tProfessor: " + professor.getNome();
		}
		
		return res;
	}

	public String getNomeDisciplina() {
		return this.nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public char getTurma() {
		return this.turma;
	}

	public void setTurma(char turma) {
		this.turma = turma;
	}

	public Professor getProfessor() {
		return this.professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
