/*
    06 - Crie um jogo em que o programa escolhe um número entre 1 e 50, e o/a usuário/a
    deve adivinhar. O programa informa apenas se o palpite está certo ou
    errado. O jogo termina quando o número é adivinhado.
 */

package ex06;
import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        int numeroSorteado = gerarNumeroEntre1e50();
        int palpiteUsuario = 0;

        verificarPalpiteUsuario(palpiteUsuario, numeroSorteado);
    }

    private static int gerarNumeroEntre1e50() {
        Random random = new Random();
        return random.nextInt(50) + 1; // Gera numero entre 1 e 50
    }

    private static void verificarPalpiteUsuario(int palpiteUsuario, int numeroSorteado) {
        while (palpiteUsuario != numeroSorteado) {
            System.out.print("Digite seu palpite (entre 1 e 50): ");
            Scanner scanner = new Scanner(System.in);
            palpiteUsuario = scanner.nextInt();

            if (palpiteUsuario == numeroSorteado) {
                System.out.println("Parabéns! Você acertou o número.");
            } else {
                System.out.println("Errou! Tente novamente.");
            }
        }
    }
}
