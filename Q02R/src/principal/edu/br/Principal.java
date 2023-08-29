package principal.edu.br;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num1, num2, num3, média;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Digite a primeira nota: ");
		num1=scan.nextDouble();
		
		
		System.out.println("Digite a segunda nota: ");
		num2=scan.nextDouble();
		
		
		System.out.println("Digite a terceira nota: ");
		num3=scan.nextDouble();
		
		
		média = num1 + num2 + num3 / 3;
		
		
		System.out.println("A sua média é de "+média);
		

	}

}
