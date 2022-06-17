package exceptions;

import java.util.Scanner;

public class ListaPrecosApp1 {
	public static void main(String[] args) {
		int item;
		final int itemMax = 3;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduza um numero: ");
		item = teclado.nextInt();
		try {
			ListaPrecos.mostrarPreco(item);
		} catch(IndexOutOfBoundsException e) {
			ListaPrecos.mostrarPreco(itemMax);
		}
		
		teclado.close();
	}
}
