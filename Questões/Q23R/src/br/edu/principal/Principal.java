package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    // QUESTAO 23
	    
	    // declarar variáveis
	    double num, f, a; int i;
	    
	    // leitura
	    System.out.print("Insira um número: ");
	    num = sc.nextDouble();
	    System.out.println();
	    
	    i = (int)num;
	    f = num - i;
	    a = Math.round(num);
	    
	    System.out.print("Valor inteiro do número: ");
	    System.out.println(i);
	    
	    System.out.print("Valor fracionado do número: ");
	    System.out.println(f);
	    
	    System.out.print("Valor arredondado do número: ");
	    System.out.println(a);
	    
	}
}