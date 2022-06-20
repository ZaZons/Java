package ficheiros;

public class TeoriaStreams {
	// Caracteres - em termos de computadores, podem representar letras, dígitos, ou caracteres especiais (som, controlo)
	// Na verdade, são combinações de 0s e 1s~
	// Podem, inclusivamente, ser compostos por mais do que uma tecla -> exemplos \n e \\
	
	// Ao utilizarmos dados, agrupamos caracteres em CAMPOS (um conjunto de caracteres que tem determinado significado)
	// Por exemplo, os caracteres 'P', 'e', 'd', 'r' e 'o' podem simbolizar o primeiro nome de alguém
	// Outros campos podem representar outras coisas como o apelido, o número de cartão de cidadão, o número de identificação fiscal, etc.
	// Os campos são agrupados para formarem REGISTOS (coleção de campos que contêm dados sobre determinada entidade).
	// Por exemplo, o NOME, APELIDO, NÚMERO DE IDENTIFICAÇÃO FISCAL, MORADA e SALÁRIO podem constituir o registo de um EMPREGADO.
	
	// Até podemos pensar nas classes(PESSOA, ESTUDANTE) e ver que os dados armazenados são REGISTOS. 
	// Estas classes contêm variáveis individuais que podem ser vistas como se fosse CAMPOS.
	
	// Podemos agrupar registos e criar FICHEIROS. Ficheiros de dados consistem no armazenamento de um conjunto de registos equivalentes.
	// Por exemplo, numa mpresa, podem conter os registos de cada empregado (um registo para cada empregado).
	
	// Os ficheiros podem ter dezenas de registos (por exemplo, para armazenar dados de uma turma), ou podem ter milhões de registos.
	
	// Um ficheiro de dados pode ser utilizado como um FICHEIRO DE ACESSO SEQUENCIAL, 
	// em que os registos são acedidos um após o outro na ordem em que foram armazenados.
	// Geralmente podemos escolher um dos campos e armazenar em ordem com base nos valores desse campo
	
	// Ao ser armazenarem registos num ficheiro, pode-se colocar um registo por linha ou pode-se utilizar um carácter para dividir os registos (CSV).
	
	// Antes de uma aplicação poder utilizar um ficheiro de dados, tem de abrir esse ficheiro.
	// No Java, abre-se um ficheiro criando um objeto e associando uma STREAM DE BYTES a esse objeto.

	// De forma similar, ao terminar de se utilizar um ficheiro, fecha-se o ficheiro (ou seja, deixa de estar disponível para a aplicação).
	// Se houver uma falha ao se fechar um ficheiro de eitura, geralmente não ocorrem problemas.
	// No entanto, se algo correr mal ao fechar um ficheiro em que se está a escrever alguma coisa, os dados podem ficar corrompidos e inacessíveis.
	
	// Uma boa prática é fechar TODOS os ficheiros que abrimos e fechá-los ASSIM QUE deixarem de ser necessários.
	
	// Apesar de os humanos olharem para os ficheiros como um conjunto de registos, e em cada registo existirem campos de dados, 
	// o Java não atribui automaticamente qualsquer significado aos dados.
	// O Java "vê" um ficheiro como sendo um conjunto de bytes.
	
	// Quando realizamos uma operação de ENTRADA numa determinada aplicação, 
	// podemos imaginar os bytes a fluirem para o programa através de um dispositivo de entrada através de uma STREAM (fluxo de informação)
	// Esta STRAM funcion como uma conduta ou um canal.
	
	// Ao executarmos uma operação de saída, alguns dados fluem da aplicação através de uma outra STREAM para um dispositivo de saída.
	
	// Uma STREAM é um OBJETO e tal como todos os objetos, tem DADOS e MÉTODOS.
	
	// Estes métodos são o que possibilitam realizar as operações de ABRIR, FECHAR, LER, ESCREVER, etc.
	
	// A maioria das STREAMS fluem numa única direção: cada STREAM é de ENTRADA ou de SAÍDA 
	// (mas vamos ver que podem existir STREAMS que fazem as duas coisas simultaneamente)
	
	// Podemos abris diversas STREAM de uma só vez, na nossa aplicação. Por exemplo:
	// - Uma aplicação lê informação a partir do disco e separa entre os registos válidos e inválidos:
	//     - Dados chegam através de uma stream de entrada
	//	   - Uma stream de saída escreve alguns registos num ficheiro de registos válidos
	//	   - Outra stream de saída escreve outros registos num ficheiro de registos inválidos
	
	// As operações de entrada e saída estão entre as operações mais lentas nos sistemas informáticos (limitações dos sistemas impostas pelo hardware)
	// Por essa razão, muitas aplicações profissionais utilizam BUFFERS.
	// Estes permitem acumular as entradas ou saídas antes de se executar o comando de E/S, melhorando a performance.
	// Ao se utilizarem buffers, muitas vezes é preciso limpá-lo (FLUSHING). Isto limpa os bytes existentes no buffer que não tenham sido lidos/escritos.

}
