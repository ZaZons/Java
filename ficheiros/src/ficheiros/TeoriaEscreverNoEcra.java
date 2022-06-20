package ficheiros;

import java.io.OutputStream;

public class TeoriaEscreverNoEcra {

	public static void main(String[] args) {

		// Apesar de n�o ser necess�rio, habitualmente, podemos criar o nosso pr�prio objeto OutputStream e associ�-lo a System.out
		// Vamos ver um exemplo
		String s = "ABCDF";
		byte[] dados = s.getBytes();
		OutputStream saida = null;
		try {
			saida = System.out; // Associamos a OutputStrem ao objeto System.out
			saida.write(dados); // Enviamos os dados (bytes) para o objeto sa�da
			saida.flush(); // Limpamos o buffer
			saida.close(); // Fechamos a stream
		} catch (Exception e) {
			System.out.println("Menssagem de erro: " + e.getMessage());
		}

	}

}
