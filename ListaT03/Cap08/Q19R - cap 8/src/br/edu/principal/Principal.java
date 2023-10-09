package br.edu.principal;

import java.util.Scanner;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[6][6];

        // Ler os valores para cada posição da matriz
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Informe o valor para a posição [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Chamar a sub-rotina para multiplicar as linhas
        multiplicarLinhasMatriz(matriz);

        System.out.println("\nMatriz informada após multiplicação da diagonal principal:");

        // Mostrar a matriz após a leitura e a multiplicação
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println("posição [" + (i + 1) + "][" + (j + 1) +"] = " +matriz[i][j]);
            }
            System.out.println();
        }
    }

    // Sub-rotina para multiplicar as linhas pelo elemento da diagonal principal daquela linha
    public static void multiplicarLinhasMatriz(int[][] matriz) {
        for (int i = 0; i < 6; i++) {
            int elementoDiagonal = matriz[i][i]; // Elemento da diagonal principal da linha
            for (int j = 0; j < 6; j++) {
                matriz[i][j] *= elementoDiagonal; // Multiplica a linha pelo elemento da diagonal
            }
        }
    }
}