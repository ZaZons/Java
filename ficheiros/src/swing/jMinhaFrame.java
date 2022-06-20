package swing;

import javax.swing.*;

public class jMinhaFrame extends JFrame {
	final int LARGURA = 350;
	final int ALTURA = 200;

	public jMinhaFrame() {
		super("Minha frame");
		setSize(LARGURA, ALTURA);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
