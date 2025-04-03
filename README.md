# 🔤 Verificador de Anagramas em Java

Este projeto implementa um verificador de anagramas utilizando a linguagem **Java**.  
O programa recebe duas palavras como entrada, compara seus caracteres e determina se são anagramas.

---

## ✅ Funcionalidades

- Recebe duas palavras como entrada via `Scanner`
- Converte os caracteres para minúsculas para garantir comparações corretas
- Ordena os caracteres **manualmente usando Bubble Sort** (sem depender de `Arrays.sort()`)
- Exibe:
  - `"Anagrams"` se as palavras forem anagramas
  - `"Not Anagrams"` caso contrário

---

## 🛠️ Tecnologias Utilizadas

- Java
- Estruturas de dados (arrays e ordenação)
- Entrada de dados via `Scanner`

---

## ⚙️ Como Funciona

1. O usuário insere duas palavras.
2. O programa converte as palavras para minúsculas e as transforma em arrays de caracteres.
3. Os arrays são ordenados manualmente utilizando o algoritmo **Bubble Sort**.
4. Após a ordenação, os arrays são comparados caractere por caractere.
5. Se forem idênticos, as palavras são anagramas. Caso contrário, não são.

---

## ▶️ Como Executar

Compile o código com:

```sh
javac Solution.java
