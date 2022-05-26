package exercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Livro {
	String nomeLivro;
	ArrayList<String> autorLivro;
	String isbn;
	LocalDate dataEdicaoLivro;
	int numPaginasLivro;
	String editoraLivro;

	public Livro(String nomeLivro, ArrayList<String> autorLivro) {
		this.nomeLivro = nomeLivro;
		this.autorLivro = autorLivro;
		dataEdicaoLivro = LocalDate.now();
	}

	public Livro(String nomeLivro, ArrayList<String> autorLivro, String isbn) {
		this.nomeLivro = nomeLivro;
		this.autorLivro = autorLivro;
		this.isbn = isbn;
		dataEdicaoLivro = LocalDate.now();
	}
	
	public Livro(String nomeLivro, ArrayList<String> autorLivro, long isbn) {
		this.nomeLivro = nomeLivro;
		this.autorLivro = autorLivro;
		this.isbn = isbnLongToString(isbn);
		dataEdicaoLivro = LocalDate.now();
	}

	private String isbnLongToString(Long isbn) {
		StringBuilder isbnString = new StringBuilder(isbn.toString());
		isbnString.insert(3, "-");
		isbnString.insert(6, "-");
		isbnString.insert(12, "-");
		isbnString.insert(15, "-");
		System.out.println(isbnString);

		return isbnString.toString();
	}

	public String toString() {
		String resultado = new String();
		resultado += "\tNome: " + this.nomeLivro + "\n";

		int i = 1;
		for(String autor : this.autorLivro) {
			resultado += "\t" + i + "o autor: " + autor + "\n";
			i++;
		}

		resultado += "\tISBN: " + isbn + "\n";
		resultado += "\tData de edicao: " + this.dataEdicaoLivro.getDayOfMonth() + "/" +
				this.dataEdicaoLivro.getMonthValue() + "/" + this.dataEdicaoLivro.getYear() + "\n";

		resultado += "\tNumero de paginas: " + this.numPaginasLivro + "\n";
		resultado += "\tEditora: " + this.editoraLivro + "\n";

		return resultado;
	}

	public String getNomeLivro() {
		return this.nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public ArrayList<String> getAutorLivro() {
		return this.autorLivro;
	}

	public void setAutorLivro(ArrayList<String> autorLivro) {
		this.autorLivro = autorLivro;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public LocalDate getDataEdicaoLivro() {
		return this.dataEdicaoLivro;
	}

	public void setDataEdicaoLivro(LocalDate dataEdicaoLivro) {
		this.dataEdicaoLivro = dataEdicaoLivro;
	}

	public int getNumPaginasLivro() {
		return this.numPaginasLivro;
	}

	public void setNumPaginasLivro(int numPaginasLivro) {
		this.numPaginasLivro = numPaginasLivro;
	}

	public String getEditoraLivro() {
		return this.editoraLivro;
	}

	public void setEditoraLivro(String editoraLivro) {
		this.editoraLivro = editoraLivro;
	}
}
