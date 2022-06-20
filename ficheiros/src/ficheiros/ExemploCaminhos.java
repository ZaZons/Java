package ficheiros;

import java.nio.file.*;

public class ExemploCaminhos {

	public static void main(String[] args) {
		
		Path caminho = Paths.get("D:\\Exemplos\\ficheiroExemplo.txt");
		int contador = caminho.getNameCount();
		System.out.println("O caminho � " + caminho.toString());
		System.out.println("O nome do ficheiro � " + caminho.getFileName());
		System.out.println("O caminho inclui " + contador + " elementos ao longo do percurso.");
		for (int x = 0; x < contador; x++) {
			System.out.println("\tElemento " + x + " � " + caminho.getName(x));
		}
	}
}
