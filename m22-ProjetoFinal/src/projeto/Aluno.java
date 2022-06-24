package projeto;

import java.io.OutputStreamWriter;
import java.io.BufferedOutputStream;
import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import static java.nio.file.StandardOpenOption.*;

public class Aluno extends Pessoa {
	int numAluno;
	boolean matriculado = false;
	int ano = 0;
	String turma = "";

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

  public static ArrayList<Aluno> lerFicheiroAlunos() {
    Path nomeFicheiro = Paths.get("Alunos.txt");
    Path ficheiro = nomeFicheiro.toAbsolutePath();
    System.out.println("Ficheiro: " + ficheiro);
    
    String delimitador = ",";
    String s = "";

    String nome;
    String apelido;
    long numCC;
    int numAluno;
    boolean matriculado = false;
    int ano = 0;
    String turma = "";
    String[] array = null;
    ArrayList<Aluno> alunos = new ArrayList<>();

    try {
      InputStream entrada = new BufferedInputStream(Files.newInputStream(ficheiro));
      BufferedReader leitor = new BufferedReader(new InputStreamReader(entrada));
      s = leitor.readLine();

      while(s != null) {
        array = s.split(delimitador);
        numAluno = Integer.parseInt(array[0]);
        nome = array[1];
        apelido = array[2];
        numCC = Long.parseLong(array[3]);

        Aluno alunoTemp = new Aluno(nome, apelido, numCC);
        alunoTemp.setNumAluno(numAluno);

        try {
          matriculado = Boolean.parseBoolean(array[4]);
          ano = Integer.parseInt(array[5]);
          turma = array[6];

          if(matriculado) {
            alunoTemp.matricularAluno(ano, turma, numAluno);
          }
        } catch (Exception e) {
          matriculado = false;
          ano = 0;
          turma = "";
        }
        alunos.add(alunoTemp);

        s = leitor.readLine();
      }
      leitor.close();
    } catch (Exception e) {}

    return alunos;
  }

  public static void escreverFicheiroAlunos(ArrayList<Aluno> alunos) {
    String nome;
    String apelido;
    long numCC;
    int numAluno;
    boolean matriculado = false;
    int ano = 0;
    String turma = "";
    
    Path nomeFicheiro = Paths.get("Alunos.txt");
    Path ficheiro = nomeFicheiro.toAbsolutePath();

    String delimitador = ",";
    String s = "";

    try {
      OutputStream saida = new BufferedOutputStream(Files.newOutputStream(ficheiro, WRITE, TRUNCATE_EXISTING));
      BufferedWriter escrita = new BufferedWriter(new OutputStreamWriter(saida));

      for (Aluno aluno : alunos) {
        nome = aluno.getNome();
        apelido = aluno.getApelido();
        numCC = aluno.getNumCC();
        numAluno = aluno.getNumAluno();
        matriculado = aluno.isMatriculado();

        if (!matriculado) {
          ano = 0;
          turma = "";
        } else {
          ano = aluno.getAno();
          turma = aluno.getTurma();
        }
        
        s = numAluno + delimitador + nome + delimitador + apelido + delimitador +
          numCC + delimitador + matriculado + delimitador + ano + delimitador + turma;

        escrita.write(s, 0, s.length());
        escrita.newLine();
      }
      escrita.close();
    } catch (Exception e) {}
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
