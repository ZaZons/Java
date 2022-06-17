package ficheiros;

import java.io.*;
import java.nio.file.*;
import static java.nio.file.AccessMode.*;

public class ExemploFileSystem {
	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();

		Path path1 = fs.getPath("D:\\Exemplos\\ficheiroExemplo.txt");
		Path path2 = fs.getPath("D:" + fs.getSeparator() + "Exemplos" + fs.getSeparator() + "ficheiroExemplo2.txt");
		Path path3 = Paths.get("D:\\Exemplos\\ficheiroExemplo3.txt");

		System.out.println(path1.toString());
		System.out.println(path2.toString());
		System.out.println(path3.toString());

		Path caminhoPasta1 = fs.getPath("D:\\Exemplos\\Pasta1");
		try {
			Files.delete(caminhoPasta1);
			System.out.println("A pasta " + caminhoPasta1.toString() + " foi apagada");
		} catch (NoSuchFileException e) {
			System.out.println("Não existe a pasta " + caminhoPasta1.toString());
		} catch (DirectoryNotEmptyException e) {
			System.out.println("A pasta " + caminhoPasta1.toString() + " não está vazia");
		} catch (SecurityException e) {
			System.out.println("Não tem permissões para apagar a pasta    " + caminhoPasta1.toString());
		} catch (IOException e) {
			System.out.println("Exceção de E/S");
		}

		Path caminhoFicheiro1 = fs.getPath("D:\\Exemplos\\Pasta1\\ficheiroExemplo1");
		try {
			Files.delete(caminhoPasta1);
			System.out.println("A pasta " + caminhoPasta1.toString() + " foi apagada");
		} catch (NoSuchFileException e) {
			System.out.println("Não existe a pasta " + caminhoPasta1.toString());
		} catch (DirectoryNotEmptyException e) {
			System.out.println("A pasta " + caminhoPasta1.toString() + " não está vazia");
		} catch (SecurityException e) {
			System.out.println("Não tem permissões para apagar a pasta    " + caminhoPasta1.toString());
		} catch (IOException e) {
			System.out.println("Exceção de E/S");
		}

		/* s */

	}
}