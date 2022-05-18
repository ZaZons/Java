package exercicio3;

/**
 * Esta classe cria uma calculadora que pode adicionar, subtrair, multiplicar, dividir e fazer o modulo entre 2 numeros
 */
public class Calculadora {
	public static void main(String[] args) {
		Calculadora minhaCalculadora = new Calculadora();

		System.out.println(minhaCalculadora.adicionar(9, 13));
		System.out.println(minhaCalculadora.subtrair(41, 18));
	}

	public int adicionar(int a, int b) {
		return a + b;
	}

	public int subtrair(int a, int b) {
		return a - b;
	}

	public int multiplicar(int a, int b) {
		return a * b;
	}

	public int dividir(int a, int b) {
		return a / b;
	}

	public int modulo(int a, int b) {
		return a % b;
	}
}
