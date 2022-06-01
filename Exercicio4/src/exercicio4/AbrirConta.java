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
		
		System.out.println(dadosString(numCliente, contaCliente));
		
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
		teclado.nextLine();

		contaCliente.setNumConta(numeroConta);

		contaCliente.setDataAberturaConta(LocalDate.now());

		System.out.println(dadosString(numCliente, contaCliente));

		System.out.println("Introduza o valor a despositar na conta: ");
		double adicionarSaldo = teclado.nextDouble();

		teclado.nextLine();

		contaCliente.depositarValor(adicionarSaldo);

		System.out.println(dadosString(numCliente, contaCliente));

		boolean saldoSuficiente = false;
		do {
			System.out.println("Introduza o valor a levantar da conta: ");
			double levantarSaldo = teclado.nextDouble();

			teclado.nextLine();

			saldoSuficiente = contaCliente.levantarValor(levantarSaldo);
			if (saldoSuficiente) {
				System.out.println("Levantou " + levantarSaldo + " euros");
			} else {
				System.out.println("Nao tem saldo suficiente, tente de novo");
			}
		} while(!saldoSuficiente);
		
		System.out.println(dadosString(numCliente, contaCliente));

		System.out.println("Introduza o numero de anos a que pretende saber qual sera o seu saldo: ");
		int anos = teclado.nextInt();

		teclado.nextLine();

		System.out.println("Com um saldo inicial de " + contaCliente.getSaldoConta() + ", com uma taxa de juros de " + (contaCliente.getTaxaJuro() * 100) + "%, ao final de " + anos + " anos o saldo sera de " + contaCliente.calcularJuro(anos));

		Cliente cliente3 = new Cliente(3);
		ContaOrdem contaCliente3 = new ContaOrdem(cliente3, "Conta a Ordem");

		System.out.println("Introduza o nome do cliente: ");
		nomeCliente = teclado.nextLine();
		contaCliente3.getCliente().setNomeCliente(nomeCliente);

		System.out.println("Introduza o apelido do cliente: ");
		apelidoCliente = teclado.nextLine();
		contaCliente3.getCliente().setApelidoCliente(apelidoCliente);

		System.out.println("Introduza o saldo da conta: ");
		saldoConta = teclado.nextDouble();
		contaCliente3.setSaldoConta(saldoConta);

		contaCliente3.setDataAberturaConta(LocalDate.now());

		System.out.println(dadosString(contaCliente3.getCliente().getNumCliente(), contaCliente3));

		System.out.println("FIM");
		
		teclado.close();
	}

	static String dadosString(int numCliente, ContaBancaria contaCliente) {
		String dados = "";
		dados += "Cliente '" + numCliente + "'";
		dados += "\n\tNome completo: " + contaCliente.getCliente().getNomeCliente() + " " + contaCliente.getCliente().getApelidoCliente();
		dados += "\n\tNumero da conta: " + contaCliente.getNumConta();
		dados += "\n\tNumero de cliente: " + contaCliente.getCliente().getNumCliente();
		dados += "\n\tSaldo da conta: " + contaCliente.getSaldoConta();
		LocalDate data = contaCliente.getDataAberturaConta();
		dados += "\n\tData de abertura da conta: " + data.getDayOfMonth() + "/" + data.getMonthValue() + "/" +
				data.getYear();

		return dados;
	}
}
