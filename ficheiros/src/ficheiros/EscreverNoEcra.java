package ficheiros;

import java.io.OutputStream;

public class EscreverNoEcra {
	public static void main(String[] args) {
		String s = "ABCDEF";
		System.out.println(s);

		byte[] dados = s.getBytes();
		OutputStream saida = null;

		try {
			saida = System.out;
			saida.write(dados);
			saida.flush();
			saida.close();
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}