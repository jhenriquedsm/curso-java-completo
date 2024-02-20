package memoryArrayListas.exercises.exercise09;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
*/

public class below_average {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();;
        double numbers[] = new double[n];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Digite um número: ");
            double number = sc.nextFloat();
            sum += number;
            numbers[i] = number;
        }

        double avg = sum / numbers.length;

        System.out.printf("\nMÉDIA DO VETOR = %.3f%n", avg);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] < avg){
                System.out.printf("%.1f%n", numbers[i]);
            }
        }

        sc.close();
    }
}
