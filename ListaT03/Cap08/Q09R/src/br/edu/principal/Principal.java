package br.edu.principal;
import java.util.*;

public class Principal {
	
	public static void maior_menor(String a){
		Scanner s = new Scanner(System.in);
		
		int i, num, maior = 0, menor = 0;
		
		for (i = 1; i <= 5; i++) {
			System.out.print("Digite o " + i + "° numero: ");
			num = s.nextInt();
			
			if (i == 1) {
				maior = num;
				menor = num;
			} else {
				if (num > maior) {
					maior = num;
				}
				if (num < menor) {
					menor = num;
				}
			}
			
		}//fim for
		
		System.out.println("O maior numero digitado foi: "+ maior);
		System.out.println("O menor numero digitado foi: "+ menor);
		
	}//fim sub
	
	public static void main (String[] args) {
		maior_menor("a");
	}//fim main
}
