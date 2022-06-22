package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jFrame10CheckBox extends JFrame implements ItemListener {
	FlowLayout flow = new FlowLayout();
	JLabel lblPergunta = new JLabel("O que queres beber??? ");
	JCheckBox cafe = new JCheckBox("Cafe", false);
	JCheckBox cola = new JCheckBox("Cola", false);
	JCheckBox agua = new JCheckBox("Agua", false);
	JCheckBox leite = new JCheckBox("Leite", false);

	public jFrame10CheckBox() {
		super("Demonstracao de checkbox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(flow);
		lblPergunta.setFont(new Font("Comic Sans MS", Font.ITALIC, 22));

		cafe.addItemListener(this);
		cola.addItemListener(this);
		agua.addItemListener(this);
		leite.addItemListener(this);

		add(lblPergunta);
		add(cafe);
		add(cola);
		add(agua);
		add(leite);
	}

	@Override
	public void itemStateChanged(ItemEvent check) {

	}
	
	public static void main(String[] args) {
		final int LARGURA = 350;
		final int ALTURA = 120;

		jFrame10CheckBox frame = new jFrame10CheckBox();
		frame.setSize(LARGURA, ALTURA);
		frame.setVisible(true);
	}
}
