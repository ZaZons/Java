package teste01;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno extends Pessoa {
	int numAluno;
	boolean matriculado = false;
	int ano = 0;
	char turma = ' ';
	ArrayList<Disciplina> disciplinas = null;
	static int numUltimoAlunoMatriculado = 0;

	public Aluno(String nome, String apelido, long numCC, LocalDate dataNascimento) {
		super(nome, apelido, numCC, dataNascimento);
	}

	public boolean matricularAluno(int ano, char turma) {
		if(getMatriculado()) {
			System.out.println("O aluno " + nome + " " + apelido + 
				" ja se encontra matriculado, por isso nao pode ser matriculado de novo!");
			
			return false;
		} else {
			setNumAluno();
			setAno(ano);
			setTurma(turma);
			setMatriculado(true);
			
			System.out.println("\nO aluno " + nome + " " + apelido + " foi corretamente matriculado!");
			System.out.println(this);

			return true;
		}
	}

	@Override
	public String toString() {
		String res = "";

		res += "\nAluno: " + nome + " " + apelido;
		res += "\n\tData de nascimento: " + dataNascimento.getDayOfMonth() + "-" +
				dataNascimento.getMonthValue() + "-" + dataNascimento.getYear();
				
		if(getMatriculado()) {
			res += "\n\tAno/turma: " + ano + "o" + turma;
			res += "\n\tDisciplinas onde esta inscrito: ";
			if (getDisciplinas() == null) {
				res += "\n\t\t(o aluno nao se encontra inscrito em nenhuma disciplina)";
			} else {
				for (Disciplina d : getDisciplinas()) {
					res += "\n\t\t" + d.nomeDisciplina;
				}
			}
		} else {
			res += "\n\t\t(o aluno nao se encontra matriculado)";
		}

		return res;
	}

	public int getNumAluno() {
		return this.numAluno;
	}

	private void setNumAluno() {
		this.numAluno = numUltimoAlunoMatriculado + 1;
		numUltimoAlunoMatriculado++;
	}

	public boolean getMatriculado() {
		return this.matriculado;
	}

	private void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	public int getAno() {
		return this.ano;
	}

	private void setAno(int ano) {
		this.ano = ano;
	}

	public char getTurma() {
		return this.turma;
	}

	private void setTurma(char turma) {
		this.turma = turma;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return this.disciplinas;
	}

	public void setDisciplinas(Disciplina disciplina) {
		if(this.disciplinas == null) {
			this.disciplinas = new ArrayList<Disciplina>();
		}

		this.disciplinas.add(disciplina);
	}
}
