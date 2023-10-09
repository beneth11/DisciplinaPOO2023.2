package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int[][] mat = new int[10][10];
		int i, j, trc;
		
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				System.out.print("Numero inteiro para a posição [" + (i + 1) + "][" + (j + 1) + "]: ");
				mat[i][j] = read.nextInt();
			}
		}
		
		for (i = 0; i < 10; i++) {
			trc = mat[1][i];
			mat[1][i] = mat[7][i];
			mat[7][i] = trc;
		}
		
		for (i = 0; i < 10; i++) {
			trc = mat[i][4];
			mat[i][3] = mat[i][9];
			mat[i][9] = trc;
		}
		
		j = 9;
		
		for (i = 0; i < 10; i++) {
			trc = mat[i][i];
			mat[i][i] = mat[i][j];
			mat[i][j] = trc;
		}
		
		for (j = 0; j < 10; j++) {
			trc = mat[4][j];
			mat[4][j] = mat[j][9];
			mat[j][9] = trc;
		}
		
		System.out.println("Matriz: ");
		
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				
				System.out.println("posição [" + (i + 1) + "][" + (j + 1) +"]");
				System.out.println(mat[i][j]);
			
			}
		}
	}

}
