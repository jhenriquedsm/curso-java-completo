package estruturaRepetitiva;

import java.util.Scanner;

public class estruturaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++){
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        for (int i = 0; i < 5; i++){
            System.out.println("Valor de i: " + i);
        }
        sc.close();
    }
}
