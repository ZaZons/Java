package variaveis;

import java.util.Scanner;

public class LeituraDados {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner dispositivoEntrada = new Scanner(System.in);
		String nome;
		int idade;

		System.out.println("Qual a sua idade??? ");
		idade = dispositivoEntrada.nextInt();

		dispositivoEntrada.nextLine();

		System.out.println("nome??? ");
		nome = dispositivoEntrada.nextLine();

		System.out.println("ola " + nome + " voce tem " + idade + " anos");

		byte qtdBits;
		System.out.println("Qual a quantidade de bits num byte??? ");
		qtdBits = dispositivoEntrada.nextByte();

		dispositivoEntrada.nextLine();

		short qtdDiasAno;
		System.out.println("Introduza o numero de dias de um ano: ");
		qtdDiasAno = dispositivoEntrada.nextShort();

		dispositivoEntrada.nextLine();

		long distAlphaCentauri;
		System.out.println("Qual a distancia a q se encontra Alpha Centauri da terra???(em kms) ");
		distAlphaCentauri = dispositivoEntrada.nextLong();

		System.out.println("Respondeu que: ");
		System.out.println("Um byte tem: " + qtdBits + " bits");
		System.out.println("Um ano tem: " + qtdDiasAno + " dias");
		System.out.println("Alpha Centauri encontra-se a: " + distAlphaCentauri + " kms");
	}
}
