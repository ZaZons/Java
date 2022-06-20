package ficheiros;

import java.nio.file.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.*;

public class FicheirosRandomAccess {
	public static void main(String[] args) {
		Path ficheiro = Paths.get("D:\\a34080\\Exemplos\\Numeros.txt");
		String s = "QUACK";

		byte[] dados = s.getBytes();
		ByteBuffer saida = ByteBuffer.wrap(dados);
		FileChannel fc = null;

		try {
			fc = (FileChannel) Files.newByteChannel(ficheiro, READ, WRITE);
			fc.position(0);

			while(saida.hasRemaining()) {
				fc.write(saida);
			}
			saida.rewind();

			fc.position(22);
			while (saida.hasRemaining()) {
				fc.write(saida);
			}
			saida.rewind();
			
			fc.position(16);
			while (saida.hasRemaining()) {
				fc.write(saida);
			}
			saida.rewind();

			fc.close();
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
