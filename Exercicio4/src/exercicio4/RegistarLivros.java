package exercicio4;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistarLivros {
	public static void main(String[] args) {
		String nomeLivro;
		ArrayList<String> autorLivro = new ArrayList<>();
//		String isbnString;
		long isbnLong;
//		LocalDate dataEdicaoLivro;
//		int numPaginasLivro;
//		String editoraLivro;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduza o nome do livro: ");
		nomeLivro = teclado.nextLine();

		int numAutores;
		do {
			System.out.println("Introduza o numero de autores: ");
			numAutores = teclado.nextInt();
			teclado.nextLine();

			if(numAutores < 1) {
				System.out.println("O número tem de ser igual ou superior a 1. Tente novamente!");
			} else if(numAutores == 1){
				System.out.println("Introduza o nome do/a autor/a: ");
				autorLivro.add(teclado.nextLine());
			} else if(numAutores > 1) {
				for(int i = 0; i < numAutores; i++) {
					System.out.println("Introduza o nome do/a " + (i + 1) + "o autor/a: ");
					autorLivro.add(teclado.nextLine());
				}
			}
		} while(numAutores < 1);

		System.out.println("Introduza o ISBN: ");
		isbnLong = teclado.nextLong();

		Livro livro1 = new Livro(nomeLivro, autorLivro, isbnLong);
		System.out.println(livro1);

		teclado.nextLine();

		//Segundo Livro
		System.out.println("Introduza o nome do livro: ");
		nomeLivro = teclado.nextLine();
		
		autorLivro = new ArrayList<>();

		do {
			System.out.println("Introduza o numero de autores: ");
			numAutores = teclado.nextInt();
			teclado.nextLine();

			if(numAutores < 1) {
				System.out.println("O número tem de ser igual ou superior a 1. Tente novamente!");
			} else if(numAutores == 1){
				System.out.println("Introduza o nome do/a autor/a: ");
				autorLivro.add(teclado.nextLine());
			} else if(numAutores > 1) {
				for(int i = 0; i < numAutores; i++) {
					System.out.println("Introduza o nome do/a " + (i + 1) + "o autor/a: ");
					autorLivro.add(teclado.nextLine());
				}
			}
		} while (numAutores < 1);

		System.out.println("Introduza o ISBN: ");
		isbnLong = teclado.nextLong();
		teclado.nextLine();

		Livro livro2 = new Livro(nomeLivro, autorLivro, isbnLong);
		System.out.println(livro2);
		
		teclado.close();
	}
}
