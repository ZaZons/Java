package exercicio4;

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
	}

	public Livro(String nomeLivro, ArrayList<String> autorLivro, String isbn) {
		this.nomeLivro = nomeLivro;
		this.autorLivro = autorLivro;
		this.isbn = isbn;
	}

	public Livro(String nomeLivro, ArrayList<String> autorLivro, long isbn) {
		this.nomeLivro = nomeLivro;
		this.autorLivro = autorLivro;
		this.isbn = formatIsbn(isbn);
	}

	String formatIsbn(long isbn) {
		StringBuilder isbnString = new StringBuilder(String.valueOf(isbn));
		isbnString.insert(3, "-");
		isbnString.insert(6, "-");
		isbnString.insert(12, "-");
		isbnString.insert(15, "-");

		return isbnString.toString();
	}

	public String toString() {
		String resultado = "";
		resultado += "\nNome do livro: " + nomeLivro;

		int i = 1;
		for (String autor : this.autorLivro) {
			resultado += "\n" + i + "o autor: " + autor;
			i++;
		}

		resultado += "\nISBN: " + isbn;
		resultado += "\nData de edicao: " + dataEdicaoLivro;
		resultado += "\nNumero de paginas: " + numPaginasLivro;
		resultado += "\nEditora: " + editoraLivro;

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
