package edu.br.principal;

import java.util.*;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// QUESTAO 22
		
		// declarar váriaveis
		int vlr_sal, qtd_kw, vlr_kw, vlr_reais, desc, vlr_desc;
		
		// leitura
		System.out.print("Valor do salário: ");
		vlr_sal = sc.nextInt();
		
		System.out.print("Quantidade de quilowatts: ");
		qtd_kw = sc.nextInt();
		
		vlr_kw = vlr_sal / 5;
		vlr_reais =  vlr_kw * qtd_kw;
		desc = vlr_reais * 15 / 100;
		vlr_desc = vlr_reais - desc;
		
		// escritura
		
		System.out.print("Valor por quilowatts: ");
		System.out.println(vlr_kw);
		
		System.out.print("Valor em reais da residência: ");
		System.out.println(vlr_reais);
		
		System.out.print("Valor do desconto: ");
		System.out.println(vlr_desc);
	}
}