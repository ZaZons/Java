package ficheiros;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class EscreverRegistos {

	public static void main(String[] args) {
		Path ficheiro = Paths.get("D:\\a34080\\Exemplos\\ColaboradoresAleatorios.txt");
		String s = "000,	,00.00" + System.getProperty("line.separator");
		final int NUMREGISTOS = 1000;

		try {
			OutputStream saida = new BufferedOutputStream(Files.newOutputStream(ficheiro, CREATE));
			BufferedWriter escritor = new BufferedWriter(new OutputStreamWriter(saida));

			for(int i = 0; i < NUMREGISTOS; i++) {
				escritor.write(s, 0, s.length());
			}
			escritor.close();
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
