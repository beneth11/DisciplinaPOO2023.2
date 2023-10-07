package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int salario;
		double novosalario, percentual; 
		
		int x = 2005;
		int anoatual = 2023;
		
		System.out.println(anoatual);
		salario = 1000;
		percentual = 1.5/100;
		novosalario = salario + percentual + salario;
		
		while (x < 2007 && x < 2023) {
			x = x+1;
			percentual = 2*percentual;
			novosalario = novosalario + percentual * novosalario;
			System.out.println(novosalario);
		}

	}

}
