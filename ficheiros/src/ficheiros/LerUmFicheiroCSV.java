package ficheiros;

import java.nio.file.*;
import java.io.*;

public class LerUmFicheiroCSV {
	public static void main(String[] args) {
		Path ficheiro = Paths.get("D:\\a34080\\Exemplos\\Colaboradores.txt");
		String s = "";

		String[] array = new String[3];
		String delimitador = ",";
		int id;
		String nome;
		double valorHora;
		double valorSemanal;
		final double HRS_SEMANA = 35;
		double total = 0;

		try {
			InputStream entrada = new BufferedInputStream(Files.newInputStream(ficheiro));
			BufferedReader leitor = new BufferedReader(new InputStreamReader(entrada));

			System.out.println();
			s = leitor.readLine();

			while(s != null) {
				array = s.split(delimitador);
				id = Integer.parseInt(array[0]);
				nome = array[1];
				valorHora = Double.parseDouble(array[3]);

				valorSemanal = valorHora * HRS_SEMANA;
				System.out.println("ID#" + id + " " + nome + " " + valorHora + " " + valorSemanal);
				total += valorSemanal;

				s = leitor.readLine();
			}
			leitor.close();
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		System.out.println("total: " + total);
	}
}
