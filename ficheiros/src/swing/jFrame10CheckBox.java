package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jFrame10CheckBox extends JFrame implements ItemListener {
	FlowLayout flow = new FlowLayout();
	JLabel lblPergunta = new JLabel("O que queres beber??? ");
	JLabel lblBebidas = new JLabel();
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

		ButtonGroup grupo = new ButtonGroup();
		JRadioButton sim = new JRadioButton("Yea", false);
		JRadioButton nao = new JRadioButton("nope", false);
		grupo.add(sim);
		grupo.add(nao);
		add(sim);
		add(nao);
		
		add(lblPergunta);
		add(cafe);
		add(cola);
		add(agua);
		add(leite);
		add(lblBebidas);
	}

	@Override
	public void itemStateChanged(ItemEvent check) {
		Object source = check.getItem();

		if(source == cafe) {
			int select = check.getStateChange();
			if(select ==ItemEvent.SELECTED) {
				lblBebidas.setText("O cafe foi selecionado");
			} else {
				lblBebidas.setText("O cafe deixou de estar selecionado");
			}
		}

		if (source == cola) {
			int select = check.getStateChange();
			if (select == ItemEvent.SELECTED) {
				lblBebidas.setText("A cola foi selecionada");
			} else {
				lblBebidas.setText("A cola deixou de estar selecionada");
			}
		}

		if (source == agua) {
			int select = check.getStateChange();
			if (select == ItemEvent.SELECTED) {
				lblBebidas.setText("A agua foi selecionada");
			} else {
				lblBebidas.setText("A agua deixou de estar selecionada");
			}
		}

		if (source == leite) {
			int select = check.getStateChange();
			if (select == ItemEvent.SELECTED) {
				lblBebidas.setText("O leite foi selecionado");
			} else {
				lblBebidas.setText("O leite deixou de estar selecionado");
			}
		}
	}
	
	public static void main(String[] args) {
		final int LARGURA = 350;
		final int ALTURA = 120;

		jFrame10CheckBox frame = new jFrame10CheckBox();
		frame.setSize(LARGURA, ALTURA);
		frame.setVisible(true);
	}
}
