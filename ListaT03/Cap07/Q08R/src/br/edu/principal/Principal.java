package br.edu.principal;

import java.util.Scanner;

// cap 7 q8
public class Principal {
	public static void main(String[] args) {
		
		// mat 1 = maiores q 30, mat2 = diferentes de 30
		
		Scanner read = new Scanner(System.in);
		
		int[][] mat1 = new int[6][4], mat2 = new int[6][4];
		int i, j, qtde = 0;
		
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 4; j++) {
				System.out.print("Numero inteiro para a posição [" + (i+1) + "][" + (j+1) + "]: ");
				mat1[i][j] = read.nextInt();
			}
		}
		
		
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 4; j++) {
				if (mat1[i][j] > 30) {
					qtde = qtde + 1;
				}
			}
		}
		
		for (i = 0; i < 6; i++) {
			for (j = 0; j<4; j++) {
				if (mat1[i][j] == 30) {
					mat2[i][j] = 0;
					
				} else {
					mat2[i][j] = mat1[i][j];
				}
			}
		}
		
		System.out.println();
		System.out.println("Toda a matriz (sem o numero 30): ");
		System.out.println();
		
		for (i = 0; i < 6; i++) {
			for (j = 0; j < 4; j++) {
				System.out.println("posição [" + (i+1) + "][" + (j+1) + "] = " + mat2[i][j]);
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de números maiores que 30: " + qtde);
		
	}
}
