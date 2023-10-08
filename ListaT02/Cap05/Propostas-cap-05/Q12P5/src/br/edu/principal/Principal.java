package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, par = 0, impar = 0, num;
		
		System.out.print("Digite 10 números: ");
		num = sc.nextInt();
		
		
		if (num % 2 == 0) {
			par = 1;
		} else {
			impar = 1;
		}
		while (i < 10) {
			int ProxNum = sc.nextInt();
			i = i + 1;
			if (ProxNum % 2 == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}
		}
		
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números impares: " + impar);
			
		

	}

}