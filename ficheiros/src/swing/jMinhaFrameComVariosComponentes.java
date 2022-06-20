package swing;

import java.awt.*;
import javax.swing.*;

public class jMinhaFrameComVariosComponentes extends JFrame {
	final int LARGURA = 350;
	final int ALTURA = 200;

	public jMinhaFrameComVariosComponentes() {
		super("Usar varios componentes");
		setSize(LARGURA, ALTURA);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel cabecalho = new JLabel("Esta frame tem varios componentes");
		cabecalho.setFont(new Font("Arial", Font.BOLD, 16));

		JLabel pedidoNome = new JLabel("Introduza o seu nome");
		JTextField campoNome = new JTextField(12);

		JButton botao = new JButton("Clicar para continuar");
		setLayout(new FlowLayout());

		add(cabecalho);
		add(pedidoNome);
		add(campoNome);
		add(botao);
	}
}
