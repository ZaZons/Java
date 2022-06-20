package ficheiros;

import java.nio.file.*;
import java.io.*;

public class LerUmFicheiroComVariasLinhas {

	public static void main(String[] args) {
		Path ficheiro = Paths.get("D:\\a34080\\Exemplos\\ficheiroExemploMultiplasLinhas.txt");
		InputStream entrada = null;

		try {
			entrada = Files.newInputStream(ficheiro);
			BufferedReader leitor = new BufferedReader(new InputStreamReader(entrada));
			String s = null;

			while((s = leitor.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
