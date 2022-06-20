package swing;

import javax.swing.*;
import java.awt.*;

public class jFrame6FLowLayout {
	public static void main(String[] args) {
		final int LARGURA_FRAME = 350;
		final int ALTURA_FRAME = 200;
		
		JFrame umaFrame = new JFrame("Sexta frame");
		umaFrame.setSize(LARGURA_FRAME, ALTURA_FRAME);
		umaFrame.setVisible(true);
		umaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel cumprimento = new JLabel("Hello quack");
		JLabel cumprimento2 = new JLabel("Quem es tu???");

		umaFrame.setLayout(new FlowLayout());
		umaFrame.add(cumprimento);
		umaFrame.add(cumprimento2);
	}
}
