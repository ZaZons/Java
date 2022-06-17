package exceptions;

public class ContaCliente {
	private int numConta;
	private double saldoConta;

	public static double LIMITE_MAXIMO_CREDITO = 20000.0;

	public ContaCliente(int num, double saldo) throws LimiteCreditoException {
		numConta = num;
		saldoConta = saldo;

		if(saldoConta > LIMITE_MAXIMO_CREDITO)
			throw(new LimiteCreditoException());
	}
}
