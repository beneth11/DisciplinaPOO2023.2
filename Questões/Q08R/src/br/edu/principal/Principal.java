package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.println("Coloque o valor do depósito: ");
        double dep= scan.nextDouble();


        System.out.println("Coloque o valor da taxa: ");
        double taxa= scan.nextDouble();


        double rend = dep * taxa/100;


        double totalrenda= dep + rend;


        System.out.println("A sua renda é de: " +rend);


        System.out.println("A sua renda total é de: " +totalrenda);
	}

}