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
			if(d.nomeDisciplina == "Portugues") {
				d.professor = professorPaulo;
			}
		}
		
		System.out.println(professorPaulo);

		//Apresentar as disciplinas lecionadas pelo professor Paulo
		System.out.println("Disciplinas lecionadas pelo professor " + professorPaulo.getNome() + " " + professorPaulo.getApelido() + ": ");
		for(Disciplina d : disciplinas) {
			if(d.professor != null) {
				if(d.professor.getNome() == professorPaulo.getNome()) {
					if(d.professor.getApelido() == professorPaulo.getApelido()) {
						System.out.println(d.nomeDisciplina);
						System.out.println(d.ano);
						System.out.println(d.turma);
					}
				}
			}
		}

		//Criar o objeto da professora Dina
		dataNascimento = LocalDate.parse("1974-06-19", DateTimeFormatter.ISO_DATE);
		Professor professoraDina = new Professor("Dina", "Santos", 1059754010, dataNascimento, 3, 1879.22);

		// Adicionar a professora Dina as disciplinas de matematica
		for (Disciplina d : disciplinas) {
			if (d.nomeDisciplina == "Matematica") {
				d.professor = professoraDina;
			}
		}
		
		System.out.println(professoraDina);

		// Apresentar as disciplinas lecionadas pela professora Dina
		System.out.println("Disciplinas lecionadas pela professora " + professoraDina.getNome() + " "
				+ professoraDina.getApelido() + ": ");
		for (Disciplina d : disciplinas) {
			if (d.professor != null) {
				if (d.professor.getNome() == professoraDina.getNome()) {
					if (d.professor.getApelido() == professoraDina.getApelido()) {
						System.out.println(d.nomeDisciplina);
						System.out.println(d.ano);
						System.out.println(d.turma);
					}
				}
			}
		}

		// Criar o objeto da professora Perpetua
		dataNascimento = LocalDate.parse("1952-04-25", DateTimeFormatter.ISO_DATE);
		Professor professoraPerpetua = new Professor("Perpetua", "Gomes", 4568297, dataNascimento, 10, 4263.22);

		professoraPerpetua.setAposentado(true);

		System.out.println(professoraPerpetua);
	}
}
