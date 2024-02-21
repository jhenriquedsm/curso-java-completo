package memoryArrayListas.exercises.exercise12.application;

import memoryArrayListas.exercises.exercise12.entities.Student;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). 
*/

public class approved {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();
        Student students[] = new Student[n];

        for (int i = 0; i < students.length; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %dº aluno: \n", i + 1);
            sc.nextLine();
            String name = sc.nextLine();
            double note1 = sc.nextDouble();
            double note2 = sc.nextDouble();
            Student student = new Student(name, note1, note2);
            students[i] = student;
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < students.length; i++){
            if (students[i].avg() >= 6.0){
                System.out.println(students[i].getName());
            }
        }

        sc.close();
    }
}
