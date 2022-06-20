package ficheiros;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
// import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class EscreverRegistos2 {

	public static void main(String[] args) {
		Path ficheiro = Paths.get("D:\\a34080\\Exemplos\\ColaboradoresAleatorios.txt");
		String s = "002,Ricardo,12.50" + System.getProperty("line.separator");

		final int TAM_REG = s.length();
		byte[] dados = s.getBytes();
		ByteBuffer buffer = ByteBuffer.wrap(dados);
		// final int NUMREGISTOS = 1000;
		FileChannel fc = null;

		try {
			fc = (FileChannel) Files.newByteChannel(ficheiro, READ, WRITE);	
			fc.position((2 - 1) * TAM_REG);
			fc.write(buffer);
			fc.close();		
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
