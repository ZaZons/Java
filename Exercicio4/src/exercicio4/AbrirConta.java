package exercicio4;

import java.time.LocalDate;
import java.util.Scanner;

public class AbrirConta {
	public static void main(String[] args) {
		int numCliente;
		String nomeCliente;
		String apelidoCliente;
		double saldoConta;
		double taxaJuro;
		int numeroConta;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduza o numero de cliente: ");
		numCliente = teclado.nextInt();

		teclado.nextLine();

		Cliente cliente = new Cliente(numCliente);
		ContaBancaria contaCliente = new ContaBancaria(cliente);
		
		System.out.println(dadosString(numCliente, cliente, contaCliente));
		
		System.out.println("Introduza o nome do cliente: ");
		nomeCliente = teclado.nextLine();
		cliente.setNomeCliente(nomeCliente);
		
		System.out.println("Introduza o apelido do cliente: ");
		apelidoCliente = teclado.nextLine();
		cliente.setApelidoCliente(apelidoCliente);

		System.out.println("Introduza o saldo da conta: ");
		saldoConta = teclado.nextDouble();
		contaCliente.setSaldoConta(saldoConta);

		teclado.nextLine();

		do {
			System.out.println("Introduza a taxa de juro da conta: ");
			taxaJuro = teclado.nextDouble();
			if(taxaJuro > 0 & taxaJuro < 100) {
				contaCliente.setTaxaJuro(taxaJuro * .01);
			} else {
				System.out.println("Introduza um numero entre 0 e 100 e tente novamente.");
			}
		} while(taxaJuro < 0 | taxaJuro > 100);

		System.out.println("Introduza o numero da conta: ");
		numeroConta = teclado.nextInt();
		contaCliente.setNumConta(numeroConta);

		contaCliente.setDataAberturaConta(LocalDate.now());

		System.out.println(dadosString(numCliente, cliente, contaCliente));

		teclado.close();
	}

	static String dadosString(int numCliente, Cliente cliente, ContaBancaria contaCliente) {
		String dados = "";
		dados += "Cliente '" + numCliente + "'";
		dados += "\n\tNome completo: " + cliente.getNomeCliente() + " " + cliente.getApelidoCliente();
		dados += "\n\tNumero da conta: " + contaCliente.getNumConta();
		dados += "\n\tNumero de cliente: " + cliente.getNumCliente();
		dados += "\n\tSaldo da conta: " + contaCliente.getSaldoConta();
		LocalDate data = contaCliente.getDataAberturaConta();
		dados += "\n\tData de abertura da conta: " + data.getDayOfMonth() + "/" + data.getMonthValue() + "/" +
				data.getYear();

		return dados;
	}
}
