package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class jFrame11ComboBox extends JFrame implements ItemListener {

	public jFrame11ComboBox() {
		super("Demonstracao de checkbox");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JComboBox<String> listaEscolhas = new JComboBox<>();
		listaEscolhas.addItem("Portugues");
		listaEscolhas.addItem("Ingles");
		listaEscolhas.addItem("Matematica");
		
		add(listaEscolhas);

		JButton buttonMostrar = new JButton("Mostrar");
		add(buttonMostrar);
		buttonMostrar.addActionListener(listaEscolhas);

		JLabel opcaoEscolhida = new JLabel();
		add(opcaoEscolhida);
		

	}
	
	@Override
	public void itemStateChanged(ItemEvent check) {
	}

	public static void main(String[] args) {
		
	}
}
