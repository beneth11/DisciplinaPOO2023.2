package principal.edu.br;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		double anoatual= 2023;
		System.out.println("O ano atual é " +anoatual);
		
		
		System.out.println("Digite o ano de seu nascimento: ");
		double anodenascimento= scan.nextDouble();
		
		
		double idadeatual= anoatual - anodenascimento;
		System.out.println("Você tem "+ idadeatual +" em 2023.");
		
		
		double idade2050= 2050 - anodenascimento;
		System.out.println("Você terá " + idade2050 +" em 2050.");
		
		
	}

}
