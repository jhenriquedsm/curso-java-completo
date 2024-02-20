package memoryArrayListas.exercises.exercise07;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero)
*/

public class highest_position {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double numbers[] = new double[n];
        double highest_value = 0;
        int position = 0;

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Digite um número: ");
            int number = sc.nextInt();
            numbers[i] = number;
                if (highest_value < number){
                    highest_value = number;
                    position = i;
                }
        }

        System.out.printf("\nMAIOR VALOR = %.2f%n", highest_value);
        System.out.printf("POSIÇÃO DO MAIOR VALOR = %d", position);

        sc.close();
    }
}
