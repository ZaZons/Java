package exceptions;

import javax.swing.JOptionPane;

public class ExemploExcecao {
	public static void main(String[] args) {
		int numerador = 0;
		int denominador = 0;
		int res = 0;

		String stringEntrada;

		try {
			stringEntrada = JOptionPane.showInputDialog(null, "Introduza o numerador: ");
			numerador = Integer.parseInt(stringEntrada);
			stringEntrada = JOptionPane.showInputDialog(null, "Introduza o denominador: ");
			denominador = Integer.parseInt(stringEntrada);

			res = numerador / denominador;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}

		JOptionPane.showMessageDialog(null, numerador + " / " + denominador + " = " + res);
	}
}
