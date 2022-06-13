package teste01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TestarPrograma {
	public static void main(String[] args) {
		//ArrayList das disciplinas de matematica
		ArrayList<Disciplina> disciplinasMatematica = new ArrayList<Disciplina>();
		disciplinasMatematica.add(new Disciplina("Matematica", 10, 'A'));
		disciplinasMatematica.add(new Disciplina("Matematica", 10, 'B'));
		disciplinasMatematica.add(new Disciplina("Matematica", 10, 'C'));
		disciplinasMatematica.add(new Disciplina("Matematica", 11, 'A'));
		disciplinasMatematica.add(new Disciplina("Matematica", 11, 'B'));

		//ArrayList das disciplinas de portugues
		ArrayList<Disciplina> disciplinasPortugues = new ArrayList<Disciplina>();
		disciplinasPortugues.add(new Disciplina("Portugues", 10, 'A'));
		disciplinasPortugues.add(new Disciplina("Portugues", 10, 'B'));
		disciplinasPortugues.add(new Disciplina("Portugues", 10, 'C'));
		disciplinasPortugues.add(new Disciplina("Portugues", 11, 'A'));
		disciplinasPortugues.add(new Disciplina("Portugues", 11, 'B'));

		//ArrayList de todas as disciplinas
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		disciplinas.addAll(disciplinasMatematica);
		disciplinas.addAll(disciplinasPortugues);

		//Criar o objeto do professor Paulo
		LocalDate dataNascimento = LocalDate.parse("1969-03-12", DateTimeFormatter.ISO_DATE);
		Professor professorPaulo = new Professor("Paulo", "Silva", 837532898, dataNascimento, 4, 2006.25);

		//Adicionar o professor Paulo as disciplinas de portugues
		for(Disciplina d : disciplinas) {
			if(d.getNomeDisciplina() == "Portugues") {
				d.setProfessor(professorPaulo);
			}
		}
		
		System.out.println(professorPaulo);

		//Apresentar as disciplinas lecionadas pelo professor Paulo
		System.out.println("Disciplinas lecionadas pelo professor " + professorPaulo.getNome() + " " + professorPaulo.getApelido() + ": ");
		for(Disciplina d : disciplinas) {
			if(d.getProfessor() != null) {
				if(d.getProfessor().getNome() == professorPaulo.getNome()) {
					if(d.getProfessor().getApelido() == professorPaulo.getApelido()) {
						System.out.println("\t" + d.getNomeDisciplina() + " do " + d.getAno() +
							"o " + d.getTurma());
					}
				}
			}
		}

		//Criar o objeto da professora Dina
		dataNascimento = LocalDate.parse("1974-06-19", DateTimeFormatter.ISO_DATE);
		Professor professoraDina = new Professor("Dina", "Santos", 1059754010, dataNascimento, 3, 1879.68);

		// Adicionar a professora Dina as disciplinas de matematica
		for (Disciplina d : disciplinas) {
			if (d.getNomeDisciplina() == "Matematica") {
				d.setProfessor(professoraDina);
			}
		}
		
		System.out.println(professoraDina);

		// Apresentar as disciplinas lecionadas pela professora Dina
		System.out.println("Disciplinas lecionadas pela professora " + professoraDina.getNome() + " "
				+ professoraDina.getApelido() + ": ");
		for (Disciplina d : disciplinas) {
			if (d.getProfessor() != null) {
				if (d.getProfessor().getNome() == professoraDina.getNome()) {
					if (d.getProfessor().getApelido() == professoraDina.getApelido()) {
						System.out.println("\t" + d.getNomeDisciplina() + " do " + d.getAno() +
								"o " + d.getTurma());
					}
				}
			}
		}

		// Criar o objeto da professora Perpetua
		dataNascimento = LocalDate.parse("1952-04-25", DateTimeFormatter.ISO_DATE);
		Professor professoraPerpetua = new Professor("Perpetua", "Gomes", 4568297, dataNascimento, 10, 4263.22);

		professoraPerpetua.setAposentado(true);

		System.out.println(professoraPerpetua);

		//Apresentar salario da professora Perpetura
		System.out.println("O valor do salario liquido da professora " + professoraPerpetua.getNome() + " " + professoraPerpetua.getApelido() + " seria de: " + professoraPerpetua.getSalarioLiquido());

		
		//Criar o aluno Tiago
		dataNascimento = LocalDate.parse("2005-03-01", DateTimeFormatter.ISO_DATE);
		Aluno alunoTiago = new Aluno("Tiago", "Marques", 15678678, dataNascimento);
		
		//Matricular o aluno e inscreve-lo nas disciplinas da turma
		alunoTiago.matricularAluno(11, 'B');
		for(Disciplina d : disciplinas) {
			if(d.getAno() == alunoTiago.getAno()) {
				if(d.getTurma() == alunoTiago.getTurma()) {
					alunoTiago.setDisciplinas(d);
				}
			}
		}

		System.out.println(alunoTiago);


		//Criar o aluno Joao
		dataNascimento = LocalDate.parse("2005-04-25", DateTimeFormatter.ISO_DATE);
		Aluno alunoJoao = new Aluno("Joao", "Faria", 15236241, dataNascimento);

		// Matricular o aluno e inscreve-lo nas disciplinas da turma
		alunoJoao.matricularAluno(11, 'B');
		for (Disciplina d : disciplinas) {
			if (d.getAno() == alunoJoao.getAno()) {
				if (d.getTurma() == alunoJoao.getTurma()) {
					alunoJoao.setDisciplinas(d);
				}
			}
		}

		System.out.println(alunoJoao);

		// Criar o aluno Goncalo
		dataNascimento = LocalDate.parse("2005-09-11", DateTimeFormatter.ISO_DATE);
		Aluno alunoGoncalo = new Aluno("Goncalo", "Ferreira", 15183729, dataNascimento);

		System.out.println(alunoGoncalo);

		alunoTiago.matricularAluno(10, 'C');
	}
}
