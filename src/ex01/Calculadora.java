/*
    01 - Escreva um programa que peça dois números e um operador (+, -, *, /).
    Realize a operação indicada e exiba o resultado.
 */

package ex01;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        float num1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        float num2 = scanner.nextInt();

        System.out.println("Escolha o operador (+ - / *): ");
        char operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.print(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Erro! Não é possível dividir por zero.");
                    break;
                }

                System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case '*':
                System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }
    }
}
