package exceptions;

public class LimiteCreditoException extends Exception {
	public LimiteCreditoException() {
		super("O saldo do cliente e demasiado alto!!!");
	}
}