package ficheiros;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class EscreverNumFicheiroCSV {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Path ficheiro = Paths.get("D:\\a34080\\Exemplos\\Colaboradores.txt");
		
		String s = "";
		String delimitador = ",";

		int id;
		String nome;
		double valorHora;
		final int QUIT = 999;

		try {
			OutputStream saida = new BufferedOutputStream(Files.newOutputStream(ficheiro, CREATE));
			BufferedWriter escrita = new BufferedWriter(new OutputStreamWriter(saida));

			System.out.println("Introduza o ID do colaborador: ");
			id = teclado.nextInt();
			teclado.nextLine();

			while(id != 999) {
				System.out.println("Introduza o nome do colaborador #" + id + ": ");
				nome = teclado.nextLine();

				System.out.println("Introduza o valor do vencimento por hora: ");
				valorHora = teclado.nextDouble();
				teclado.nextLine();

				s = id + delimitador + nome + delimitador + valorHora;
				escrita.write(s);
				escrita.newLine();

				System.out.println("Introduza um novo ID ou entao " + QUIT + " se quiser terminar de inserir: ");
				id = teclado.nextInt();
				teclado.nextLine();
			}
			escrita.close();
			teclado.close();
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
