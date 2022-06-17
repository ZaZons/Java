package exceptions;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numerador;
		int denominador;
		int res;

		System.out.println("Insira o numerador: ");
		numerador = teclado.nextInt();
		System.out.println("Insira o denominador: ");
		denominador = teclado.nextInt();

		// if(denominador == 0) {
		// System.out.println("Impossivel dividir por 0");
		// } else {
		// res = numerador / denominador;
		// System.out.println(numerador + " / " + denominador + " = " + res);
		// }
		try {
			res = numerador / denominador;
			System.out.println(numerador + " / " + denominador + " = " + res);
		} catch(ArithmeticException e) {
			System.out.println("Excecao aritmetica");
		}
		
		teclado.close();
	}

}
