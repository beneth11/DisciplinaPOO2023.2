package br.edu.principal;

import java.util.*;

public class Principal {
	public static void main(String[] args) {
		// QUESTAO 5
	    Scanner sc = new Scanner(System.in);
		
		// declarar variáveis e somar
		int sal, perc, aumento, novosal;
		
		// leitura (scanner)
		System.out.print("salário: ");
		sal = sc.nextInt();
		
		System.out.print("percentual: ");
		perc = sc.nextInt();
		
		// escrever
		
		aumento = sal * perc/100;
		System.out.print("aumento: ");
		System.out.println(aumento);
		
		novosal = sal + aumento;
		System.out.print("novo salário: ");
		System.out.println(novosal);
		
		// FIM
	}
}
