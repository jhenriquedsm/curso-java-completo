package estruturaCondicional.exercises;

import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/
public class exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Insira um número inteiro: ");
        num = sc.nextInt();

        if(num < 0){
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
    }
}
