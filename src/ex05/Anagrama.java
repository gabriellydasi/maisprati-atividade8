/*
    05 - Escreva um programa que receba duas palavras e determine se elas são anagramas (se possuem
    as mesmas letras, mas em ordem diferente).
    Exemplo: "amor" e "roma".
 */

package ex05;
import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {
        String word1 = "roma";
        String word2 = "amor";

        verificarAnagramas(word1, word2);
    }

    private static void verificarAnagramas(String word1, String word2) {
        if (word1.length() != word2.length()) {
            System.out.println("'" + word1 + "'" + " e " + "'" + word2 + "'" + " NÃO são anagramas.");
            return;
        }

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("'" + word1 + "'" + " e " + "'" + word2 + "'" + " são anagramas.");
        } else {
            System.out.println("'" + word1 + "'" + " e " + "'" + word2 + "'" + " NÃO são anagramas.");
        }
    }
}
