package br.edu.principal;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, altura, area;
		
		System.out.print("Valor da base: ");
		base = sc.nextInt();
		while (base <= 0) {
			System.out.println("Número inválido, tente por um número maior do que zero.");
			System.out.print("Valor da base: ");
			base = sc.nextInt();
			
		}
		System.out.println(base);
		
		System.out.print("Quanto de altura: ");
		altura = sc.nextInt();
		while (altura <= 0) {
			System.out.println("Número inválido, tente por um número maior do que zero.");
			System.out.print("Quanto de altura: ");
			altura = sc.nextInt();
		}
		
		System.out.println(altura);
		
		area = base * altura / 2;
		System.out.println("A área do triângulo é: " + area);
		

	}

}
