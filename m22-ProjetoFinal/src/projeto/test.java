package projeto;

public class test {

	public static void main(String[] args) {
		Pessoa pessoaTest = new Pessoa("testNome", "1" , 123456);
		Aluno alunoTest = new Aluno("testNome", "2", 123);

		System.out.println(pessoaTest);
		System.out.println(alunoTest);

		alunoTest.matricularAluno(10, "L", 21);

		System.out.println(alunoTest);
	}

}
