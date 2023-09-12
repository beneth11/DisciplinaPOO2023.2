package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int salario =  1500;
		System.out.println("O seu salário normal é de: " + salario + " reais.");
		int gratificacao = salario * 5/100;
		System.out.println("A gratificação que você recebe é de: " + gratificacao + " reais.");
		int imposto = salario * 7/100;
		System.out.println("O quanto de imposto que você paga é de: " + imposto + " reais.");
		int salariofinal = salario + gratificacao - imposto;
		System.out.println("O seu salário líquido é de: " + salariofinal + " reais.");
		

	}

}
