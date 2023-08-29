package principal.edu.br;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double degrau= 0.5;
		System.out.println("A altura do degrau é "+degrau + "m");
		
		System.out.println("Digite a altura que você deseja subir: ");
		double meta= sc.nextDouble();
		double qtddegraus= meta/degrau;
		System.out.println("Para você chegar na meta, você precisa subir "+qtddegraus + " degrais.");
		
		
		
		
	}

}
