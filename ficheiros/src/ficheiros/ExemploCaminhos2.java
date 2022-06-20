package ficheiros;

import java.nio.file.*;
import java.util.Scanner;

public class ExemploCaminhos2 {

	public static void main(String[] args) {String nomeFicheiro;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduza o nome do ficheiro >> ");
		nomeFicheiro = teclado.nextLine();
		teclado.nextLine();
		Path caminhoEntrada = Paths.get(nomeFicheiro);
		Path caminhoTotal = caminhoEntrada.toAbsolutePath();
		System.out.println("O caminho total é " + caminhoTotal.toString());
		teclado.close();
		
		
	}
}
