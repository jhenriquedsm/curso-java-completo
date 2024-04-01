package memoryArrayListas.exercises.exercise14.application;

/*
A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.

Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel de
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas as ocupaçãoes do pensionato, por ordem de quarto.
*/

import memoryArrayListas.exercises.exercise14.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class pensionato {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student rent[] = new Student[10];
        int room = 0;

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++){
            sc.nextLine();
            System.out.println("\nAluguel #" + (i + 1) + ":");
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            do {
                System.out.print("Room: ");
                room = sc.nextInt();

                if (room < 0 || room > 10){
                    System.out.println("Erro. Informe um valor entre 0 e 9!");
                } else if (room < 0 || room > rent.length || rent[room - 1] != null){
                    System.out.println("Quarto ocupado!");
                }
            } while (room < 0 || room > rent.length || rent[room - 1] != null);

            Student student = new Student(name, email);
            rent[room - 1] = student;
        }

        System.out.println("\nQuartos ocupados: ");
        for (int i = 0; i < rent.length; i++){
            if (rent[i] != null){
                System.out.printf("%d: %s, %s\n", (i + 1), rent[i].getName(), rent[i].getEmail());
            }
        }

        sc.close();
    }
}
