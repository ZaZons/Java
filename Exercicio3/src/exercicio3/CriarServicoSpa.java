package exercicio3;

import java.util.Scanner;

public class CriarServicoSpa {
	public static void main(String[] args) {
		String servico;
		double preco;

		ServicoSpa primeiroServico = new ServicoSpa();
		ServicoSpa segundoServico = new ServicoSpa();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduza a descricao do primeiro servico: ");
		servico = teclado.nextLine();
		System.out.println("Introduza o preco do primeiro servico: ");
		preco = teclado.nextDouble();

		primeiroServico.setDescricaoServico(servico);
		primeiroServico.setPreco(preco);

		teclado.nextLine();
		
		System.out.println("Introduza a descricao do segundo servico: ");
		servico = teclado.nextLine();
		System.out.println("Introduza o preco do segundo servico: ");
		preco = teclado.nextDouble();

		segundoServico.setDescricaoServico(servico);
		segundoServico.setPreco(preco);

		System.out.println("Descricao do primeiro servico: " + 
			primeiroServico.getDescricaoServico());
		System.out.println("Preco do primeiro servico: " + 
			primeiroServico.getPreco());
		
		System.out.println("Descricao do segundo servico: " +
			segundoServico.getDescricaoServico());
		System.out.println("Preco do segundo servico: " +
			segundoServico.getPreco());

		teclado.close();
	}
}
