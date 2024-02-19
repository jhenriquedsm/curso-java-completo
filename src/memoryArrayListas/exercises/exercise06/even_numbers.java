package memoryArrayListas.exercises.exercise06;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.
*/

public class even_numbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int even_numbers[] = new int[n];
        int even = 0;

        for (int i = 0; i < even_numbers.length; i++){
            System.out.print("Digite um número: ");
            int number = sc.nextInt();
                if (number % 2 == 0){
                    even++;
                }
            even_numbers[i] = number;
        }

        System.out.println("NÚMEROS PARES:");
        for (int i = 0; i < even_numbers.length; i++){
            if (even_numbers[i] % 2 == 0){
                System.out.printf("%d ", even_numbers[i]);
            }
        }
        System.out.printf("\nQUANTIDADE DE PARES = %d", even);

        sc.close();
    }
}
