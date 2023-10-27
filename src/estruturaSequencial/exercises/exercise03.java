package estruturaSequencial.exercises;

import java.util.Scanner;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
public class exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, diferenca;
        System.out.print("Insira o valor de A: ");
        A = sc.nextInt();
        System.out.print("Insira o valor de B: ");
        B = sc.nextInt();
        System.out.print("Insira o valor de C: ");
        C = sc.nextInt();
        System.out.print("Insira o valor de D: ");
        D = sc.nextInt();

        diferenca = A * B - C * D;
        System.out.println("DIFERENÇA: " + diferenca);
    }
}
