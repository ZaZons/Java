package exceptions;

import java.util.Scanner;

public class VariosInteiros {
	public static void main(String[] args) {
		int[] lista = {0, 0, 0};
		int x;
		Scanner teclado = new Scanner(System.in);
		
		for(x = 0; x < lista.length; x++) {
			try{
				System.out.println("Introduza um numero inteiro: ");
				teclado.nextInt();
			} catch(Exception e) {
				System.out.println("Ocorreu uma excecao");
			}
			teclado.nextLine();
			teclado.close();
		}

		System.out.println("Os numeros existentes na lista sao: ");
		for(x = 0; x < lista.length; x++) {
			System.out.println(lista[x] + " ");
		}

	}
}
