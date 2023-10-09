package br.edu.principal;

import java.util.Scanner;

//cap 7 q21

public class Principal {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int trc, tl = 0, tc = 0, i = 0, j = 0, dim = 100;
		do {
			
			System.out.print("Tamanho da matriz: ");
			
			tl = read.nextInt();
			tc = tl;
			
		} while(tl > dim);
		
		int[][] mat = new int[tc][tl];
		
		for (i = 0; i < tl; i++) {
			for (j = 0; j < tc; j++) {
				
				System.out.print("Número para as posicão ");
				System.out.println("[" + (i+1) + "][" + (j+1) + "]: ");
				
				mat[i][j] = read.nextInt();
				
			}
		}
		
		int somaDiagonalSecundaria = 0;

        for (i = 0, j = tl - 1; i < tl; i++, j--) {
            somaDiagonalSecundaria += mat[i][j];
        }

        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);
    }
}