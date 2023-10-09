package br.edu.principal;

import java.util.Scanner;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[5];
        int[] vet_result1 = new int[10];
        int[] vet_result2 = new int[10];
        int poslivre1 = 0;
        int poslivre2 = 0;
        int soma;

        // Preencher o primeiro vetor com dez números inteiros
        
        System.out.println("Vetor 1: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vet1[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("Vetor 1: ");
        // Preencher o segundo vetor com cinco números inteiros
        for (int j = 0; j < 5; j++) {
            System.out.print("Digite o elemento " + (j + 1) + ": ");
            vet2[j] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            soma = vet1[i];
            for (int j = 0; j < 5; j++) {
                soma += vet2[j];
            }
            if (soma % 2 == 0) {
                if (poslivre1 < 10) {
                    vet_result1[poslivre1] = soma;
                    poslivre1++;
                }
            } else {
                if (poslivre2 < 10) {
                    vet_result2[poslivre2] = soma;
                    poslivre2++;
                }
            }
        }
        
        // Mostrar o vetor resultante para números pares
        
        System.out.println();
        System.out.println("Pares: ");
        for (int i = 0; i < poslivre1; i++) {
            System.out.print(vet_result1[i] + " ");
        }

        // Mostrar o vetor resultante para números ímpares
        
        System.out.println();
        System.out.println("Impares: ");
        for (int i = 0; i < poslivre2; i++) {
            System.out.print(vet_result2[i] + " ");
        }
    }
}
