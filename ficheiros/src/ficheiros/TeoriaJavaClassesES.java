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
	
	// Esta é a hierarquia e relação de algumas classes de ES do Java
	
	// As classes InputStream, OutputStream e Reader são classes abstratas, ou seja, têm métodos que têm de ser reescritos (@Override) pelas classes filho.
	
	// A classe System contém um objeto do tipo PrintStream com o nome System.out (utilizamos muitas vezes com os métodos print() e println()
	// Além desta, a classe System também define um objeto do tipo PrintStream com o nome System.err.
	// A saída de System.out e System.err podem ir para o mesmo dispositivo (que efetivamente é o que acontece, como padrão, indo para a linha de comando do monitor)
	// A diferença é que a System.err é utilizada, normalmente, para as mensagens de erro
	// Mas podemos redirecionar qualquer uma delas para outro dispositivo (ficheiro, impressora, por exemplo).
	
	
}
