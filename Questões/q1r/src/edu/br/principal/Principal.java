package edu.br.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    // QUESTAO 01
	    
	    // declarar variáveis
	    int n1, n2, n3, n4; 
	    
	    // leitura
	    System.out.print("Valor n1: ");
	    n1 = sc.nextInt();
	    
	    System.out.print("Valor n2: ");
	    n2 = sc.nextInt();
	    
	    System.out.print("Valor n3: ");
	    n3 = sc.nextInt();
	    
	    System.out.print("Valor n4: ");
	    n4 = sc.nextInt();
	    
	    // soma
	    System.out.print("A soma de todos esses valores foi: ");
	    System.out.println(n1 + n2 + n3 + n4);
	    
	}
}