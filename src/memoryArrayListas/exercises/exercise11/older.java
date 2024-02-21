package memoryArrayListas.exercises.exercise11;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
*/

public class older {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas vai digitar? ");
        int n = sc.nextInt();
        String names[] = new String[n];
        int ages[] = new int[n];
        int olderAge = 0;
        int position = 0;

        for(int i = 0; i < n; i++){
            System.out.printf("Dados da %dª pessoa\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            names[i] = name;
            ages[i] = age;
            if (age > olderAge){
                olderAge = age;
                position = i;
            }
        }
        System.out.printf("\nPESSOA MAIS VELHA: %s", names[position]);
        System.out.printf("\nIDADE DA PESSOA MAIS VELHA: %d", olderAge);

        sc.close();
    }
}
