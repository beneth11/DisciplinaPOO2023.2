package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int preçofab = 3500;
		int porcdistribuidor = 5;
		int percimpostos = 2;
		int valordistribuidor = preçofab * porcdistribuidor / 100;
		int valorimposto = preçofab * percimpostos / 100;
		int preçofinal = preçofab + valordistribuidor + valorimposto;
		
		System.out.println("O valor que o distribuidor ganha é de: " + valordistribuidor + "$");
		System.out.println("O valor de imposto pago é de: " + valorimposto + "$");
		System.out.println("O preço final é de: " + preçofinal + "$");
		
		
		

	}

}
