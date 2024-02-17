package memoryArrayListas.exercises.exercise05.application;

import memoryArrayListas.exercises.exercise05.entities.Person;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
*/

public class height {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int p = sc.nextInt();
        Person[] persons = new Person[p];
        double sumHeigth = 0;
        double quantAgeLessThan16 = 0;

        for (int i = 0; i < persons.length; i++){
            sc.nextLine();
            System.out.printf("Dados da %dª pessoa:", i + 1);
            System.out.print("\nNome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
                if (age < 16){
                    quantAgeLessThan16++;
                }
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            persons[i] = new Person(name, age, height);
            sumHeigth += persons[i].getHeight();
        }
        double avgHeight =  sumHeigth / persons.length;
        double porcent = ((double)quantAgeLessThan16 / p) * 100.0;

        System.out.printf("\nAltura média: %.2f%n", avgHeight);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcent);
        for (int i = 0; i < persons.length; i++){
            if (persons[i].getAge() < 16){
                System.out.println(persons[i].getName());
            }
        }
        sc.close();
    }
}
