package ficheiros;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class LerFicheirosAcessoDireto {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Path ficheiro = Paths.get("D:\\a34080\\Exemplos\\ColaboradoresAleatorios.txt");
		String s = "000,       ,00.00" + System.getProperty("line.separator");
		final int TAM_REG = s.length();
		FileChannel fc = null;

		String stringId;
		int id;
		final String QUIT = "999";

		byte[] dados = s.getBytes();
		ByteBuffer buffer = ByteBuffer.wrap(dados);

		try {
			fc = (FileChannel) Files.newByteChannel(ficheiro, READ, WRITE);
			System.out.println("Introduza o id do colaborador ou " + QUIT + " para sair: ");
			stringId = teclado.nextLine();

			while(stringId != QUIT) {
				id = Integer.parseInt(stringId);
				buffer = ByteBuffer.wrap(dados);

				fc.position((id - 1) * TAM_REG);
				fc.read(buffer);

				s = new String(dados);

				System.out.println("ID #" + id + " " + s);
				System.out.println("Introduza o id do colaborador ou " + QUIT + " para sair: ");
				stringId = teclado.nextLine();
			}
			fc.close();
			teclado.close();
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
