package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nome = new String[5];
        double[] sal = new double[5];
        int[] quant = new int[5];

        // Preencher os vetores com os nomes, salários e quantidade de anos de serviço
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            nome[i] = scanner.next();
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            sal[i] = scanner.nextDouble();
            System.out.print("Digite a quantidade de anos de serviço do funcionário " + (i + 1) + ": ");
            quant[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Funcionários com aumento de salário:");

        // Calcular e mostrar os novos salários dos funcionários com aumento
        for (int i = 0; i < 5; i++) {
            if (sal[i] < 800.0 || quant[i] > 5) {
                double aumento;
                if (sal[i] < 800.0 && quant[i] > 5) {
                    aumento = sal[i] * 0.35; // Aumento de 35%
                } else if (quant[i] > 5) {
                    aumento = sal[i] * 0.25; // Aumento de 25%
                } else {
                    aumento = sal[i] * 0.15; // Aumento de 15%
                }
                double novoSalario = sal[i] + aumento;
                System.out.println("Nome: " + nome[i] + ", Novo Salário: " + novoSalario);
            }
        }
    }
}

