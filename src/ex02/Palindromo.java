/*
    02 - Crie um programa que leia uma palavra e verifique se ela é um palíndromo
    (se pode ser lida da mesma forma de trás para frente). Ignore
    diferenças entre maiúsculas e minúsculas.
 */

package ex02;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma palavra: ");
        String word = scanner.nextLine();
        reversedString(word);
    }

    private static void reversedString(String word) {
        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println(word + " -> " + reversed);

        if (word.equals(reversed)) {
            System.out.println("'" + word + "' é um palindromo" );
        } else {
            System.out.println("'" + word + "' NÃO é um palindromo" );
        }
    }
}