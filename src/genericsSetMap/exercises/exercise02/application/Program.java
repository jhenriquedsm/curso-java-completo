package genericsSetMap.exercises.exercise02.application;

/*
Em um portal de cursos online, cada usuário possui um código único, representado por
um número inteiro.
Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
alunos repetidos em mais de um curso.
O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
quantidade total e alunos dele, conforme exemplo.
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();

        System.out.print("How many students for course A: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            Integer id = sc.nextInt();
            A.add(id);
        }

        System.out.print("How many students for course B: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            Integer id = sc.nextInt();
            B.add(id);
        }

        System.out.print("How many students for course C: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
            Integer id = sc.nextInt();
            C.add(id);
        }

        Set<Integer> total = new HashSet<>(A);
        total.addAll(B);
        total.addAll(C);

        System.out.println("Total students: " + total.size());

        sc.close();
    }
}