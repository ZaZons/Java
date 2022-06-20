package ficheiros;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class EscreverUmFicheiro {
	public static void main(String[] args) {
		Path ficheiro = Paths.get("D:\\a34080\\Exemplos\\ficheiroExemplo.txt");
		String s = "new String quack";

		byte[] dados = s.getBytes();
		OutputStream saida = null;

		try {
			saida = new BufferedOutputStream(Files.newOutputStream(ficheiro, CREATE));
			
			saida.write(dados);
			saida.flush();
			saida.close();
		} catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
