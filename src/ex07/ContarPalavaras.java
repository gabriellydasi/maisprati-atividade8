/*
    07 - Escreva um programa que leia uma frase e conte o número de palavras nela.
    Considere que as palavras estão separadas por espaços em branco.
 */

package ex07;

import java.util.Scanner;

public class ContarPalavaras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = sc.nextLine();
        contarPalavras(frase);
    }

    private static void contarPalavras(String frase) {
        String[] palavras = frase.trim().split("\\s+");
        int countPalavras = palavras.length;

        System.out.println("'" + frase.trim() + "'");
        System.out.println("Total de palavras = " + countPalavras);
    }
}
