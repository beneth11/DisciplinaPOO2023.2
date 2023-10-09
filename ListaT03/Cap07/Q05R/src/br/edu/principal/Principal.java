package br.edu.principal;

import java.util.Scanner;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] mat = new double[4][7];
        double menor = 0;
        int l_menor = 0, col = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("Digite um número real para a posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                mat[i][j] = sc.nextInt();

                if (i == 0 && j == 0 || mat[i][j] < menor) {
                    menor = mat[i][j];
                    l_menor = i;
                }
            }
        }

        double maior = mat[l_menor][0];

        for (int j = 0; j < 7; j++) {
            if (mat[l_menor][j] > maior) {
                maior = mat[l_menor][j];
                col = j;
            }
        }

        System.out.println();
        System.out.println("MINMAX: " + maior);
        System.out.println("Localização: [" + (l_menor + 1) + "][" + (col + 1) + "]");
    }
}
