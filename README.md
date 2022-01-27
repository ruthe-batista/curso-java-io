# O objetivo desse readme é mostrar alguns conceitos e classes do pacote java.io

Para trabalhar com entrada e saída de dados são utilizadas as classes que estão dentro do java.io.

As entradas e saídas de dados são manipuladas como sequência de bytes, através das classes InputStream e OutputStream e as classes dependentes.

## Classe InputStream

É uma classe abstrata que oferece a funcionalidade básica para a leitura de um byte ou de uma sequência de bytes a partir de alguma fonte.

**Algumas subclasses de InputStream são:**

* FileInputStream – nos permite ler um arquivo qualquer e retornar os dados em byte.
* FilterInputStream – Filtra os dados de um InputStream.
* BufferedInputStream – Faz a leitura de grandes volumes de bytes que armazena em um buffer interno.

## OutputStream

É uma classe abstrata que transfere sequencialmente os bytes para algum destino. O método write(), tem a função de escrever em forma de bytes para o destino onde vai enviar.

## Reader

É uma classe abstrata sendo igual à InputStream, é voltada para a manipulação de caracteres. Nessa classe não é possível criar objetos diretos dela. Para criar objetos é necessário instanciar uma das subclasses concretas para ter o acesso à funcionalidade especificada por Reader.

## Writer

É uma classe abstrata que escreve stream de caracteres. Os únicos métodos que uma subclasse writer deve implementar são: write(char [], int, int), flush () e close ().

<h3> Um programa que precisa ler algum dado, precisa de um InputStream ou Reader. Mas se precisar escrever algum dado utilizará um OutputStream ou Writer.<h3>

## Stream 

É um fluxo de dados, para a leitura ou escrita. Imagine como uma conexão para uma fonte ou destino de dados que podem ser passados via byte ou character.

## Buffers

No Buffer existe uma área de memória que é utilizada para armazenamento temporário dos elementos que foram produzidos, mas ainda não foram consumidos.

## flush()

Quando alguma escrita é feita em um arquivo em disco, pode ser que este dado ainda não tenha sido de fato escrito no disco, esteja em algum local na memória esperando o momento exato para ser gravado. O método flush() força que este dado seja escrito no disco ou em qualquer outro local que você esteja tentando gravar.
## close()

O método close() deve ser chamado para fechar a escrita do arquivo e evitar que este fique aberto, o ideal é que o close() fique no bloco finally de uma try-catch.

