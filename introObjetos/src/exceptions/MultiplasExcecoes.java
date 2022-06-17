package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplasExcecoes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int numerador;
		int denominador;
		int res;

		try {
			System.out.println("Insira o numerador: ");
			numerador = teclado.nextInt();
			System.out.println("Insira o denominador: ");
			denominador = teclado.nextInt();

			res = numerador / denominador;
			System.out.println(numerador + " / " + denominador + " = " + res);
		} /* catch(ArithmeticException e) {
			System.out.println("Excecao aritmetica: " + e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("Excecao do tipo de entrada: " + e.getMessage());
		} catch(Exception e) {
			System.out.println("Erro!");
		} */catch(ArithmeticException | InputMismatchException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		teclado.close();
	}
}
