package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int num1 = 67;
		int num2 = 32;
		
		double E1 = Math.pow(num1, num2);
		double E2 = Math.pow(num2, num1);
		
		System.out.println("O resultado do primeiro número elevado ao segundo é de: " + E1);
		System.out.println("O resultado do segundo número elevado ao primeiro é de: " + E2);
		

	}

}
