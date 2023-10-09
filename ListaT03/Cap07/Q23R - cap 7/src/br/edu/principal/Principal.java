package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] vendas = new int[5][4]; // Matriz para armazenar as vendas (5 vendedores x 4 semanas)

        // Receber as vendas semanais
        for (int i = 0; i < 5; i++) {
            System.out.println("Vendedor " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Informe as vendas da semana " + (j + 1) + ": ");
                vendas[i][j] = scanner.nextInt();
            }
        }

        // Calcular o total de vendas do mês para cada vendedor
        int[] tot_ven = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                tot_ven[i] += vendas[i][j];
            }
        }

        // Calcular o total de vendas de cada semana (todos os vendedores juntos)
        int[] tot_sem = new int[4];
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 5; i++) {
                tot_sem[j] += vendas[i][j];
            }
        }

        // Calcular o total geral de vendas no mês
        int tot_geral = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                tot_geral += vendas[i][j];
            }
        }

        // Mostrar os resultados
        for (int i = 0; i < 5; i++) {
            System.out.println("Total de vendas do Vendedor " + (i + 1) + ": " + tot_ven[i]);
        }

        for (int j = 0; j < 4; j++) {
            System.out.println("Total de vendas da Semana " + (j + 1) + ": " + tot_sem[j]);
        }

        System.out.println("Total geral de vendas no mês: " + tot_geral);
    }
}