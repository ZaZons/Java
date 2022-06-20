package swing;

import javax.swing.*;

public class jFrame5LayoutManager {
	public static void main(String[] args) {
		final int LARGURA_FRAME = 350;
		final int ALTURA_FRAME = 200;
		
		JFrame umaFrame = new JFrame("Quinta frame");
		umaFrame.setSize(LARGURA_FRAME, ALTURA_FRAME);
		umaFrame.setVisible(true);
		umaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel cumprimento = new JLabel("Hello quack");
		JLabel cumprimento2 = new JLabel("Quem es tu???");

		umaFrame.add(cumprimento);
		umaFrame.add(cumprimento2);
	}
}
