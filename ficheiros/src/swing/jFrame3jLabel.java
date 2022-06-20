package swing;

import java.awt.Font;

import javax.swing.*;

public class jFrame3jLabel {
	public static void main(String[] args) {
		final int LARGURA_FRAME = 500;
		final int ALTURA_FRAME = 300;
		Font fonteTitulo = new Font("Arial", Font.BOLD, 36);

		JFrame.setDefaultLookAndFeelDecorated(true);
		
		JFrame umaFrame = new JFrame("Terceira frame");
		umaFrame.setSize(LARGURA_FRAME, ALTURA_FRAME);
		umaFrame.setVisible(true);
		umaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel cumprimento = new JLabel("Quack!!!");
		cumprimento.setFont(fonteTitulo);
		umaFrame.add(cumprimento);
	}
}
