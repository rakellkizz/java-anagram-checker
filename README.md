Verificador de Anagramas em Java
Este projeto implementa um verificador de anagramas utilizando a linguagem Java. O programa recebe duas palavras como entrada, compara seus caracteres e determina se são anagramas.

Funcionalidades:
✅ Aceita duas palavras como entrada via Scanner
✅ Converte os caracteres para minúsculas para garantir comparações corretas
✅ Ordena os caracteres manualmente usando Bubble Sort (sem depender de Arrays.sort())
✅ Exibe a mensagem "Anagrams" caso as palavras sejam anagramas e "Not Anagrams" caso contrário

Tecnologias utilizadas:
Java

Estruturas de dados (arrays e ordenação)

Entrada de dados via Scanner

Como funciona?
O usuário insere duas palavras.

O programa converte as palavras para minúsculas e as transforma em arrays de caracteres.

Os arrays são ordenados manualmente utilizando o algoritmo Bubble Sort.

Após a ordenação, os arrays são comparados caractere por caractere.

Se forem idênticos, as palavras são anagramas. Caso contrário, não são.

Como executar:
Compile o código com:

sh
Copiar
Editar
javac Solution.java
Execute o programa:

sh
Copiar
Editar
java Solution
Insira duas palavras para verificar se são anagramas.

