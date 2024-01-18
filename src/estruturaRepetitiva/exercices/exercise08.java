package estruturaRepetitiva.exercices;

/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
*/

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número inteiro: ");
        int n = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= n; i++){
            fatorial *= i;
        }

        System.out.println("O fatorial de " + n + " é igual a " + fatorial);
        sc.close();
    }
}
