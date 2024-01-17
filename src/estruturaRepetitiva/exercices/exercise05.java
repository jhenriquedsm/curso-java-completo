package estruturaRepetitiva.exercices;

import java.util.Scanner;

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/
public class exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira a quantidade de números a serem inseridos: ");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i ++){
            System.out.print("Insira o número: ");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}
