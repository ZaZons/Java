package variaveis;

import javax.swing.JOptionPane;

public class LeituraDadosJPane {
	public static void main(String[] args) {
		String nome;
		String temp;
		int idade;
		byte qtdBits;
		short qtdDiasAno;
		long distAlphaCentauri;

		nome = JOptionPane.showInputDialog(null,
			"Introduza o seu nome",
			"NOME",
			JOptionPane.INFORMATION_MESSAGE);
		
		temp = JOptionPane.showInputDialog(null,
			"Introduza a sua idade",
			"IDADE",
			JOptionPane.INFORMATION_MESSAGE);

		idade = Integer.parseInt(temp);

		temp = JOptionPane.showInputDialog(null,
			"Qual a quantidade de bits num byte???",
			"BITS & BYTES",
			JOptionPane.INFORMATION_MESSAGE);
		
		qtdBits = Byte.parseByte(temp);

		temp = JOptionPane.showInputDialog(null,
			"Introduza o numero de dias de um ano:",
			"DIAS",
			JOptionPane.INFORMATION_MESSAGE);

		qtdDiasAno = Short.parseShort(temp);

		temp = JOptionPane.showInputDialog(null,
			"Qual a distancia a q se encontra Alpha Centauri da terra???(em kms)",
			"ALPHA CENTAURI",
			JOptionPane.INFORMATION_MESSAGE);

		distAlphaCentauri = Long.parseLong(temp);

		int mostrarResultados;
		boolean selecao;
		
		mostrarResultados = JOptionPane.showConfirmDialog(null, "Qeures ver os valores que introduziste???");
		selecao = (mostrarResultados == JOptionPane.YES_NO_OPTION);

		if(selecao) {
			JOptionPane.showMessageDialog(null,
				"Ola, " + nome + "com " + idade + "anos" + "\nRespondeste que: \n1 byte = " + qtdBits + "\nO ano tem " + qtdDiasAno + "\nAlpha Centauri esta a " + distAlphaCentauri + "kms",
				"RESULTADOS",
				JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, 
				"Erro critico: n querer ver os resultados!!!",
				"ERRO",
				JOptionPane.ERROR_MESSAGE);
		}
	}
}
