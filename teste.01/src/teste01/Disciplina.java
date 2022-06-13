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
}
