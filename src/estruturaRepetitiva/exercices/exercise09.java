package estruturaRepetitiva.exercices;

/*
Ler um número inteiro N e calcular todos os seus divisores
*/

import java.util.Scanner;

public class exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int n = sc.nextInt();

        System.out.println("Divisores: ");
        for (int i = 1; i <= 6; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
