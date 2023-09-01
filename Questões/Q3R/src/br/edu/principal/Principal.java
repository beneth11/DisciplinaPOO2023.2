package br.edu.principal;

import java.util.*;

public class Principal {
	public static void main(String[] args) {
		// 	QUESTAO 3
		Scanner sc = new Scanner(System.in);
		
		// declarar as variáveirs
		int nota1, nota2, nota3, peso1, peso2, peso3, media;
		
		// leitura
		System.out.print("Nota 1: ");
		nota1 = sc.nextInt();
		System.out.print("Peso 1: ");
		peso1 = sc.nextInt();
		
		System.out.print("Nota 2: ");
		nota2 = sc.nextInt();
		System.out.print("Peso 2: ");
		peso2 = sc.nextInt();
		
		System.out.print("Nota 3: ");
		nota3 = sc.nextInt();
		System.out.print("Peso 3: ");
		peso3 = sc.nextInt();

		// cálculo
		media = (peso1 * nota1 + peso2 * nota2 + peso3 * nota3) / (peso1 + peso2 + peso3);
		
		System.out.print("Media: ");
		System.out.println(media);
	}
}