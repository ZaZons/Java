package ficheiros;

import java.nio.file.*;
import java.io.*;

public class LerUmFicheiro {
	public static void main(String[] args) {
		Path ficheiro = Paths.get("D:\\a34080\\Exemplos\\ficheiroExemplo.txt");
		InputStream entrada = null;

		try {
			entrada = Files.newInputStream(ficheiro);
			BufferedReader leitor = new BufferedReader(new InputStreamReader(entrada));

			String s = null;
			s = leitor.readLine();

			System.out.println(s);
			entrada.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
