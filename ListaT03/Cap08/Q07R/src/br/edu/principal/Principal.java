package br.edu.principal;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sal, salrec, imp;
		
		System.out.print("Qual o valor do seu salário?: ");
		sal = sc.nextInt();
		
		imp = sal * 10/100;
		salrec = sal + 50 - imp;
		
		System.out.println("Salário a receber: " + salrec);

	}

}
