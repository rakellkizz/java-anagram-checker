import java.util.Scanner;

public class Solution {
    /**
     * Verifica se duas strings sao anagramas.
     * Dois textos sao anagramas se contiverem as mesmas letras na mesma quantidade,
     * mas em qualquer ordem.
     *
     * @param a Primeira string.
     * @param b Segunda string.
     * @return true se forem anagramas, false caso contrario.
     */
    public static boolean isAnagram(String a, String b) {
        // Se os tamanhos forem diferentes, nao podem ser anagramas
        if (a.length() != b.length()) {
            return false;
        }

        // Converte as strings para minusculas e transforma em arrays de caracteres
        char[] arrA = a.toLowerCase().toCharArray();
        char[] arrB = b.toLowerCase().toCharArray();

        // Ordena ambos os arrays para comparacao
        sortArray(arrA);
        sortArray(arrB);

        // Compara os arrays ordenados
        for (int i = 0; i < arrA.length; i++) {
            if (arrA[i] != arrB[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Metodo para ordenar um array de caracteres utilizando o Bubble Sort.
     * @param array Array de caracteres a ser ordenado.
     */
    public static void sortArray(char[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Troca os elementos adjacentes se estiverem fora de ordem
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Metodo principal que recebe entrada do usuario, chama a funcao de verificacao
     * e imprime o resultado.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Lendo as duas palavras de entrada
        String a = scan.next();
        String b = scan.next();
        scan.close();

        // Verifica se sao anagramas e exibe o resultado
        boolean ret = isAnagram(a, b);
        System.out.println(ret ? "Anagrams" : "Not Anagrams");
    }
}
