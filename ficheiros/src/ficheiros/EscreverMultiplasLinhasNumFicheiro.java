package ficheiros;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class EscreverMultiplasLinhasNumFicheiro {
	public static void main(String[] args) {
		Path ficheiro = Paths.get("D:\\a34080\\Exemplos\\ficheiroExemploMultiplasLinhas.txt");
		OutputStream saida = null;

		try {
			saida = new BufferedOutputStream(Files.newOutputStream(ficheiro, CREATE, APPEND));

			for(int i = 0; i < 10; i++) {
				String s = "Linha " + (i + 1) + " quack\n";
				byte[] dados = s.getBytes();
				saida.write(dados);
			}
			saida.flush();
			saida.close();
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
