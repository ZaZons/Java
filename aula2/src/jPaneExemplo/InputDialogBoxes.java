package jPaneExemplo;

import javax.swing.JOptionPane;

public class InputDialogBoxes {
	public static void main(String[] args) {
		String nome;
		nome = JOptionPane.showInputDialog(null, "Como te chamas???");
		
		String morada;
		morada = JOptionPane.showInputDialog(null,
			"Qual e a tua morada " + nome + "???",
			"Morada",
			JOptionPane.QUESTION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Ola, " + 
			nome + ", que vives em " + morada + "!");
	}
}
