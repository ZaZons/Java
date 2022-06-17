package exceptions;

import javax.swing.JOptionPane;

public class ContaClienteApp1 {
	public static void main(String[] args) {
		int num;
		double saldo;
		String entrada;

		entrada = JOptionPane.showInputDialog(null, "Introduza o numero da conta: ");
		num = Integer.parseInt(entrada);

		entrada = JOptionPane.showInputDialog(null, "Introduza o saldo em divida da conta: ");
		saldo = Double.parseDouble(entrada);

		try{
			ContaCliente cc = new ContaCliente(num, saldo);
			JOptionPane.showMessageDialog(null, "O cliente #" + num + " tem um saldo devedor de " + saldo);
		} catch(LimiteCreditoException e) {
			JOptionPane.showMessageDialog(null, "Cliente #" + num + " tem um saldo devedor de " + saldo + " que esta acima do limite de credito");
		}
	}	
}
