package exercicio3;

// import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistarLivros {
	public static void main(String[] args) {
		String nome;
		ArrayList<String> autores = new ArrayList<>();
		Long isbn;
		// String isbnString;
		// LocalDate dataEdicao;
		// int numPaginas;
		// String editora;

		Scanner teclado = new Scanner(System.in);

		// Livro livro1 = new Livro("Verity", "Colleen Hoover", "9789896687403");
		// Livro livro2 = new Livro("Mein Kampf", "Adolf Hitler", "978-09-77476-07-7");

		// livro2.setEditora("Porto Editora");

		System.out.println("Qual o nome do livro: ");
		nome = teclado.nextLine();

		int nAutores = 0;
		do {
			System.out.println("Quantos autores tem o livro " + nome + 
			"???");
			nAutores = teclado.nextInt();
			teclado.nextLine();
			
			if(nAutores < 1) System.out.println("Tente de novo");
		} while(nAutores < 1);
		
		if(nAutores == 1) {
			System.out.println("Introduza o nome d@ autor/a: ");
			autores.add(teclado.nextLine());
		} else {
			for(int i = 0; i < nAutores; i++) {
				System.out.println("Introduza o nome d@ autor/a numero " +
				 (i + 1) + ": ");
				teclado.nextLine();
			}
		}

		System.out.println("Qual o ISBN do livro: ");
		isbn = teclado.nextLong();

		Livro livro1 = new Livro(nome, autores, isbn);

		teclado.nextLine();

		System.out.println("Qual o nome do livro: ");
		nome = teclado.nextLine();

		nAutores = 0;
		do {
			System.out.println("Quantos autores tem o livro " + nome +
					"???");
			nAutores = teclado.nextInt();
			teclado.nextLine();

			if (nAutores < 1)
				System.out.println("Tente de novo");
		} while (nAutores < 1);

		if (nAutores == 1) {
			System.out.println("Introduza o nome d@ autor/a: ");
			autores.add(teclado.nextLine());
		} else {
			autores.clear();
			for (int i = 0; i < nAutores; i++) {
				System.out.println("Introduza o nome d@ autor/a numero " +
						(i + 1) + ": ");
				teclado.nextLine();
			}
		}
		
		System.out.println("Qual o ISBN do livro: ");
		isbn = teclado.nextLong();

		teclado.close();

		Livro livro2 = new Livro(nome, autores, isbn);

		System.out.println("\nLivro 1: ");
		System.out.println(livro1.toString());

		System.out.println("\nLivro 2: ");
		System.out.println(livro2.toString());
	}
}
