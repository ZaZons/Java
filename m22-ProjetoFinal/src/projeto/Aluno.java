package projeto;

public class Aluno extends Pessoa {
	int numAluno;
	boolean matriculado = false;
	int ano = 0;
	String turma = " ";

	public Aluno(String nome, String apelido, long numCC) {
		super(nome, apelido, numCC);
	}

	public boolean matricularAluno(int ano, String turma, int numAluno) {
		setNumAluno(numAluno);
		setAno(ano);
		setTurma(turma);
		setMatriculado(true);

		return true;
	}

	@Override
	public String toString() {
		String res = "";
    
		res += "\nAluno: " + nome + " " + apelido;

		if (!getMatriculado()) {
			res += "\n\t\t(o aluno nao se encontra matriculado)";
		}

		return res;
	}

	public int getNumAluno() {
		return this.numAluno;
	}

	public void setNumAluno(int numAluno) {
		this.numAluno = numAluno;
	}

	public boolean isMatriculado() {
		return this.matriculado;
	}

	public boolean getMatriculado() {
		return this.matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTurma() {
		return this.turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}
}
