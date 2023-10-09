package br.edu.principal;
import java.util.*;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[9];
        int i, j, cont;

        // Preencher o vetor com nove números inteiros
        for (i = 0; i < 9; i++) {
            System.out.print("Digite o número na posição " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        System.out.println("Números primos no vetor e suas posições:");

        for (i = 0; i < 9; i++) {
            cont = 0;

            // Verificar se o número em num[i] é primo
            for (j = 2; j <= num[i] / 2; j++) {
                if (num[i] % j == 0) {
                    cont++;
                    break;
                }
            }

            if (cont == 0 && num[i] > 1) {
                System.out.println("Número Primo: " + num[i] + ", Posição: " + (i + 1));
            }
        }
    }
}
