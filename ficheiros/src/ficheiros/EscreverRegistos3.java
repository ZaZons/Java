package ficheiros;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;

public class EscreverRegistos3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Path ficheiro = Paths.get("D:\\a34080\\Exemplos\\ColaboradoresAleatorios.txt");
		String s = "000,       ,00.00" + System.getProperty("line.separator");
		final int TAM_REG = s.length();
		FileChannel fc = null;

		String delimitador = ",";
		String stringId;
		int id;
		String nome;
		String valorHora;
		final String QUIT = "999";

		try {
			fc = (FileChannel) Files.newByteChannel(ficheiro, READ, WRITE);
			
			System.out.println("Introduza o id: ");
			stringId = entrada.nextLine();

			while(!(stringId == QUIT)) {
				id = Integer.parseInt(stringId);

				System.out.println("Introduza o nome do colaborador #" + id + ": ");
				nome = entrada.nextLine();

				System.out.println("Insira o valor/hora de remuneracao: ");
				valorHora = entrada.nextLine();

				s = stringId + delimitador + nome + delimitador + valorHora + System.getProperty("line.separator");

				byte[] dados = s.getBytes();
				ByteBuffer buffer = ByteBuffer.wrap(dados);

				fc.position((id - 1) * TAM_REG);
				fc.write(buffer);
				
				System.out.println("Introduza novo ID ou entao o valor " + QUIT + " para sair: ");
				stringId = entrada.nextLine();
			}
			fc.close();
			entrada.close();
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
