package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


        System.out.println("Quantas horas de trabalho você tem?");
        double horas_t= scan.nextDouble();

        System.out.println("Qual o seu salário mínimo?");
        double vlr_sal_min= scan.nextDouble();


        double vlr_hora_t=  vlr_sal_min / 2;


        double vlr_sal_bru = vlr_hora_t * horas_t;


        double imp= vlr_sal_bru * 3 / 100;


        double vlr_sal_liq = vlr_sal_bru - imp;
        System.out.println("Este é o seu salário líquido: " + vlr_sal_liq);

	}

}
