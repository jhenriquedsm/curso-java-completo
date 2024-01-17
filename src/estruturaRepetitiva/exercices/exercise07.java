package estruturaRepetitiva.exercices;

/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

import java.util.Scanner;

public class exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double divisao = 0;

            if (b == 0){
                System.out.println("divisao impossivel");
            } else {
                divisao = a / b;
            }

            System.out.println(divisao);
        }
        sc.close();
    }
}
