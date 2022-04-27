package variaveis;

public class ExemplosUsoVariaveis {
	public static void main(String[] args) {
		int dataDebito = 1;
		System.out.println("O valor e debitado no dia");
		System.out.println(dataDebito);
		System.out.println(" do mes.");
		System.out.println("Proximo pagamento: " + dataDebito + " de maio");

		int qtdNotasPositivas = 5;
		int qtdNotasNegativas = 3;

		System.out.println("O numero total de avaliacoes foi " + qtdNotasPositivas + qtdNotasNegativas);
		System.out.println("O numero total de avaliacoes foi " + (qtdNotasPositivas + qtdNotasNegativas));

		int x = 3;
		int y = 4;
		System.out.println("Valores de x e y originais: ");
		System.out.println("Valores de x e: " + x);
		System.out.println("Valores de y e: " + y);

		int z;
		z = x;
		x = y;
		y = z;

		System.out.println("Valores de x e y depois de trocados: ");
		System.out.println("Valores de x e: " + x);
		System.out.println("Valores de y e: " + y);
	}
}
