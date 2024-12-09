/*
    03 - Implemente um programa que calcule e exiba os primeiros 'n' numeros da
    sequência de Fibonacci. 'n' deve ser fornecido pelo/a usuário/a.
 */

package ex03;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valor inteiro e maior que zero: ");
        int n = scanner.nextInt();
        sequenciaFibonacci(n);
    }

    private static void sequenciaFibonacci(int n) {
        ArrayList<Integer> fibonnaci = new ArrayList<>();
        fibonnaci.add(0); // Primeiro elemento
        fibonnaci.add(1); // Segundo elemento

        if (n <= 0) {
            System.out.println("O número precisa ser maior que zero!");
        } else if (n == 1) {
            System.out.println("[" + fibonnaci.get(0) + "]");
        } else {
            // Começa a partir do terceiro elemento (indice = 2) porque os
            // dois primeiros já foram definidos acima
            for (int i = 2; i < n; i++) {
                // Calcula o próximo número como a soma dos dois anteriores
                int next = fibonnaci.get(i - 1) + fibonnaci.get(i - 2);
                fibonnaci.add(next);
            }
            System.out.println(fibonnaci);
        }
    }

}