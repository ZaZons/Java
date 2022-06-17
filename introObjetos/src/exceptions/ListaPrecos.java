package exceptions;

public class ListaPrecos {
	private static final double[] listaPrecos = {12.3, 14.3, 53.1};

	public static void mostrarPreco(int i) throws IndexOutOfBoundsException{
		System.out.println(listaPrecos[i]);
	}
}
