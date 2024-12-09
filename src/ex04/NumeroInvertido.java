/*
    04 - Crie um programa que leia um número inteiro e exiba o número invertido.
    Exemplo: se o usuário digitar 1234, o programa deve exibir 4321.
 */

package ex04;
import java.util.Scanner;

public class NumeroInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();
        inverterNumero(numero);
    }

    public static void inverterNumero(int numero) {
        String numeroInvertido = new StringBuilder(String.valueOf(numero)).reverse().toString();

        System.out.println(numero + " -> " + numeroInvertido);
    }
}
