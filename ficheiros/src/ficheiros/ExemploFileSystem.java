package ficheiros;

import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

import static java.nio.file.AccessMode.*;

import java.io.IOException;

public class ExemploFileSystem {

	public static void main(String[] args) {

		FileSystem fs = FileSystems.getDefault(); // � new Filesystems (plural)
		// FileSystem, sem "s" no final, � utilizado para instanciar o objeto.
		// Filesystems (com "s"), � uma classe que cont�m m�todos de f�brica qwue
		// auxiliam na cria��o de objetos

		// -> Criar a pasta D:\Exemplos
		// -> Criar o ficheiro de texto, vazio, D:\Exemplos\ficheiroExemplo.txt
		// -> Criar o ficheiro de texto, vazio, D:\Exemplos\ficheiroExemplo2.txt
		// -> Colocar o ficheiro D:\Exemplos\ficheiroExemplo2.txt em modo Read-Only

		// Definir o caminho para os ficheiros
		Path path1 = fs.getPath("D:\\Exemplos\\ficheiroExemplo.txt");
		// ou
		Path path2 = fs.getPath("D:" + fs.getSeparator() + "Exemplos" + fs.getSeparator() + "ficheiroExemplo2.txt");
		// ou
		Path path3 = Paths.get("D:\\\\Exemplos\\\\ficheiroExemplo3.txt"); // Este n�o existe

		System.out.println(path1.toString());
		System.out.println(path2.toString());
		System.out.println(path3.toString());

		// Converter de caminho relativo para caminho absoluto
		/*
		 * String nomeFicheiro; Scanner teclado = new Scanner(System.in);
		 * System.out.print("Introduza o nome do ficheiro >> "); nomeFicheiro =
		 * teclado.nextLine(); Path caminhoEntrada = fs.getPath(nomeFicheiro); Path
		 * caminhoTotal = caminhoEntrada.toAbsolutePath();
		 * System.out.println("O caminho total � " + caminhoTotal.toString());
		 * teclado.close();
		 */

		//
		try {
			path1.getFileSystem().provider().checkAccess(path1, READ);
			System.out.println("O ficheiro " + path1.toString() + " pode ser lido!");
			path1.getFileSystem().provider().checkAccess(path1, EXECUTE);
			System.out.println("O ficheiro " + path1.toString() + " pode ser executado!");
			path1.getFileSystem().provider().checkAccess(path1, WRITE);
			System.out.println("O ficheiro " + path1.toString() + " pode ser escrito!");
		} catch (IOException e) {
			System.out.println("O ficheiro \" + path1.toString() + \" n�o pode ser utilizado por esta aplica��o");
		}

		try {
			path2.getFileSystem().provider().checkAccess(path2, READ);
			System.out.println("O ficheiro " + path2.toString() + " pode ser lido por esta aplica��o!");
		} catch (IOException e) {
			System.out.println("O ficheiro " + path2.toString() + " n�o pode ser lido por esta aplica��o");
		}
		try {
			path2.getFileSystem().provider().checkAccess(path2, EXECUTE);
			System.out.println("O ficheiro " + path2.toString() + " pode ser executado por esta aplica��o!");
		} catch (IOException e) {
			System.out.println("O ficheiro " + path2.toString() + " n�o pode ser executado por esta aplica��o");
		}
		try {
			path2.getFileSystem().provider().checkAccess(path2, WRITE);
			System.out.println("O ficheiro " + path2.toString() + " pode ser escrito por esta aplica��o!");
		} catch (IOException e) {
			System.out.println("O ficheiro " + path2.toString() + " n�o pode ser escrito por esta aplica��o!");
		}
		// TOCTTOU bug = ocorreu alguma altera��o desde "Time Of Check To Time Of Use"

		// -> Criar a pasta D:\Exemplos\Pasta1
		// -> Criar a pasta D:\Exemplos\Pasta1\Pasta1A
		// -> Criar a pasta D:\Exemplos\Pasta1\Pasta1B
		// -> Criar a pasta D:\Exemplos\Pasta2
		// -> Criar a pasta D:\Exemplos\Pasta2\Pasta2A
		// -> Criar a pasta D:\Exemplos\Pasta2\Pasta2B
		// -> Criar o ficheiro de texto, vazio, D:\Exemplos\Pasta1\ficheiroExemplo1.txt
		// -> Criar o ficheiro de texto, vazio, D:\Exemplos\Pasta2\Pasta2A\ficheiroExemplo2A.txt
		// -> Colocar o ficheiro D:\Exemplos\Pasta2\Pasta2A\ficheiroExemplo2A.txt em modo Read-Only

		// Tentar apagar uma pasta que n�o esteja vazia
		Path caminhoPasta1 = fs.getPath("D:\\Exemplos\\Pasta1");
		try {
			Files.delete(caminhoPasta1);
			System.out.println("A pasta " + caminhoPasta1.toString() + " foi apagada");
		} catch (NoSuchFileException e) {
			System.out.println("N�o existe a pasta " + caminhoPasta1.toString());
		} catch (DirectoryNotEmptyException e) {
			System.out.println("a pasta " + caminhoPasta1.toString() + " n�o est� vazia");
		} catch (SecurityException e) {
			System.out.println("N�o tem permiss�es para apagar a pasta " + caminhoPasta1.toString());
		} catch (IOException e) {
			System.out.println("Exce��o de E/S");
		}

		// Tentar apagar uma pasta que esteja vazia
		Path caminhoPasta1A = fs.getPath("D:\\Exemplos\\Pasta1\\Pasta1A");
		try {
			Files.delete(caminhoPasta1A);
			System.out.println("A pasta " + caminhoPasta1A.toString() + " foi apagada");
		} catch (NoSuchFileException e) {
			System.out.println("N�o existe a pasta " + caminhoPasta1A.toString());
		} catch (DirectoryNotEmptyException e) {
			System.out.println("a pasta " + caminhoPasta1A.toString() + " n�o est� vazia");
		} catch (SecurityException e) {
			System.out.println("N�o tem permiss�es para apagar a pasta " + caminhoPasta1A.toString());
		} catch (IOException e) {
			System.out.println("Exce��o de E/S");
		}

		// Tentar apagar uma pasta que n�o exista
		Path caminhoPasta3 = fs.getPath("D:\\Exemplos\\Pasta3");
		try {
			Files.delete(caminhoPasta3);
			System.out.println("A pasta " + caminhoPasta3.toString() + " foi apagada");
		} catch (NoSuchFileException e) {
			System.out.println("N�o existe a pasta " + caminhoPasta3.toString());
		} catch (DirectoryNotEmptyException e) {
			System.out.println("a pasta " + caminhoPasta3.toString() + " n�o est� vazia");
		} catch (SecurityException e) {
			System.out.println("N�o tem permiss�es para apagar a pasta " + caminhoPasta3.toString());
		} catch (IOException e) {
			System.out.println("Exce��o de E/S");
		}

		// Tentar apagar um ficheiro que esteja em modo Read-Only
		Path caminhoFicheiro2A = fs.getPath("D:\\Exemplos\\Pasta2\\Pasta2A\\ficheiroExemplo2A.txt");
		try {
			Files.delete(caminhoFicheiro2A);
			System.out.println("O ficheiro " + caminhoFicheiro2A.toString() + " foi apagado");
		} catch (NoSuchFileException e) {
			System.out.println("N�o existe o ficheiro " + caminhoFicheiro2A.toString());
		} catch (DirectoryNotEmptyException e) {
			System.out.println("a pasta n�o est� vazia");
		} catch (SecurityException e) {
			System.out.println("N�o tem permiss�es para apagar o ficheiro " + caminhoFicheiro2A.toString());
		} catch (IOException e) {
			System.out.println("Exce��o de E/S - ter� permiss�es de escrita no ficheiro?");
		}

		// Tentar apagar um ficheiro
		Path caminhoFicheiro1 = fs.getPath("D:\\Exemplos\\Pasta1\\ficheiroExemplo1.txt");
		try {
			Files.delete(caminhoFicheiro1);
			System.out.println("O ficheiro " + caminhoFicheiro1.toString() + " foi apagado/a");
		} catch (NoSuchFileException e) {
			System.out.println("N�o existe o ficheiro " + caminhoFicheiro1.toString());
		} catch (DirectoryNotEmptyException e) {
			System.out.println("a pasta n�o est� vazia");
		} catch (SecurityException e) {
			System.out.println("N�o tem permiss�es para apagar o ficheiro " + caminhoFicheiro1.toString());
		} catch (IOException e) {
			System.out.println("Exce��o de E/S");
		}

		// Tentar apagar um ficheiro inexistente
		Path caminhoFicheiro3 = fs.getPath("D:\\Exemplos\\ficheiroExemplo3.txt");
		try {
			Files.delete(caminhoFicheiro3);
			System.out.println("O ficheiro " + caminhoFicheiro3.toString() + " foi apagado/a");
		} catch (NoSuchFileException e) {
			System.out.println("N�o existe o ficheiro " + caminhoFicheiro3.toString());
		} catch (DirectoryNotEmptyException e) {
			System.out.println("a pasta n�o est� vazia");
		} catch (SecurityException e) {
			System.out.println("N�o tem permiss�es para apagar o ficheiro " + caminhoFicheiro3.toString());
		} catch (IOException e) {
			System.out.println("Exce��o de E/S");
		}

		// Ler os atributos de um ficheiro
		try {
			BasicFileAttributes attr = Files.readAttributes(caminhoFicheiro2A, BasicFileAttributes.class);
			System.out.println("Altura em que foi criado " + attr.creationTime());
			System.out.println("Altura em que foi realizada a �ltima altera��o " + attr.lastModifiedTime());
			System.out.println("Tamanho " + attr.size() + " bytes");
		} catch (IOException e) {
			System.out.println("Exce��o de E/S");
		}

		// Comparar os atributos (altura de cria��o) de ficheiros
		try {
			BasicFileAttributes attr1 = Files.readAttributes(path1, BasicFileAttributes.class);
			BasicFileAttributes attr2 = Files.readAttributes(path2, BasicFileAttributes.class);

			FileTime altura1 = attr1.creationTime();
			FileTime altura2 = attr2.creationTime();
			System.out.println("A altura de cria��o do ficheiro " + path1.toString() + " foi: " + altura1);
			System.out.println("A altura de cria��o do ficheiro " + path2.toString() + " foi: " + altura2);
			if (altura1.compareTo(altura2) < 0)
				System.out.println("O ficheiro " + path1.toString() + " foi criado antes do ficheiro " + path2.toString());
			else if (altura1.compareTo(altura2) > 0)
				System.out.println("O ficheiro " + path1.toString() + " foi criado depois do ficheiro " + path2.toString());
			else
				System.out.println("Os ficheiros " + path1.toString() + " e " + path2.toString() + " foram criados na mesma altura!" );
		} catch (IOException e) {
			System.out.println("Exce��o de E/S");
		}

	}

}
