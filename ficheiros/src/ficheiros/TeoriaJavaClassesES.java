package ficheiros;

public class TeoriaJavaClassesES {

	/*
	Object
	|
	+--InputStream
	| |
	| +--FileInputStream
	| |
	| +--FilterInputStream
	| |
	| +--BufferedInputStream
	|
	+--OutputStream
	| |
	| +--FileOutputStream
	| |
	| +--FilterOutputStream
	| |
	| +--BufferedOutputStream
	| |
	| +--PrintStream
	|
	+--Reader
	|
	+--BufferedReader
	|
	+--BufferedWriter
	*/
	
	// Esta � a hierarquia e rela��o de algumas classes de ES do Java
	
	// As classes InputStream, OutputStream e Reader s�o classes abstratas, ou seja, t�m m�todos que t�m de ser reescritos (@Override) pelas classes filho.
	
	// A classe System cont�m um objeto do tipo PrintStream com o nome System.out (utilizamos muitas vezes com os m�todos print() e println()
	// Al�m desta, a classe System tamb�m define um objeto do tipo PrintStream com o nome System.err.
	// A sa�da de System.out e System.err podem ir para o mesmo dispositivo (que efetivamente � o que acontece, como padr�o, indo para a linha de comando do monitor)
	// A diferen�a � que a System.err � utilizada, normalmente, para as mensagens de erro
	// Mas podemos redirecionar qualquer uma delas para outro dispositivo (ficheiro, impressora, por exemplo).
	
	
}
