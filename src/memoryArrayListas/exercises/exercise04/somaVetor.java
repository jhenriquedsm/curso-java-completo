package memoryArrayListas.exercises.exercise04;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
*/

public class somaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }
        double avg = sum / numbers.length;

        System.out.print("VALORES = ");
        for (int i = 0; i < numbers.length; i++){
            System.out.printf("%.1f  ", numbers[i]);
        }
        System.out.printf("\nSOMA = %.2f%n", sum);
        System.out.printf("MÉDIA = %.2f%n", avg);

        sc.close();
    }
}
