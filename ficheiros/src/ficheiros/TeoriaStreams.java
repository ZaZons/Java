package ficheiros;

public class TeoriaStreams {
	// Caracteres - em termos de computadores, podem representar letras, d�gitos, ou caracteres especiais (som, controlo)
	// Na verdade, s�o combina��es de 0s e 1s~
	// Podem, inclusivamente, ser compostos por mais do que uma tecla -> exemplos \n e \\
	
	// Ao utilizarmos dados, agrupamos caracteres em CAMPOS (um conjunto de caracteres que tem determinado significado)
	// Por exemplo, os caracteres 'P', 'e', 'd', 'r' e 'o' podem simbolizar o primeiro nome de algu�m
	// Outros campos podem representar outras coisas como o apelido, o n�mero de cart�o de cidad�o, o n�mero de identifica��o fiscal, etc.
	// Os campos s�o agrupados para formarem REGISTOS (cole��o de campos que cont�m dados sobre determinada entidade).
	// Por exemplo, o NOME, APELIDO, N�MERO DE IDENTIFICA��O FISCAL, MORADA e SAL�RIO podem constituir o registo de um EMPREGADO.
	
	// At� podemos pensar nas classes(PESSOA, ESTUDANTE) e ver que os dados armazenados s�o REGISTOS. 
	// Estas classes cont�m vari�veis individuais que podem ser vistas como se fosse CAMPOS.
	
	// Podemos agrupar registos e criar FICHEIROS. Ficheiros de dados consistem no armazenamento de um conjunto de registos equivalentes.
	// Por exemplo, numa mpresa, podem conter os registos de cada empregado (um registo para cada empregado).
	
	// Os ficheiros podem ter dezenas de registos (por exemplo, para armazenar dados de uma turma), ou podem ter milh�es de registos.
	
	// Um ficheiro de dados pode ser utilizado como um FICHEIRO DE ACESSO SEQUENCIAL, 
	// em que os registos s�o acedidos um ap�s o outro na ordem em que foram armazenados.
	// Geralmente podemos escolher um dos campos e armazenar em ordem com base nos valores desse campo
	
	// Ao ser armazenarem registos num ficheiro, pode-se colocar um registo por linha ou pode-se utilizar um car�cter para dividir os registos (CSV).
	
	// Antes de uma aplica��o poder utilizar um ficheiro de dados, tem de abrir esse ficheiro.
	// No Java, abre-se um ficheiro criando um objeto e associando uma STREAM DE BYTES a esse objeto.

	// De forma similar, ao terminar de se utilizar um ficheiro, fecha-se o ficheiro (ou seja, deixa de estar dispon�vel para a aplica��o).
	// Se houver uma falha ao se fechar um ficheiro de eitura, geralmente n�o ocorrem problemas.
	// No entanto, se algo correr mal ao fechar um ficheiro em que se est� a escrever alguma coisa, os dados podem ficar corrompidos e inacess�veis.
	
	// Uma boa pr�tica � fechar TODOS os ficheiros que abrimos e fech�-los ASSIM QUE deixarem de ser necess�rios.
	
	// Apesar de os humanos olharem para os ficheiros como um conjunto de registos, e em cada registo existirem campos de dados, 
	// o Java n�o atribui automaticamente qualsquer significado aos dados.
	// O Java "v�" um ficheiro como sendo um conjunto de bytes.
	
	// Quando realizamos uma opera��o de ENTRADA numa determinada aplica��o, 
	// podemos imaginar os bytes a fluirem para o programa atrav�s de um dispositivo de entrada atrav�s de uma STREAM (fluxo de informa��o)
	// Esta STRAM funcion como uma conduta ou um canal.
	
	// Ao executarmos uma opera��o de sa�da, alguns dados fluem da aplica��o atrav�s de uma outra STREAM para um dispositivo de sa�da.
	
	// Uma STREAM � um OBJETO e tal como todos os objetos, tem DADOS e M�TODOS.
	
	// Estes m�todos s�o o que possibilitam realizar as opera��es de ABRIR, FECHAR, LER, ESCREVER, etc.
	
	// A maioria das STREAMS fluem numa �nica dire��o: cada STREAM � de ENTRADA ou de SA�DA 
	// (mas vamos ver que podem existir STREAMS que fazem as duas coisas simultaneamente)
	
	// Podemos abris diversas STREAM de uma s� vez, na nossa aplica��o. Por exemplo:
	// - Uma aplica��o l� informa��o a partir do disco e separa entre os registos v�lidos e inv�lidos:
	//     - Dados chegam atrav�s de uma stream de entrada
	//	   - Uma stream de sa�da escreve alguns registos num ficheiro de registos v�lidos
	//	   - Outra stream de sa�da escreve outros registos num ficheiro de registos inv�lidos
	
	// As opera��es de entrada e sa�da est�o entre as opera��es mais lentas nos sistemas inform�ticos (limita��es dos sistemas impostas pelo hardware)
	// Por essa raz�o, muitas aplica��es profissionais utilizam BUFFERS.
	// Estes permitem acumular as entradas ou sa�das antes de se executar o comando de E/S, melhorando a performance.
	// Ao se utilizarem buffers, muitas vezes � preciso limp�-lo (FLUSHING). Isto limpa os bytes existentes no buffer que n�o tenham sido lidos/escritos.

}
