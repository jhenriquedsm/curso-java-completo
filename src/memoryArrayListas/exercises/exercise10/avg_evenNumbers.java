package memoryArrayListas.exercises.exercise10;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"
*/

public class avg_evenNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        int evenNumbers = 0;
        int evenSum = 0;

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Digite um número: ");
            int number = sc.nextInt();
            numbers[i] = number;
                if (number % 2 == 0){
                    evenNumbers++;
                    evenSum += number;
                }
        }

        double avg = (double) evenSum /evenNumbers;

        if (evenNumbers > 0){
            System.out.printf("MÉDIA DOS PARES = %.1f%n", avg);
        } else {
            System.out.println("NENHUM NÚMERO PAR");
        }

        sc.close();
    }
}
