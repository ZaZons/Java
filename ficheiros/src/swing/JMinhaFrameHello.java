package swing;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JMinhaFrameHello extends JFrame implements ActionListener {
	JLabel pergunta = new JLabel("Como te chamas??? ");
	Font fonteGrande = new Font("Arial", Font.BOLD, 16);

	JTextField resposta = new JTextField(10);

	JButton clicar = new JButton("Click me");
	JButton sair = new JButton("Exit");

	JLabel cumprimento = new JLabel();

	final int LARGURA = 275;
	final int ALTURA = 225;

	public JMinhaFrameHello() {
		super("Frame de hello");
		setSize(LARGURA, ALTURA);
		setLayout(new FlowLayout());
		
		pergunta.setFont(fonteGrande);
		cumprimento.setFont((fonteGrande));

		add(pergunta);
		add(resposta);
		add(clicar);
		add(cumprimento);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		clicar.addActionListener(this);
		sair.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object origem = e.getSource();

		if(origem == clicar) {
			String nome = resposta.getText();
			String cumprimentar = "ola " + nome + "!";
			cumprimento.setText(cumprimentar);
		} else if(origem == sair) {
			cumprimento.setText("sair");
		} else if(origem instanceof JTextField) {
			int fontSize = fonteGrande.getSize();
			fonteGrande = new Font("Arial", Font.BOLD, fontSize + 1);
		}
	}
}
